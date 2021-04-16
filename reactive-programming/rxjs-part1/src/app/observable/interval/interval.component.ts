import { Component, OnInit } from '@angular/core';
import { interval, Subscription } from 'rxjs';
import { DesignUtilityService } from 'src/app/services/design-utility.service';

@Component({
  selector: 'app-interval',
  templateUrl: './interval.component.html',
  styleUrls: ['./interval.component.css']
})
export class IntervalComponent implements OnInit {
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
    const broadCastViedos = interval(2000);
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
