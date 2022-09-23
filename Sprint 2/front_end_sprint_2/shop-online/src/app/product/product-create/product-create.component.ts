import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {TypeProduct} from '../../model/type-product';
import {Product} from '../../model/product';
import {TypeProductService} from '../../service/product/type-product.service';
import {formatDate} from '@angular/common';
import {ToastrService} from 'ngx-toastr';
import {ProductService} from '../../service/product/product.service';
import {Router} from '@angular/router';
import {finalize} from 'rxjs/operators';
import * as ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import {AngularFireStorage} from '@angular/fire/storage';
import {validate} from 'codelyzer/walkerFactory/walkerFn';

declare var $: any;

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})




export class ProductCreateComponent implements OnInit {
  formProduct: FormGroup;
  typeProductList: TypeProduct[] = [];
  selectedImage: any = null;
  imgSrc: any;
  product: Product[];
  public Editor = ClassicEditor;

  constructor(private typeProductService: TypeProductService,
              private toastrService: ToastrService,
              private storage: AngularFireStorage,
              private productService: ProductService,
              private router: Router) {
    this.getForm()
    this.getAllTypeProduct()
  }

  getForm() {
    this.formProduct = new FormGroup({
      id: new FormControl(),
      code: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(250),Validators.pattern("^((C)||(p)||(S))(-)[0-9]{1,}$")]),
      price: new FormControl('', [Validators.required, Validators.min(200), Validators.max(5000), Validators.pattern("^([0-9]){1,}$")]),
      name: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(255)]),
      // name: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(255), Validators.pattern(
      //   "^([A-ZÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẬẪÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴĐ]" +
      //   "[a-záàảãạăắằẳẵặâấầẩậẫéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]*( ))*" +
      //   "([A-ZÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẬẪÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴĐ]" +
      //   "[a-záàảãạăắằẳẵặâấầẩậẫéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]*)$")]),
      quantity: new FormControl('',[Validators.required,Validators.max(1000),Validators.min(1),Validators.pattern("^([0-9]){1,}$")]),
      image: new FormControl('', [Validators.required]),
      typeProduct: new FormControl('', [Validators.required]),
      isDeleted: new FormControl(),
      creationDate: new FormControl(),
      origin: new FormControl(),
      productDescription: new FormControl('',[Validators.required]),
      specification:new FormControl('',[Validators.required])
    });
  }

  ngOnInit(): void {
    this.getAllTypeProduct()
    this.getForm()
  }

  getAllTypeProduct() {
    this.typeProductService.getAll().subscribe(data => {
      this.typeProductList = data;
    }, error => {

    }, () => {

    });

  }


  createProduct() {
    if (this.formProduct.valid) {
      const nameImg = this.getCurrentDateTime() + this.selectedImage.name;
      const fileRef = this.storage.ref(nameImg);
      this.storage.upload(nameImg, this.selectedImage).snapshotChanges().pipe(
        finalize(() => {
          fileRef.getDownloadURL().subscribe((url) => {
              let product: Product = this.formProduct.value;
              product.image = url;

              this.productService.saveProduct(product).subscribe(value => {
                  this.toastrService.success("Thành Công", "Thêm Mới")
                  this.router.navigateByUrl("/product-list")
                },
                error => {

                  if (error.error.field === "code") {
                    if (error.error.defaultMessage == "codeExists") {
                      this.formProduct.controls.code.setErrors({'codeExists': true});
                    }
                  }
                });
            }
          );
        })
      ).subscribe();
    } else {
      this.toastrService.error("Bạn nhập chưa đầy đủ hoặc không chính xác. Vui lòng nhập lại")
    }
  }


  private getCurrentDateTime(): string {
    return formatDate(new Date(), 'dd-MM-YYY', 'en-US');
  }

  showPreview(event: any) {
    if (event.target.files && event.target.files[0]) {
      const reader = new FileReader();
      reader.onload = (o: any) => this.imgSrc = o.target.result;
      reader.readAsDataURL(event.target.files[0]);
      this.selectedImage = event.target.files[0];
      document.getElementById('img').style.display = 'block';
    } else {
      this.imgSrc = '';
      this.selectedImage = null;
    }
  }

  resetForm() {
    this.formProduct.reset()
    this.getForm()
    document.getElementById("img").style.display = "none";
    document.getElementById("image").style.display = "none";
    const check: string = document.getElementById("opt").getAttribute("selected");
    if (check != "true") {
      document.getElementById("opt").setAttribute("selected", "true");
      document.getElementById("opt").setAttribute("disabled", "true");
    } else {
      document.getElementById("opt").removeAttribute("selected");
      document.getElementById("opt").removeAttribute("disabled");

      document.getElementById("opt").setAttribute("selected", "true");
      document.getElementById("opt").setAttribute("disabled", "true");
    }
    document.getElementById('img').style.display = 'none'
  }

  checkErrorSpecifications() {
    let dataToggle = $('[data-toggle="specifications"]');
    if (this.formProduct.controls.specifications.hasError('required')) {
      dataToggle.attr('data-content', 'Thông số kỹ thuật không được để trống.');
      setTimeout(() => {
        dataToggle.popover('hide');
      }, 2000)
      dataToggle.popover('show');
    } else {
      dataToggle.popover('hide');
    }
  }

  checkErrorDescription() {
    let dataToggle = $('[data-toggle="description"]');
    if (this.formProduct.controls.description.hasError('required')) {
      dataToggle.attr('data-content', 'Mô tả sản phẩm không được để trống.');
      setTimeout(() => {
        dataToggle.popover('hide');
      }, 2000)
      dataToggle.popover('show');
    } else {
      dataToggle.popover('hide');
    }
  }
}
