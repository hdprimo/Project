package com.project.models;

import java.io.Serializable;

import com.project.interfaces.IStation;

public class Station extends Object implements Serializable, IStation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4110060984076091164L;

	private String name;
	
	public Station(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public char nextChar(int index){
		char nextChar = 00;
		if(index < getName().length()){
			nextChar = getName().charAt(index);
		}
		return nextChar;
	}
	
	
	
	@Override
	public boolean equals(Object compareObject){
		if(compareObject instanceof Station ){
			return ((Station) compareObject).getName().startsWith(this.name);
		}else{
			return false;
		}		
	}
}
