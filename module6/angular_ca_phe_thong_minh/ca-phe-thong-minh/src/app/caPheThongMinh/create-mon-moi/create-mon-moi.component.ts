import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {AngularFireStorage} from '@angular/fire/storage';
import {finalize} from 'rxjs/operators';
import {Dish} from '../../model/dish';
import {DishService} from '../../service/dish.service';
import {DishTypeService} from '../../service/dish-type.service';
import {Router} from '@angular/router';
import {DishType} from '../../model/dish-type';
import {formatDate} from '@angular/common';

@Component({
  selector: 'app-create-mon-moi',
  templateUrl: './create-mon-moi.component.html',
  styleUrls: ['./create-mon-moi.component.css']
})
export class CreateMonMoiComponent implements OnInit {
  dishTypeList: DishType[] = [];
  selectedImage: any = null;
  imgSrc: any;
  formDish: FormGroup;

  constructor(private dishService: DishService,
              private dishTypeService: DishTypeService,
              private router: Router,
              private storage: AngularFireStorage) {
  }

  ngOnInit(): void {
    this.getAllDishType();

    this.formDish = new FormGroup({
      id: new FormControl('', [Validators.required]),
      code: new FormControl('', [Validators.required, Validators.pattern('^LH-[0-9]{4}$')]),
      price: new FormControl('', [Validators.required]),
      name: new FormControl('', [Validators.required, Validators.min(0)]),
      image: new FormControl('', [Validators.required]),
      isDeleted: new FormControl('', [Validators.required]),
      dishType: new FormControl('', [Validators.required]),

    });
    }

  getAllDishType() {
    this.dishTypeService.getAll().subscribe(data => {
      this.dishTypeList = data;
    });
  }

  createDish() {
      const nameImg = this.getCurrentDateTime() + this.selectedImage.name;
      const fileRef = this.storage.ref(nameImg);
      this.storage.upload(nameImg, this.selectedImage).snapshotChanges().pipe(
        finalize(() => {
          fileRef.getDownloadURL().subscribe((url) => {
            console.log(url);
            let dish: Dish = this.formDish.value;
            dish.image = url;
            this.dishService.saveDish(dish).subscribe(value => {
              alert("Thành công!");
              this.router.navigateByUrl("/list-mon-moi").then()
            });
          });
        })
      ).subscribe();
  }

  private getCurrentDateTime(): string {
    return formatDate(new Date(),'dd-MM-YYY','en-US');
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
}
