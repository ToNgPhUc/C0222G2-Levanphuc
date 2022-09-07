import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup,} from '@angular/forms';
import {Dish} from '../../model/dish';
import {DishType} from '../../model/dish-type';
import {DishService} from '../../service/dish.service';
import {DishTypeService} from '../../service/dish-type.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {finalize} from 'rxjs/operators';
import {formatDate} from '@angular/common';
import {AngularFireStorage} from '@angular/fire/storage';

@Component({
  selector: 'app-edit-mon-moi',
  templateUrl: './edit-mon-moi.component.html',
  styleUrls: ['./edit-mon-moi.component.css']
})
export class EditMonMoiComponent implements OnInit {
  formDish: FormGroup;
  id: number;
  dish: Dish;
  dishTypeList: DishType[] = [];
  selectedImage: any = null;
  imgSrc: any;

  constructor(private dishService: DishService,
              private dishTypeService: DishTypeService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private storage: AngularFireStorage) {

    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getDish(this.id);

    });
  }

  ngOnInit(): void {
    this.getAllDishType();

  }

  getAllDishType() {
    this.dishTypeService.getAll().subscribe((data) => {
      this.dishTypeList = data;
    });
  }

  private getDish(id: number) {
    return this.dishService.findById(id).subscribe(data => {
      this.dish = data;
      this.formDish = new FormGroup({
        id: new FormControl(this.dish.id),
        code: new FormControl(this.dish.code),
        price: new FormControl(this.dish.price),
        name: new FormControl(this.dish.name),
        image: new FormControl(this.dish.image),
        isDeleted: new FormControl(this.dish.isDeleted),
        dishType: new FormControl(this.dish.dishType.name),

      });
    });
  }

  EditDish(id: number) {
    const nameImg = this.getCurrentDateTime() + this.selectedImage.name;
    const fileRef = this.storage.ref(nameImg);
    this.storage.upload(nameImg, this.selectedImage).snapshotChanges().pipe(
      finalize(() => {
        fileRef.getDownloadURL().subscribe((url) => {
          console.log(url);
          let dish: Dish = this.formDish.value;
          dish.image = url;
          this.dishService.editDish(id, dish).subscribe((data) => {
              alert('thành công');
              this.router.navigateByUrl('/list-mon-moi').then();
            },
            error => {
              console.log(error);
            });
        });
      })
    ).subscribe();
  }

  showPreview(event: any) {
    if (event.target.files && event.target.files[0]) {
      const reader = new FileReader();
      reader.onload = (o: any) => this.imgSrc = o.target.result;
      reader.readAsDataURL(event.target.files[0]);
      this.selectedImage = event.target.files[0];
    } else {
      this.imgSrc = '';
      this.selectedImage = null;
    }
  }

  private getCurrentDateTime(): string {
    return formatDate(new Date(), 'dd-MM-YYY', 'en-US');
  }
}
