import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { LoginComponent } from './login/login.component';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductComponent } from './product/product/product.component';
import { StudentComponent } from './student/student/student.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { ListuserComponent } from './user/listuser/listuser.component';
import { UserFormComponent } from './user/user-form/user-form.component';

//for user
const routes: Routes = [
  { path: '', component: ListuserComponent },
  { path: 'op', component: UserFormComponent },

  // for student
  { path: 'student', component: StudentComponent },
   // for product
  { path: 'product', component: ProductComponent },
  { path: 'products', component: ProductListComponent },
  //for employee
  { path: 'employees', component: EmployeeListComponent },
  { path: 'add', component: CreateEmployeeComponent },
  { path: 'update/:id', component: UpdateEmployeeComponent },
  { path: 'details/:id', component: EmployeeDetailsComponent },
  {path: 'login', component: LoginComponent},
  {path: '', component: LoginComponent},
  {path: 'hello-world', component: EmployeeListComponent},
  {path: 'logout', component: LoginComponent},
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
