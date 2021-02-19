import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/shared/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  dataTitle = 'Bharti Products';
  editMode= true;
  editIndex: number;
  fetching = false;
  products;
  constructor(private productService: ProductService){}

  ngOnInit(): void {
    this.onFetchProduct();
  }
  onFetchProduct() {
    this.productService.fetchProducts()
    .subscribe(
      (res)=>{
        console.log('inside onNext():',res);
        const data = JSON.stringify(res);
        console.log('data:',data);
        const parseData = JSON.parse(data);
        console.log('parseData:',parseData);
        this.products = parseData;
      },
      (err)=>{
        console.log('inside onError():',err);
      },
      ()=>{
        console.log('inside onComplete():');
      }
    )
   }

}
