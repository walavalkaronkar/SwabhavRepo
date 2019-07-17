import { Component, Output, EventEmitter, Input } from "@angular/core";

@Component({
    selector: 'visitor-field',
    templateUrl: 'visitorfield.component.html'
})

export class VisitorFieldComponent {
    @Input()
    data = {
        FirstName: "",
        LastName: "",
        EmailId: "",
        MobileNo: "",
        Pincode: "",
    }

    @Input()
    registerValidate=true;

    @Output()
    sendData = new EventEmitter();

    constructor() {}

    sendformData() {
        //if (this.data.FirstName != "" && this.data.LastName != "" && this.data.EmailId != "" && this.data.MobileNo != "" && this.data.Pincode != "") {
            this.sendData.emit(this.data);
        //}
    }
}