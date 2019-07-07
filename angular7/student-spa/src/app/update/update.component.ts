import { Component, Input } from "@angular/core";
import { StudentService } from 'src/services/studentservice.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    selector: "update",
    templateUrl: "update.component.html"
})

export class UpdateComponent {

   StudentData:any={}





    id: string;
    constructor(private studentService: StudentService, private router: Router, private route: ActivatedRoute) {
        this.route.paramMap.subscribe(p => { this.id = p.get('id') })
        console.log(this.id);
        this.getStudentByID(this.id);
    }

    

    getStudentByID(id) {
        this.studentService.getStudentsById(this.id)
            .then((r) => {
                console.log(r);
                this.StudentData=r[0];
                if (this.StudentData.isMale) {
                    this.StudentData.isMale="true";
                }
                else {
                    this.StudentData.isMale  = "false";
                }
                console.log("student data"+this.StudentData.name);
            })
            .catch((err) => {
                alert("data not found");
            });
    }

    updateData() {
        //console.log(this.Student);
        this.studentService.editStudent(this.StudentData, this.id)
            .then((r) => {
                this.router.navigate(['/display']);
            })
            .catch((err) => {
                alert("Not updated");
            });

    }
}