import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Injectable()
export class StudentService
{
    url:string="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
    constructor(private http:HttpClient)
    {
        console.log("Invoked numbers service");
    }

    getStudents():Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.get(this.url,{responseType: 'json'})
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response);
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }

    getStudentsById(id):Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.get(this.url+"/"+id,{responseType: 'json'})
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response);
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }

    addStudent(student:Object):Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.post(this.url,student)
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response);
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }
    deleteStudent(id):Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.delete(this.url+"/"+id)
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response);
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }

    editStudent(student,id):Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.put(this.url+"/"+id,student)
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response);
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }
}