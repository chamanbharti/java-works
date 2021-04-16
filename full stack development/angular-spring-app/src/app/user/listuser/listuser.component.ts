import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/shared/user.service';
import { User } from '../user';


@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {
  usersList: User[];
  constructor(private userService: UserService, private router: Router) { }

  ngOnInit(): void {
   this.userService.getUsers()
   .subscribe(

     (users)=>{
     console.log('inside onNext()',users);
     const usr = JSON.stringify(users);
     this.usersList = JSON.parse(usr);
   },
   (err) => {
    console.log(err),

    ()=>{
      console.log("users:",this.usersList)
     }
   });

  }

  deleteUser(user){
    this.userService.deleteUser(user.id)
    .subscribe(

      (data) => {               //onNext()
        console.log('inside onNext():',data);
        this.usersList.splice(this.usersList.indexOf(user),1);
      },
      (err) => console.log('exception has occurred:'+err+' using onError()'), //onError()

      () =>{                     //onComplete()
        console.log(user.id+' has been deleted using onComplete()');
      }
    );
    console.log("after delete users:",this.usersList);
  }

  updateUser(user){
    this.userService.setter(user);
    this.router.navigate(['/op']);
  }

  createUser(){
    let user = new User();
    this.userService.setter(user);
    this.router.navigate(['/op']);
  }

}
