package com.dhavisoft.autowiringbyname;

public class HouseByName {
int hoNo;
String hoName;
LocationByName loc;
public int getHoNo() {
	return hoNo;
}
public void setHoNo(int hoNo) {
	this.hoNo = hoNo;
}
public String getHoName() {
	return hoName;
}
public void setHoName(String hoName) {
	this.hoName = hoName;
}
public LocationByName getLoc() {
	return loc;
}
public void setLoc(LocationByName loc) {
	this.loc = loc;
}
public void show() {
System.out.println("The house number is:"+hoNo+"The house name is:"+hoName);
loc.display();
}}
