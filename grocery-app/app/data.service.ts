import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }
  getEmployees(){
    return[
      {"empId":101,"name":"prassu","gender":"female","salary":25000},
    {"empId":102,"name":"suppi","gender":"female","salary":35000},
    {"empId":103,"name":"navii","gender":"female","salary":40000},
    {"empId":104,"name":"sravs","gender":"female","salary":50000},
    ];
  }
}
