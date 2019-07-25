import { Component } from "@angular/core";
import { StorageService } from 'src/app/services/storage.service';
import { UtilityService } from 'src/app/services/utility.service';
import { MainService } from 'src/app/services/apiservices/main.service';
import { VisitorService } from 'src/app/services/apiservices/visitor.service';

@Component({
    selector: 'profile',
    templateUrl: './profile.component.html',
    styleUrls: ['profile.component.scss'],
})

export class ProfileComponent {
    roles=[];
    data = {
        FirstName: "",
        LastName: "",
        EmailId: "",
        MobileNo: "",
        Pincode: "",
        Gender: "false",
        Device: 3,
        Society: '',
        SocietyRole: '',
        Education:''
    }

    sendData = {
        id:"",
        firstName: "",
        lastName: "",
        emailId: "",
        mobileNo: "",
        pincode: "",
        gender: "false",
        device: 3,
        society: '',
        societyRole: '',
        education:''
    }
    visitorsDetails;
    constructor(private storageService: StorageService,private utilityService:UtilityService,private mainService:MainService,
        private visitorService:VisitorService) {
        this.visitorsDetails = storageService.getVisitorDetails();
        console.log(this.visitorsDetails);
        console.log(this.visitorsDetails.gender);
        this.sendData.firstName=this.visitorsDetails.firstName;
        this.sendData.lastName=this.visitorsDetails.lastName;
        this.sendData.emailId=this.visitorsDetails.emailId;
        this.sendData.mobileNo=this.visitorsDetails.mobileNo;
        this.sendData.pincode=this.visitorsDetails.pincode;
        console.log(this.sendData);

        this.getSocietyRole();

    }

    getDataFromTemplate(data) {
        console.log(data);
        this.data.FirstName = data.FirstName;
        this.data.LastName = data.LastName;
        this.data.EmailId = data.EmailId;
        this.data.MobileNo = data.MobileNo;
        this.data.Pincode = data.Pincode;
    }

    getSocietyRole() {
        this.mainService.getSocietyRoles()
          .then((result) => {
            this.utilityService.dismiss();
            this.roles = result;
            this.utilityService.log(this.roles);
          })
          .catch((error) => {
            this.utilityService.dismiss();
            (error);
          })
      }

      update()
      {
        console.log(this.sendData);
        this.visitorService.updateVisitorDetails(this.sendData)
        .then((result=>{
            this.utilityService.createAlert("Updated","Profile Details Updated Successfully","Ok");
        }))

      }
}