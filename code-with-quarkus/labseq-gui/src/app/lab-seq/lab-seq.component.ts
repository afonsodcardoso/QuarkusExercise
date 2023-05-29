import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-lab-seq',
  templateUrl: './lab-seq.component.html',
  styleUrls: ['./lab-seq.component.css']
})
export class LabSeqComponent {
  labSeqValue: number;
  index: number;

  constructor(private http: HttpClient) { }

  calculateLabSeq(n: number): void {
    const url = `http://localhost:8080/labseq/${n}`;
    this.http.get<number>(url).subscribe(value => {
      this.labSeqValue = value;
    });
  }
}