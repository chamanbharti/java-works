import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../user/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl: string = 'http://localhost:8080/api/v1';
  private headers = new HttpHeaders({'Content-Type':'application/json'});
  private options = {headers: this.headers};
  private user: User;
  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get(this.baseUrl+"/users",this.options);
  }

  getUser(id: number) {
    return this.http.get(this.baseUrl+"/user"+id,this.options)
  }

  deleteUser(id: number) {
    return this.http.delete(this.baseUrl+"/user/"+id,this.options);
  }

  createUser(user: User) {
    return this.http.post(this.baseUrl+"/user",JSON.stringify(user),this.options);
  }

  updateUser(user: User) {
    return this.http.put(this.baseUrl+"/user",JSON.stringify(user),this.options);
  }

  setter(user:  User){
    this.user = user;
  }

  getter(){
    return this.user;
  }

}
