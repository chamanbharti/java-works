import { Component } from '@angular/core';
import { HttpClient, HttpHeaders  } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'stripe-example';
  token;
  form;
  constructor(private http: HttpClient) {}
  chargeCreditCard(): void{
    this.form = document.getElementsByTagName("form")[0];
    (<any>window).Stripe.card.createToken({
      number: this.form.cardNumber.value,
      exp_month: this.form.expMonth.value,
      exp_year: this.form.expYear.value,
      cvc: this.form.cvc.value
    }, (status: number, response: any) => {
      if (status === 200) {
        this.token = response.id;
        this.chargeCard(this.token);
      } else {
        console.log(response.error.message);
      }
    });
  }
  chargeCard(token: string): void{
    const headers = new HttpHeaders({'token': token, 'amount': 100});
    this.http.post('http://localhost:8080/payment/charge', {}, {headers: headers})
      .subscribe(resp => {
        console.log(resp);
      });
  }
}
