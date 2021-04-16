import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DesignUtilityService {

  constructor() { }
  // print(val) {
  //   let el = document.createElement('li');
  //   el.innerText = val;
  //   document.getElementById('elContainer').appendChild(el);
  // }
  print(val, containerId) {
    let el = document.createElement('li');
    el.innerText = val;
    document.getElementById(containerId).appendChild(el);
 }
}
