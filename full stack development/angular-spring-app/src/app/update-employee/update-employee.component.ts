import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import * as moment from 'moment';
import { DateAdapter } from '@angular/material/core';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  id: number;
  employee: Employee;

  minDate2 = new Date(1989,2-1,12);
  maxDate2 = new Date(2020,12-1,27);

  minDate: Date;
  maxDate: Date;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: EmployeeService,
    private dateAdapter: DateAdapter<Date>) {
      this.dateAdapter.setLocale('en-GB');//dd/mm/yyyy
    }

  ngOnInit() {

    // const formatYmd = date => date.toISOString().slice(0, 10);
    // this.minDate = formatYmd(new Date());
     const date = new Date();
     const day = date.getDate();
     const month = date.getMonth() + 1;
     const year = date.getFullYear();
     this.maxDate = new Date(year,month-1,day);
     console.log(`maxDate:${this.maxDate}`)
    this.employee = new Employee();

    this.id = this.route.snapshot.params['id'];

    this.employeeService.getEmployee(this.id)
      .subscribe(data => {
        console.log(data)
        this.employee = data;
      }, error => console.log(error));
  }

  updateEmployee() {
    this.employeeService.updateEmployee(this.id, this.employee)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employee = new Employee();
    this.gotoList();
  }

  onSubmit() {
    this.updateEmployee();
  }

  gotoList() {
    this.router.navigate(['/employees']);
  }
  getDOB(dob: string){
    let newDate = new Date(dob);
    return this.formatDate(newDate);
  }
  formatDate(date: Date): string {
    const day = date.getDate();
    const month = date.getMonth() + 1;
    const year = date.getFullYear();
    console.log(`formatDate:${day}-${month}-${year}`)
    this.minDate = new Date(year,month-1,day);
    console.log(`minDate:${this.minDate}`)
    return `${day}-${month}-${year}`;
  }
}