import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  categories: Category[] = [];

  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });

  constructor(private productService: ProductService,
              private categoryService: CategoryService,
              private router: Router) {
  }

  ngOnInit() {
    this.getAll();
  }

  submit() {
    const product = this.productForm.value;
    this.productService.saveProduct(product).subscribe(()=>{
      this.productForm.reset();
      this.router.navigateByUrl("/product/list").then()
      alert("thành công")
    },
      error => {
      console.log(error)
      });
  }
  getAll() {
    this.categoryService.getAll().subscribe(categories => {
      this.categories = categories;
    });
  }
}


