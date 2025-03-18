import { Component } from '@angular/core';
import { ManagerService } from '../manager.service';

@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.css']
})
export class ManagerComponent {
  users: any[] = [];
  doctors: any[] = [];

  constructor(private managerService: ManagerService) {}

  getUsers() {
    this.managerService.getUsers().subscribe(data => {
      this.users = data;
    });
  }

  getDoctors() {
    this.managerService.getDoctors().subscribe(data => {
      this.doctors = data;
    });
  }

  addUser() {
    const newUser = { username: 'User name', password: 'enter password' };
    this.managerService.addUser(newUser).subscribe(() => this.getUsers());
  }

  updateUser(user: any) {
    this.managerService.updateUser(user.id, user).subscribe(() => this.getUsers());
  }

  deleteUser(userId: number) {
    this.managerService.deleteUser(userId).subscribe(() => this.getUsers());
  }

  addDoctor() {
    const newDoctor = { username: 'Doctor username', password: 'enter passwordal' };
    this.managerService.addDoctor(newDoctor).subscribe(() => this.getDoctors());
  }

  updateDoctor(doctor: any) {
    this.managerService.updateDoctor(doctor.id, doctor).subscribe(() => this.getDoctors());
  }

  deleteDoctor(doctorId: number) {
    this.managerService.deleteDoctor(doctorId).subscribe(() => this.getDoctors());
  }
}
