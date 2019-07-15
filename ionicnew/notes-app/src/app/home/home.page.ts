import { Component, ViewChild } from '@angular/core';
import { NavController, IonReorderGroup } from '@ionic/angular';
import { NotesComponent } from '../notes/notes.component';
import { ActivatedRoute, Router } from '@angular/router';
import { GetData } from 'src/services/getData';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  @ViewChild(IonReorderGroup) reorderGroup: IonReorderGroup;

  display: boolean = false;
  content: boolean = true;
  notes: any = [];


  constructor(private navCtrl: NavController, private router: Router, private data: GetData) {
    console.log("home");
    this.notes = data.getNotes();
    this.checkContents();

  }
  ngInit(): void {
    console.log("nginit");
    
  }

  doReorder(ev: any) {
    const itemMove = this.notes.splice(ev.detail.from, 1)[0];
    this.notes.splice(ev.detail.to, 0, itemMove);
    ev.detail.complete();
    this.data.updateNote(this.notes);
    this.notes = this.data.getNotes();
  }

  toggleReorderGroup() {
    this.reorderGroup.disabled = !this.reorderGroup.disabled;
  }
  checkContents() {
    if (this.notes.length == 0) {
      this.display = true;
      this.content = false;
    }
  }

  delete(index) {
    this.notes.splice(index, 1);
    this.data.updateNote(this.notes);
    this.notes = this.data.getNotes();
    this.checkContents();

  }
  onclick(id) {
    console.log(id);
    this.router.navigateByUrl('notes/' + id);
  }

  newItem() {
    console.log("new");
    this.router.navigateByUrl('newItem');
  }

}
