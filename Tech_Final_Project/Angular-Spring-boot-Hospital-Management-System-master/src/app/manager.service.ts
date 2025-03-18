import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ManagerService {
  private baseUrl = 'http://localhost:2027/api';

  constructor(private http: HttpClient) {}

  getUsers(): Observable<any> {
    return this.http.get(`${this.baseUrl}/users`);
  }

  addUser(user: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/users`, user);
  }

  updateUser(userId: number, user: any): Observable<any> {
    return this.http.put(`${this.baseUrl}/users/${userId}`, user);
  }

  deleteUser(userId: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/users/${userId}`);
  }

  getDoctors(): Observable<any> {
    return this.http.get(`${this.baseUrl}/doctors`);
  }

  addDoctor(doctor: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/doctors`, doctor);
  }

  updateDoctor(doctorId: number, doctor: any): Observable<any> {
    return this.http.put(`${this.baseUrl}/doctors/${doctorId}`, doctor);
  }

  deleteDoctor(doctorId: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/doctors/${doctorId}`);
  }
}
