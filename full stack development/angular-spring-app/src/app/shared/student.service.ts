import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Student } from '../student/student';
@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl: string = 'http://localhost:8080/api/v1';
  private httpHeaders = {headers: new HttpHeaders({'Content-Type':'application/json'})};
  private student: Student;
  constructor(private http: HttpClient) { }

  createStudent(student){
    return this.http.post(this.baseUrl+"/student",student,this.httpHeaders);
  }
}
