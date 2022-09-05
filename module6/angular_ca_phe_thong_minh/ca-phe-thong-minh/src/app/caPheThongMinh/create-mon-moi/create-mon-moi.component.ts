import { Component, OnInit } from '@angular/core';
import {FormGroup} from '@angular/forms';
import {AngularFireStorage} from '@angular/fire/storage';
import {finalize} from 'rxjs/operators';

@Component({
  selector: 'app-create-mon-moi',
  templateUrl: './create-mon-moi.component.html',
  styleUrls: ['./create-mon-moi.component.css']
})
export class CreateMonMoiComponent implements OnInit {

  imgSrc: any;
  selectedImage: any = null;
  formMonMoi: FormGroup;

  constructor(private storage: AngularFireStorage) {
  }

  ngOnInit(): void {
  }

  showAnh(event: any) {
    if (event.target.files && event.target.files[0]) {
      const reader = new FileReader();
      reader.onload = (o: any) => this.imgSrc = o.target.result;
      reader.readAsDataURL(event.target.files[0]);
      this.selectedImage = event.target.files[0];
      this.subMit();
    } else {
      this.imgSrc = '';
      this.selectedImage = null;
    }
  }

  subMit() {
    if (this.selectedImage != null) {
      const filePath = `avata/${this.selectedImage.name.split(',').slice(0, -1).join(',')}${new Date().getTime()}`;
      const fileRef = this.storage.ref(filePath);
      this.storage.upload(filePath, this.selectedImage).snapshotChanges().pipe(
        finalize(() => {
          fileRef.getDownloadURL().subscribe(url => {
            this.imgSrc = url;
          });
        })
      ).subscribe();
    }
  }

  createMonMoi() {

  }
}
