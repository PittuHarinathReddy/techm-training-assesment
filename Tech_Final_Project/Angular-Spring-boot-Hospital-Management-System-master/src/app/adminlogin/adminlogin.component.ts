import { Component, OnInit } from '@angular/core';
import { AdminauthService } from '../adminauth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  username = ''; 
  password = ''; 
  invalidLogin = false;

  constructor(private router: Router, public loginservice: AdminauthService) { }

  ngOnInit(): void { }

  checkLogin() {
    this.loginservice.authenticate(this.username, this.password).subscribe(
      (response: any) => {
        console.log("Response from backend:", response); // Debugging log
        if (response && response.token) {
          sessionStorage.setItem('adminUsername', this.username);
          this.router.navigate(['/admindash']);
        } else {
          this.invalidLogin = true;
          alert("Wrong Credentials");
          this.router.navigate(['home']);
        }
      },
      (error) => {
        console.error("Login error:", error); // Error handling
        this.invalidLogin = true;
        alert("Login failed. Please try again.");
        this.router.navigate(['home']);
      }
    );
  }
  
}
