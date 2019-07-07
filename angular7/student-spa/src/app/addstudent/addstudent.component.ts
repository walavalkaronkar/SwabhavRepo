import { Component } from '@angular/core';
import { StudentService } from 'src/services/studentservice.service';
import {Router} from '@angular/router';


@Component
({
    selector: 'add',
    templateUrl: 'addstudent.component.html',
})
export class AddComponent {
    gender:string;
    result:string;
    Student={
        name:"",
        age:"",
        rollNo:"",
        date:"",
        email:"",
        isMale:true
    }
    constructor(private studentservice:StudentService,private router: Router){
        console.log("AddController")
    }

    AddData()
    {
       
        if(this.gender=="male")
        {
            this.Student.isMale=true;
        }
        else
        {
            this.Student.isMale=false;
        }

        console.log(this.Student);
        this.studentservice.addStudent(this.Student)
        .then((r) => {
            this.result = r;
            console.log(this.result);
            this.router.navigate(['/display'])
        })
        .catch((err) => {
            this.result = err;
        });

        
    }
}