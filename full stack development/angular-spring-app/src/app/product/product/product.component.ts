import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from 'src/app/shared/product.service';
import { Product } from '../product';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  // dataTitle = 'Bharti Products';
 dataTitle = this.productService.getProductTitle();
 editMode= false;
 editIndex: number;
 fetching = false;
 products = [
   {
     id: 1,
     name: 'Laptop',
     price: '4500'
   },
   {
     id: 2,
     name: 'Washing Machine',
     price: '15000'
   },
   {
     id: 3,
     name: 'Mobile',
     price: '25000'
   },
   {
     id: 4,
     name: 'TV',
     price: '4500'
   }
 ];
 // for save product
 product = new Product();
 productDisplay = [];
 constructor(private productService: ProductService, private router: Router){}
 ngOnInit(){
  this.onFetchProduct();
 }
//  onAddProduct(id, name, price) {
//   this.products.push({
//     id: id.value,
//     name: name.value,
//     price: price.value
//   }
//   )
//  }

onAddProduct() {

 }
 onSaveProduct() {
  this.productService.saveProducts(this.product)
  .subscribe(
    (res)=>{
      console.log('inside onNext():',res);
      // this.router.navigate(['/product']);
      // this.onFetchProduct();
    },
    (err)=>{
      console.log('inside onError():',err);
    },
    ()=>{
      console.log('inside onComplete()');
      this.onFetchProduct();
    }
  )
 }

 onFetchProduct() {
   this.fetching = true;
  this.productService.fetchProducts()
  .subscribe(
    (res)=>{
      console.log('inside onNext():',res);
      const data = JSON.stringify(res);
      console.log('data:',data);
      const parseData = JSON.parse(data);
      console.log('parseData:',parseData);
      this.products = parseData;
      this.fetching = false;
    },
    (err)=>{
      console.log('inside onError():',err);
    },
    ()=>{
      console.log('inside onComplete():');
    }
  )
 }

 updateProduct(product){
   this.productService.updateProduct(product).subscribe(
    (res)=>{
      console.log('updated product:',res);
      this.onFetchProduct();
    }
   );
 }
 onEditProduct(id) {
  this.productService.fetchProduct(id).subscribe(
    (res)=>{
      console.log('inside onNext():',res);
      const data = JSON.stringify(res);
      console.log('data:',data);
      const parseData = JSON.parse(data);
      console.log('parseData:',parseData);
      this.product = parseData;
      this.fetching = false;
    }
  );
 }
 onDeleteProduct(id: number) {
  console.log(id);
  if (confirm('Do you want to delete this product?')) {
    // this.products.splice(id, 1);
    // this.productService.deleteProducts().subscribe();
    // this.onSaveProduct();
    this.productService.deleteProduct(id)
    .subscribe(
      (res)=>{
        console.log('inside onNext():',res);
        if(res){
          console.log('product which id was '+id+' has been deleted successfully');
          this.onFetchProduct();
        }

      },
      (err)=>{
        console.log('inside onError():',err);
      },
      ()=>{
        console.log('inside onComplete():');
        // this.onFetchProduct();
      });
    }
 }

 deleteAllProduct() {
  if (confirm('Do you want to delete all products?')) {
    this.productService.deleteAllProduct().subscribe();
    // this.onSaveProduct();
  }
 }
}
