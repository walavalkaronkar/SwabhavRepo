import { Component } from '@angular/core';

import { Http } from '@angular/http';

import { HttpModule } from '@angular/http';
import { Contacts } from '@ionic-native/contacts';
import { NavController, ActionSheetController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss']
})
export class HomePage {

  count=0;
  allContacts = [];
  items=[{name:"onkar",phone_no:"8378041654"},{name:"umesh",phone_no:"8378041654"},{name:"abhishek",phone_no:"8378041654"}];
  selectedName: string = "";
  actionSheet: any;
  firstName: string = "";
  secondName: string = "";
  matchnumber: number = 0;
  constructor(public navCtrl: NavController, public contact: Contacts, public http: Http, public actionSheetController: ActionSheetController) {

    this.contact.find(['displayName', 'name', 'phoneNumbers'], { filter: "", multiple: true })
      .then(data => {
        this.allContacts = data;

        for (let i = 0; i < this.allContacts.length; i++) {
          let item = this.allContacts[i];
          this.items.push({ name: item.displayName, phone_no: item.phoneNumbers[0].value });
        }
        
      })
      .catch(err => {
        console.log(err);
      })
  }

  takeInput() {
    if (this.firstName != "" && this.secondName != "") {
      this.calculateMatch();
    }
  }

  getContacts(value) {
    this.displayactionsheet(value);
  }

  calculateMatch() {

    for (let value = 0; value < this.firstName.length; value++) {
      this.matchnumber += this.firstName.charCodeAt(value);
    }
    for (let value = 0; value < this.secondName.length; value++) {
      this.matchnumber += this.secondName.charCodeAt(value);
    }
    this.matchnumber = this.matchnumber % 101;
  }

  displayactionsheet(value) {
    let button = [];
    for (let i = 0; i < this.items.length; i++) {
      button.push({
        text: this.items[i].name, handler: () => {
          console.log(this.items[i].name);
          this.selectedName = this.items[i].name;
          if (value == 1) {
            this.firstName = this.selectedName;
          }
          else if (value == 2) {
            this.secondName = this.selectedName;
          }
          this.takeInput();
        }
      });
    }

    let actionsheet = {
      header: 'Select from Contacts',
      buttons: button
    }
    this.actionSheet = this.actionSheetController.create(actionsheet).then(actionsheet => {
      actionsheet.present();
    });
  }

}

