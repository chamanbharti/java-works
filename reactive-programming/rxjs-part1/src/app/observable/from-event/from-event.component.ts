import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
import { fromEvent } from 'rxjs';
import { DesignUtilityService } from 'src/app/services/design-utility.service';

@Component({
  selector: 'app-from-event',
  templateUrl: './from-event.component.html',
  styleUrls: ['./from-event.component.css']
})
export class FromEventComponent implements OnInit, AfterViewInit {

  constructor(private designUtility: DesignUtilityService) { }
  @ViewChild('addBtn') addBtn: ElementRef;
  ngOnInit(): void {
  }
  // print(val) {
  //   let el = document.createElement('li');
  //   el.innerText = val;
  //   document.getElementById('elContainer').appendChild(el);
  // }
//   print(val, containerId) {
//     let el = document.createElement('li');
//     el.innerText = val;
//     document.getElementById(containerId).appendChild(el);
//  }
  ngAfterViewInit(): void {
    let count = 1;
    fromEvent(this.addBtn.nativeElement, 'click')
    .subscribe(res => {
      // let countVal = 'Video ' + count++;
      // console.log(countVal);
      // this.print(countVal);

      // let countVal = 'Video ' + count++;
      // console.log(countVal);
      // this.print(countVal, 'elContainer2');

      // let countVal = 'Video ' + count++;
      // console.log(countVal);
      // this.print(countVal, 'elContainer');
      // this.print(countVal, 'elContainer2');

      // using service
      let countVal = 'Video ' + count++;
      console.log(countVal);
      this.designUtility.print(countVal, 'elContainer');
      this.designUtility.print(countVal, 'elContainer2');
    });
  }
}
