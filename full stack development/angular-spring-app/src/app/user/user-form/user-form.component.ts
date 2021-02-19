import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/shared/user.service';
import { User } from '../user';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {
  user: User;
  constructor(private userService: UserService, private router: Router) { }

  ngOnInit(): void {
    this.user = this.userService.getter();
  }

  saveUser(){
    if(this.user.id ==undefined){
      this.userService.createUser(this.user)
      .subscribe(
        (user)=>{
          console.log('inside onNext() for save:',user);
          this.router.navigate(['/']);
        },
        (err)=>{
          console.log('inside onError() for save:',err);
        },
        ()=>{
          console.log('inside onComplete() for save:',this.user+" has been saved");
        }
      )
    }else{
      this.userService.updateUser(this.user)
      .subscribe(
        (user)=>{
          console.log('inside onNext() for update:',user);
          this.router.navigate(['/']);
        },
        (err)=>{
          console.log('inside onError() for update:',err);
        },
        ()=>{
          console.log('inside onComplete() for update:',this.user.id+" has been updated");
        }
      )
    }
  }
}
