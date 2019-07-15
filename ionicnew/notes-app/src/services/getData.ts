import { Injectable } from "@angular/core";


export let allnotes=[];
@Injectable()
export class GetData {
    
    allnotes=[];
    constructor()
    {
        console.log("service invoked")
    }
    getNotes()
    {
        if (localStorage.getItem("notes") === null) {
             let notes=[];
            let myJSON = JSON.stringify(notes);
            localStorage.setItem("notes", myJSON);
          }
          allnotes = JSON.parse(localStorage.getItem("notes"));
        return allnotes;
    }

    setNotes(note)
    {
        allnotes.push(note);
        let myJSON = JSON.stringify(allnotes);
        localStorage.setItem("notes", myJSON);
        this.getNotes();
    }


    updateNote(note)
    {
        allnotes=note;
        let myJSON = JSON.stringify(allnotes);
        localStorage.setItem("notes", myJSON);
    }
}