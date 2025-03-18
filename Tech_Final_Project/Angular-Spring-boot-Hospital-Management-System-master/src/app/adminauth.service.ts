import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AdminauthService {

  constructor(private http: HttpClient, private router: Router) { }

  authenticate(username: string, password: string) {
    return this.http.post('http://localhost:2031/api/auth/login', { username, password });
  }
  
  

  isUserLoggedIn() {
    let user = sessionStorage.getItem('adminUsername');
    return !(user === null);
  }

  logOut() {
    sessionStorage.removeItem('adminUsername');
  }
}