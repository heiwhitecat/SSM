package com.ljjboot.pojo;

import java.io.Serializable;

/**
 * @author ljj
 * @create 2022-07-28-8:38
 */
public class Emp implements Serializable {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;

    public Emp() {
    }







    public Emp(Integer empid, String empName, Integer age, String gender) {
        this.empId = empid;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
