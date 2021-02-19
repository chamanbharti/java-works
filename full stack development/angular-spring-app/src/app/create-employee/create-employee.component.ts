import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DateAdapter } from '@angular/material/core';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  employee: Employee = new Employee();
  submitted = false;
  mobNumberPattern = '[789][0-9]{9}';

  // minDate2 = new Date(1989,2-1,12);
  // maxDate2 = new Date(2020,12-1,25);

  minDate: Date;
  maxDate: Date;

  dateFilter = date => {
    const day = date.getDay();
    return day !== 0 && day !== 6;
  }

  constructor(private employeeService: EmployeeService,
    private router: Router,
    private dateAdapter: DateAdapter<Date>)
    {
      this.dateAdapter.setLocale('en-GB');//dd/mm/yyyy
    }

    ngOnInit(): void {
     const date = new Date();
     const day = date.getDate();
     const month = date.getMonth() + 1;
     const year = date.getFullYear();
     this.maxDate = new Date(year,month-1,day);
    }

    formatDate(date: Date): string {
      const day = date.getDate();
      const month = date.getMonth() + 1;
      const year = date.getFullYear();
      return `${day}-${month}-${year}`;
    }

  newEmployee(): void {
    this.submitted = false;
    this.employee = new Employee();
  }

  save() {
    this.employeeService.createEmployee(this.employee)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employee = new Employee();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/employees']);
  }
}