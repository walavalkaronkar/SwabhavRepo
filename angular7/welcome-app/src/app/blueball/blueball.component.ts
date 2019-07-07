import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms'

@Component({
  selector: 'blue-ball',
  templateUrl: './blueball.component.html',

})

export class BlueBallComponent {

  hideRules:boolean=true;
  Numberarray: number[] = new Array(50);
  color: string[] = new Array(50);
  randomNumber: number;
  turn: number = 5;
  disablebutton: boolean = false;
  counter: number = 20;
  interval;

  startInterval() {
    this.interval = setInterval(() => {
      this.counter--;
      if (this.counter <= 0) {
        clearInterval(this.interval);
        this.disablebutton = true;
        alert("Timeout")
      };
    }, 1000);
  }

  startGame()
  {
    this.hideRules=false;
    this.randomNumber = Math.floor((Math.random() * 100) / 2);
    alert(this.randomNumber)
    this.startInterval();
  }

  constructor() {
    
    for (var value = 1; value <= 50; value++) {
      this.Numberarray[value - 1] = value;
      this.color[value - 1] = "gray";
    }
  }

  checkBall(ballValue) {
    if (this.turn > 0) {
      if (this.turn == 0) {
        this.color[this.randomNumber-1] = "blue";
        clearInterval(this.interval);
        this.disablebutton = true;
      }
      if (this.randomNumber > ballValue) {
        this.color[ballValue - 1] = "red";
        this.turn--;
      }
      else if (this.randomNumber < ballValue) {
        this.color[ballValue - 1] = "green";
        this.turn--;
      }
      else if (this.randomNumber == ballValue) {
        this.color[ballValue - 1] = "blue";
        this.disablebutton = true;
        alert("you Win")
        this.turn = 0;
      }
      
    }
  }
}