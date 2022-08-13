package com.ljjboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ljj
 * @create 2022-07-26-16:04
 */
@ConfigurationProperties
public class User {
    private  Integer id;
    private String username;
    private String password;
    private  Integer age;
    private String gender;
    private String email;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public User(Integer id, String usename, String password, Integer age, String gender, String email) {
        this.id = id;
        this.username = usename;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String usename) {
        this.username = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usename='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
