import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  private loginUrl = 'http://localhost:2032/api/auth/login';

  constructor(private http: HttpClient) { }

  authenticate(username: string, password: string): Observable<any> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    const body = { username, password };
    
    return this.http.post(this.loginUrl, body, { headers });
  }

  isUserLoggedIn() {
    const user = sessionStorage.getItem('username');
    return !(user === null);
  }

  logOut() {
    sessionStorage.removeItem('username');
  }
}
