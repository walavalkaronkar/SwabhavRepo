import { Component } from "@angular/core";
import { StorageService } from 'src/app/services/storage.service';
import { UtilityService } from 'src/app/services/utility.service';

@Component({
    selector: 'profile',
    templateUrl: './profile.component.html'
})

export class ProfileComponent {
    data = {
        FirstName: "",
        LastName: "",
        EmailId: "",
        MobileNo: "",
        Pincode: "",
        Gender: false,
        Device: 3,
        Society: '',
        SocietyRole: ''
    }
    visitorsDetails;
    constructor(private storageService: StorageService,private utilityService:UtilityService) {
        this.visitorsDetails = storageService.getVisitorDetails();
    }

    GetData(data) {
        this.utilityService.log(data);
        this.data.FirstName = data.FirstName;
        this.data.LastName = data.LastName;
        this.data.EmailId = data.EmailId;
        this.data.MobileNo = data.MobileNo;
        this.data.Pincode = data.Pincode;
      }

}