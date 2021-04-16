import { Component, OnInit } from '@angular/core';
import { interval, Subscription, from, of } from 'rxjs';
import { toArray, take } from 'rxjs/operators';
@Component({
  selector: 'app-to-array',
  templateUrl: './to-array.component.html',
  styleUrls: ['./to-array.component.css']
})
export class ToArrayComponent implements OnInit {
  sourceSub: Subscription;
  users = [
    {name: 'Chaman', skill: 'Java'},
    {name: 'Bharti', skill: 'Angular'}
  ];
  constructor() { }

  ngOnInit(): void {
    // const source = interval(1000);
    // const sourceSub = source.subscribe(res => {
    //   console.log(res);
    //   if (res >= 8) {
    //     sourceSub.unsubscribe();
    //   }
    // });

    const source = interval(1000);
    const sourceSub = source.pipe(
      take(5),
      toArray())
    .subscribe(res => {
      console.log(res);
      // if (res >= 8) {
      //   sourceSub.unsubscribe();
      // }
    });

    const source2 = from(this.users);
    source2.subscribe(res => {
      console.log(res);
    });

    const source3 = from(this.users);
    source3.pipe(toArray())
    .subscribe(res => {
      console.log(res);
    });

    const source4 = of('chaman', 'bharti', 'sahil', 'bharti');
    source4.pipe(toArray())
    .subscribe(res => {
      console.log(res);
    });
  }
}
