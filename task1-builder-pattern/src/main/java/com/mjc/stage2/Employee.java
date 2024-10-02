package com.mjc.stage2;

public class Employee {
    String name;
    String lastName;
    String position;
    String phone;
    String email;
    String carNumber;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }
}