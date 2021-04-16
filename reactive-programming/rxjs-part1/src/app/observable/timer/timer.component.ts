import { Component, OnInit } from '@angular/core';
import { timer, Subscription } from 'rxjs';
import { DesignUtilityService } from 'src/app/services/design-utility.service';

@Component({
  selector: 'app-timer',
  templateUrl: './timer.component.html',
  styleUrls: ['./timer.component.css']
})
export class TimerComponent implements OnInit {

  obsMsg;
  videoSubscription: Subscription;
  constructor(private designUtitlity: DesignUtilityService) { }

  ngOnInit(): void {
    // const broadCastViedos = interval(2000);
    // broadCastViedos.subscribe(res => {
    //   console.log(res);
    //   this.obsMsg = 'Vidoe ' + res;
    // });

    // using subscription
    // const broadCastViedos = interval(2000);
    // this.videoSubscription = broadCastViedos.subscribe(res => {
    //   console.log(res);
    //   this.obsMsg = 'Vidoe ' + res;

    //   if (res >= 5) {
    //     this.videoSubscription.unsubscribe();
    //   }
    // });

    // using service
    // const broadCastViedos = interval(2000);
    // timer(delay, interval)
    const broadCastViedos = timer(5000, 1000);
    this.videoSubscription = broadCastViedos.subscribe(res => {
      console.log(res);
      this.obsMsg = 'Vidoe ' + res;
      this.designUtitlity.print(this.obsMsg, 'elContainer');
      this.designUtitlity.print(this.obsMsg, 'elContainer2');
      this.designUtitlity.print(this.obsMsg, 'elContainer3');
      if (res >= 5) {
        this.videoSubscription.unsubscribe();
      }
    });
  }
}
