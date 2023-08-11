package com.mypac;

public class Candidate {
public Candidate(int age) {
		super();
		this.age = age;
	}

int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Candidate [age=" + age + "]";
}

	
	
}
