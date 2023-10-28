package com.example.examjavaservlet.entity;

import java.io.Serializable;
@Table(name = "employee")

public class EmployeeEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String birthday;
    private String address;
    private String position;
    private String department;

    public EmployeeEntity(Integer id, String name, String birthday, String address, String position, String department) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    public EmployeeEntity() {

    }

    public EmployeeEntity(String name, String birthday, String address, String position, String department) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
