import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Message } from './message';
@Injectable({
  providedIn: 'root'
})
export class WelcomeService {

  constructor(private http: HttpClient,
    private employeeService: EmployeeService) { }

  helloWorldService() {
    debugger
    //const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa('javaguides' + ':' + 'password') });
     return this.http.get<Message>('http://localhost:8080/api/v1/employees');
    //return this.employeeService.getEmployeesList();
  }
}
