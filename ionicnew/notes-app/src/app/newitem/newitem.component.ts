import { Component } from "@angular/core";
import { Router } from '@angular/router';
import { GetData } from 'src/services/getData';
import { NavController } from '@ionic/angular';

@Component({
    selector: 'newitem',
    templateUrl: './newitem.component.html'
})

export class NewItemComponent {
    Note: any = { id: "", title: "", note: "" };
    constructor(private navCtrl: NavController, private router: Router, private data: GetData) {
        console.log("new item consturtor");
        this.Note.id=this.IDGenerator();
        console.log(this.Note.id);
    }
    save() {
        if (this.Note.title != "" && this.Note.note != "" ) {
            this.data.setNotes(this.Note);
            console.log("save");
            this.router.navigateByUrl('home');
        }

    }
    IDGenerator() {

        var date = Date.now();
        let previous = 0;

        if (date <= previous) 
        {
            date = ++previous;
        } 
        else 
        {
            previous = date;
        }

        return date;
    }
}