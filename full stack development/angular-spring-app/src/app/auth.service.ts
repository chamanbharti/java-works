import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  // BASE_PATH: 'http://localhost:8080'
  private baseUrl = 'http://localhost:8080/api/v1/';
  USER_NAME_SESSION_ATTRIBUTE_NAME;

  public username: String;
  public password: String;
  isEmployeeExist = false;
  constructor(private http: HttpClient) {

  }

  authenticationService(username: string, password: string) {
    debugger
    // return this.http.get(`http://localhost:8080/api/v1/basicauth`,
    return this.http.
    get(`${this.baseUrl}${'login'}${'?userName='}${username}${'&password='}${password}`
        //{ headers: { authorization: this.createBasicAuthToken(username, password) } }
      )
      .pipe(map((res) => {
        console.log(`${'Response:'}${res}`);
        if(res === true){
          this.isEmployeeExist=true;
          this.username = username;
          this.password = password;
          this.USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUser';
          this.registerSuccessfulLogin(username, password);
        }
      }
      )
      );
  }
  login(username: string, password: string): Observable<any> {
    debugger
    // return this.http.get(`${this.baseUrl}/${id}`);
    //http://localhost:8080/api/v1/login?userName=thechaman.bharti@gmail.com&pass=9871239055
    return this.http.get(`${this.baseUrl}${'login'}${'?userName='}${username}${'&password='}${password}`)
    .pipe(map((res) => {
      console.log(`${'Response:'}${res}`);
      if(res === true){
        this.isEmployeeExist=true;
        this.username = username;
        this.password = password;
        this.USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUser';
        this.registerSuccessfulLogin(username, password);
      }
    }
    )
    );
  }
  createBasicAuthToken(username: string, password: string) {
    debugger
    this.login(username, password);
    return 'Basic ' + window.btoa(username + ":" + password)
  }

  registerSuccessfulLogin(username, password) {
    debugger
    if(this.isEmployeeExist === true && this.USER_NAME_SESSION_ATTRIBUTE_NAME !== null){
      sessionStorage.setItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME, username)
    }
  }

  logout() {
    debugger
    sessionStorage.removeItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME);
    this.username = null;
    this.password = null;
  }

  isUserLoggedIn() {
    debugger
    let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
    if (user === null && this.isEmployeeExist === false) return false
    return true
  }

  getLoggedInUserName() {
    debugger
    let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
    if (user === null) return ''
    return user
  }
}
