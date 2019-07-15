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
export class HomeComponent {
  @ViewChild(IonReorderGroup) reorderGroup: IonReorderGroup;

  reoderdisplay:boolean=true;
  display: boolean = false;
  content: boolean = true;
  notes: any =[];


  constructor(private navCtrl: NavController,private route:ActivatedRoute , private router: Router, private data: GetData) {
    console.log("home");
    this.notes = data.getNotes();
    this.checkContents();

  }
  ngInit(): void {
    console.log("nginit");
  }
  load()
  {
    this.notes=this.data.getNotes();
  }

  
  doReorder(ev: any) {
    const itemMove = this.notes.splice(ev.detail.from, 1)[0];
    this.notes.splice(ev.detail.to, 0, itemMove);
    ev.detail.complete();
    this.data.updateNote(this.notes);
    this.notes = this.data.getNotes();
    this.router.navigateByUrl('home');
  }



  toggleReorderGroup() {
    this.reorderGroup.disabled = !this.reorderGroup.disabled;
    this.reoderdisplay=!this.reoderdisplay;
  }
  checkContents() {
    console.log("inside checkContents");
    console.log("")
    if (this.notes.length == 0) {
      this.display = true;
      this.content = false;
    }
    else
    {
      this.display = false;
      this.content = true;
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
    //console.log("new");
    this.router.navigateByUrl('newItem');
  }

  ngOnDestroy(): void {
    //Called once, before the instance is destroyed.
    //Add 'implements OnDestroy' to the class.
    console.log("destroy");
  }

  ionViewWillEnter()
  {
    this.notes = this.data.getNotes();
    this.checkContents();
    console.log("ionViewWillEnter");
  }

  ionViewDidEnter ()
  {
    console.log("ionViewDidEnter");
  }

  ionViewWillLeave()
  {
    console.log("ionViewWillLeave");
  }

  ionViewDidLeave()
  {
    console.log("ionViewDidLeave");
  }
}
