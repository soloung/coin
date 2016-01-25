package com.chentiming.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="user")
public class User {

    int id;
    
    private String name;
    
    private String password;
    
    public User(){
    	
    }
    
    public User(int id,String name,String password){
    	this.id = id;
    	this.name = name;
    	this.password = password;
    }
    
    public void setId(int id){
    	this.id = id;
    }
    
    @Id
    public int getId(){
    	return this.id;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return this.name;
    }
    
    public void setPassword(String password){
    	this.password = password;
    }
    
    public String getPassword(){
    	return this.password;
    }
}
