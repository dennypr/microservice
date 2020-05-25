/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ThinkPad
 */

@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.PROPERTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    
   
    private int id;
    private String name;
    private int age;
    private String email;
    private String address;
    private int cpfkku;

//    public Customer(int id, String name, int age, String email, String address, int cpfkku) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.address = address;
//       this.cpfkku = cpfkku;
//    }
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCpfkku() {
        return cpfkku;
    }

    public void setCpfkku(int cpfkku) {
        this.cpfkku = cpfkku;
    }
    
    
}
