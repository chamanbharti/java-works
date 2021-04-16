import { Component, OnInit, OnDestroy, ChangeDetectionStrategy } from '@angular/core';

import { Subscription, Observable, EMPTY, of } from 'rxjs';

import { Product } from './product';
import { ProductService } from './product.service';
import { catchError } from 'rxjs/operators';

@Component({
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ProductListComponent //implements OnInit, OnDestroy 
{
  pageTitle = 'Product List';
  errorMessage = '';
  categories;

  // products: Product[] = [];
  // sub: Subscription;
  // using async pipe
  // products$: Observable<Product[]>;
     products$ = this.productService.products$
     .pipe(
      catchError(err => {
        this.errorMessage = err;
        // return of([]);
        return EMPTY;
      })
    );
  constructor(private productService: ProductService) { }

 // ngOnInit(): void {
    // this.sub = this.productService.getProducts()
    //   .subscribe(
    //     products => this.products = products,
    //     error => this.errorMessage = error
    //   );

    // this.products$ = this.productService.getProducts();
  //   this.products$ = this.productService.getProducts()
  //   .pipe(
  //     catchError(err => {
  //       this.errorMessage = err;
  //       // return of([]);
  //       return EMPTY;
  //     })
  //   );
  // }

  // ngOnDestroy(): void {
  //  this.sub.unsubscribe();
  // }

  onAdd(): void {
    console.log('Not yet implemented');
  }

  onSelected(categoryId: string): void {
    console.log('Not yet implemented');
  }
}
