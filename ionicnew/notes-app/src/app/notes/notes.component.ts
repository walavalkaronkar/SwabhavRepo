import { Component } from "@angular/core";
import { NavParams, NavController } from '@ionic/angular';
import { ActivatedRoute, Router } from '@angular/router';
import { GetData } from 'src/services/getData';

@Component({
  selector: "notes",
  templateUrl: "./notes.component.html"
})

export class NotesComponent {
  notes = []

  id: string;
  Note: any = {
    title: "",
    note: ""

  }
  constructor(private activatedRoute: ActivatedRoute, private data: GetData, private router: Router,public navCtrl: NavController) {
    console.log("edit constuctor");
    this.notes = data.getNotes();

  }
  ngOnInit() {
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    for (let value = 0; value < this.notes.length; value++) {
      if (this.id == this.notes[value].id) {
        this.Note.title = this.notes[value].title;
        this.Note.note = this.notes[value].note;
      }
    }
  }
  save() {
    for (let value = 0; value < this.notes.length; value++) {
      if (this.id == this.notes[value].id) {
        this.notes[value].title = this.Note.title;
        this.notes[value].note = this.Note.note;
      }
    }
    console.log(this.notes);
    this.data.updateNote(this.notes);
    this.navCtrl.pop();
    this.navCtrl.pop();
    this.router.navigateByUrl('home');
  }
}