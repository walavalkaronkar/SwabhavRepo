import { Component } from '@angular/core';
import { Istudent } from './Istudent';
import { ICourse } from './ICourse';


@Component({
    selector: 'aurionpro-student',
    templateUrl: './student.component.html',

})

export class StudentComponent {
    student: Istudent;
    courses: ICourse[];
    color: string;
    maxHeight: string = "200px";
    maxWidth: string = "200px";



    constructor() {
        this.student = {
            name: "onkar",
            cgpa: 8.5,
            location: "virar",
            profilepic: "../../assets/pic.jpeg"
        }
        
    }

    convertTocolor() {
        if (this.student.cgpa < 6) {
            this.color = "red";
        }
        if (this.student.cgpa < 7.5) {
            this.color = "yellow";
        }
        else 
        {
            this.color = "green";
        }
        return this.color;
    }
    loadCourses()
    {
        this.courses = [{ id: 1, name: "computer" },
        { id: 2, name: "Mech" },
        { id: 3, name: "IT" }
        ];
    }

    nameChange(e)
    {
        this.student.name=e;
    }
}
