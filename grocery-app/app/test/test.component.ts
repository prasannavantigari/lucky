import { Component, OnInit, EventEmitter, Output } from '@angular/core';


@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() {}

  @Output()
  public childEvent=new EventEmitter;

  onButtonClicked(){
    this.childEvent.emit("Data from Child")
  }
  ngOnInit(): void {

  }

}