package com.chentiming.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skills {
	
	private int id;
	
	private String name;
	
	private int level;
	
	
	public Skills(){
		
	}
	
	public Skills(int id,String name,int level){
		this.id = id;
		this.name = name;
		this.level = level;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	
	public int getLevel(){
		return this.level;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	@Id
	public int getId(){
		return this.id;
	}

}
