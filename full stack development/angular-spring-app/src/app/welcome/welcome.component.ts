import { Component, OnInit } from '@angular/core';
import { WelcomeService } from '../welcome.service';
@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message: string;

  constructor(private welcomeService: WelcomeService) { }

  ngOnInit() {

    console.log("welcomeComponent");
    this.welcomeService.helloWorldService()
    .subscribe( (result) => {
      // this.message = result.description;
      console.log(result);
    });
  }

}
