package com.mjc.stage2;

public class EmployeeBuilder {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public EmployeeBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder setCarNumber(String carNumber) {
        this.carNumber = carNumber;
        return this;
    }

    public Employee build() {
        Employee employee = new Employee();
        employee.name = this.name;
        employee.lastName = this.lastName;
        employee.position = this.position;
        employee.phone = this.phone;
        employee.email = this.email;
        employee.carNumber = this.carNumber;
        return employee;
    }
}
