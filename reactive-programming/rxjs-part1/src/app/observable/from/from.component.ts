import { Component, OnInit } from '@angular/core';
import { DesignUtilityService } from 'src/app/services/design-utility.service';
import { from } from 'rxjs';

@Component({
  selector: 'app-from',
  templateUrl: './from.component.html',
  styleUrls: ['./from.component.css']
})
export class FromComponent implements OnInit {
  obsMsg;
  constructor(private designUtility: DesignUtilityService) { }

  ngOnInit(): void {

    // from array
    const arrayObs = from(['Chaman', 'Rahi', 'Sahil']);
    arrayObs.subscribe(res => {
      console.log(res);
      this.designUtility.print(res, 'elContainer');
    });

      // from promise
    const promise = new Promise( resolve => {
      setTimeout(() => {
        resolve('Promose resolved')
      }, 3000);
    });
    promise.then(res => {
      console.log(res);
    });

    const promoseObs = from(promise);
    promoseObs.subscribe(res => {
      console.log('from promise => ', res);
      this.designUtility.print(res, 'elContainer2');
    });
    // from string
    const stringObs = from('Welcome to RxJS');
    stringObs.subscribe(res => {
      console.log('from string =>', res);
      this.designUtility.print(res, 'elContainer3');
    });
  }

}
