import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-promise',
  templateUrl: './promise.component.html',
  styleUrls: ['./promise.component.css']
})
export class PromiseComponent implements OnInit {
promiseValue;
dell = {
  brand: 'Dell',
  hardDisk: '2 TB',
  color: 'Black'
};
hp = {
  brand: 'Hp',
  hardDisk: '2 TB',
  color: 'Silver'
};
notAvailable = {
  brand: 'Not Available',
  status: 'Failed'
};
DellAvailable() {
    return false;
};
HPAvailable() {
    return false;
}
constructor() { }
  ngOnInit(): void {

    // let buyLaptop = new Promise(function (resolve,reject) {
    //   resolve('Promise is resolved');
    // });
    // buyLaptop.then( function(res) {
    //   console.log('then code -->', res)
    // });

    //using es6
    // let buyLaptop = new Promise( (resolve, reject) => {
    //   resolve('Promise is resolved')
    // });
    // buyLaptop.then(res => {
    //   console.log('then code -->', res)
    // });


    // let buyLaptop = new Promise( (resolve, reject) => {
    //   reject('Promise is rejected')
    // });
    // buyLaptop.then(res => {
    //   console.log('then code -->', res)
    // }).catch(res => {
    //   console.log('catch code -->', res)
    // });


    // const buyLaptop = new Promise( (resolve, reject) => {
    //   if (this.DellAvailable()) {
    //     setTimeout(() => {
    //       resolve('Dell is purchased');
    //     }, 3000);
    //   } else if (this.HPAvailable()) {
    //     setTimeout(() => {
    //       resolve('HP is purchased');
    //     }, 3000);
    //   } else {
    //     setTimeout(() => {
    //       reject('Laptop is not available on store');
    //     }, 3000);
    //   }
    // });

    // buyLaptop.then(res => {
    //   console.log('then code -->', res);
    //   this.promiseValue = res;
    // }).catch(res => {
    //   console.log('catch code -->', res);
    //   this.promiseValue = res;
    // });


    const buyLaptop = new Promise( (resolve, reject) => {
      if (this.DellAvailable()) {
        setTimeout(() => {
          resolve(this.dell);
        }, 3000);
      } else if (this.HPAvailable()) {
        setTimeout(() => {
          resolve(this.hp);
        }, 3000);
      } else {
        setTimeout(() => {
          reject(this.notAvailable);
        }, 3000);
      }
    });
    
    buyLaptop.then(res => {
      console.log('then code -->', res);
      this.promiseValue = res;
    }).catch(res => {
      console.log('catch code -->', res);
      this.promiseValue = res;
    });

  }
  myFunction() {
    console.log('myFunction called');
  }

}
