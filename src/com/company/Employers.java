package com.company;

public class Employers {
//ФИО, должность, email, телефон, зарплата, возраст.
     String fullName;
     String position;
     String email;
     String phone;
     int salary;
     int age;

     Employers(String fullName, String position, String email, String phone, int salary, int age){
         this.fullName = fullName;
         this.position = position;
         this.email = email;
         this.phone = phone;
         this.salary = salary;
         this.age = age;

     }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void allInfo (){
        System.out.print(this.getFullName()+ " " );
        System.out.print(this.getAge()+"years" + " ");
        System.out.print(this.getEmail()+ " ");
        System.out.print(this.getPhone()+ " ");
        System.out.print(this.getPosition()+" ");
        System.out.print(this.getSalary()+ " ");
        System.out.println();
    }
}
