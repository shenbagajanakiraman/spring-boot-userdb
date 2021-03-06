package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    @Id
    private int id;
    private String name;
    private int age;
    private String gender;


    /* Use @Data - annotation instead ! */


//    public User() {
//    }
//
//    public User(int id, String name, int age, String gender) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", Name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                '}';
//    }
}
