import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from 'src/app/shared/student.service';
@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  student = new Student();
  studentError: Student;
  isCreated: boolean = false;
  studentExist: boolean = false;
  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
  }
  createStudent(){
    this.studentService.createStudent(this.student)
    // .subscribe(
    //   (data)=>{
    //     console.log('inside onNext():',data);
    //   },
    //   (err)=>{
    //     console.log('inside onError() has occurred:',err);
    //   },
    //   ()=>{
    //     console.log('inside onComplete() student has been save successfully');
    //   }
    // )

    //handling error
    .subscribe(
      (data)=>{
        console.log('inside onNext():',data);
        this.student = new Student();
        this.isCreated = true;
        this.studentExist = false;
        this.studentError = new Student();
        console.log('inside onNext() studentError:',this.studentError);
      },
      (error)=>{
        console.log('inside onError() has occurred:',error);
        this.studentError = error.error;
        this.isCreated = false;
        if(error.status == 409){
          this.isCreated = false;
          this.studentExist = true;
        }
      },
      ()=>{
        console.log('inside onComplete() student has been save successfully');
      }
    )
  }

}
