import { Component, Output, EventEmitter, Input } from "@angular/core";
import { MainService } from 'src/app/services/apiservices/main.service';
import { UtilityService } from 'src/app/services/utility.service';

@Component({
    selector: 'visitor-field',
    templateUrl: 'visitorfield.component.html',
    styleUrls: ['visitorfield.component.scss'],
})

export class VisitorFieldComponent {
    @Input()
    data = {
        firstName:"",
        lastName: "",
        emailId: "",
        mobileNo: "",
        pincode: "",
    }

    @Input()
    registerValidate=true;

    @Output()
    sendData = new EventEmitter();

    constructor() {
    }

    sendformData() {
        //if (this.data.FirstName != "" && this.data.LastName != "" && this.data.EmailId != "" && this.data.MobileNo != "" && this.data.Pincode != "") {
            this.sendData.emit(this.data);
        //}
    }

    
  
}