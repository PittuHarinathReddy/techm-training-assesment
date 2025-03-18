import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-doclogin',
  templateUrl: './doclogin.component.html',
  styleUrls: ['./doclogin.component.css']
})
export class DocloginComponent implements OnInit {

  username = ''
  password = ''
  invalidLogin = false

  constructor(private router: Router, public loginservice: AuthenticationService) { }

  ngOnInit(): void { }

  checkLogin() {
    this.loginservice.authenticate(this.username, this.password).subscribe(
      response => {
        sessionStorage.setItem('username', this.username);
        this.router.navigate(['docdash']);
        this.invalidLogin = false;
      },
      error => {
        this.invalidLogin = true;
        alert('Wrong Credentials');
        this.router.navigate(['home']);
      }
    );
  }
  
}