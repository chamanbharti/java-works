import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  // inputs: ['parentData']
})
export class ChildComponent implements OnInit {
  @Input() public parentData: string;
  @Input() public parentId = 9;
  @Output() public childEvent = new EventEmitter();
  @Output() public greetEvent = new EventEmitter();
  public name = 'Chaman';
  constructor() { }

  ngOnInit(): void {
  }
  onChange(value: string): void {
    this.childEvent.emit(value);
  }

  callParentGreet(): void{
   // alert('Sending Message');
   this.greetEvent.emit(this.name);
  }
 
}
