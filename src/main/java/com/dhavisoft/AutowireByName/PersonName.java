package com.dhavisoft.AutowireByName;

public class PersonName {
String PName;
int age;
SportType ST;
public SportType getST() {
	return ST;
}
public void setST(SportType sT) {
	ST = sT;
}
public String getPName() {
	return PName;
}
public void setPName(String pName) {
	PName = pName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return " PersonName :- " + PName + "\n age :- " + age + "\n " + ST + " ";
}
}
