import { Component, OnInit } from '@angular/core';
import { of } from 'rxjs';
import { DesignUtilityService } from 'src/app/services/design-utility.service';

@Component({
  selector: 'app-of',
  templateUrl: './of.component.html',
  styleUrls: ['./of.component.css']
})
export class OfComponent implements OnInit {
  obsMsg;
  constructor(private designUtility: DesignUtilityService) { }

  ngOnInit(): void {
    const obs = of('Chaman', 'Rahi2', 'Sahil');
    obs.subscribe(res => {
      console.log(res);
      this.designUtility.print(res, 'elContainer');
    });

    const obs2 = of({a: 'Chaman', b: 'Rahi2', c: 'Sahil'});
    obs2.subscribe(res => {
      this.obsMsg = res;
      console.log('obsMsg => ', res);
    });
  }

}
