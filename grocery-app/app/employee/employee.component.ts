import { Component, OnInit } from '@angular/core';
import {DataService} from '../data.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers:[DataService]
})
export class EmployeeComponent implements OnInit {

  public employees=[];
   

  constructor(private dataService:DataService) { 
    this.employees=this.dataService.getEmployees();
  }

  ngOnInit(): void {
    this.employees=this.dataService.getEmployees();
  }

}
