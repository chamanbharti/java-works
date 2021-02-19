import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Product } from '../product/product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private baseUrl: string = 'http://localhost:8080/api/v1';
  private headers = new HttpHeaders({'Content-Type':'application/json'});
  private options = {headers: this.headers};
  private product: Product;
  constructor(private http: HttpClient) { }

  fetchProducts(){
    return this.http.get(this.baseUrl+"/products");
  }

  fetchProduct(id){
    return this.http.get(this.baseUrl+"/product/"+id);
  }

  updateProduct(product){
    return this.http.put(this.baseUrl+"/product",product);
  }
  saveProducts(product: Product){
    return this.http.post(this.baseUrl+"/product",product,this.options);
  }
  getProductTitle(){
    return this.http.get(this.baseUrl+"/productTitle");
  }
  deleteProduct(id: number){
    return this.http.delete(this.baseUrl+"/product"+"/"+id);
  }
  deleteAllProduct(){
    return this.http.delete(this.baseUrl+"/product");
  }
}
