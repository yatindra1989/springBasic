package com.dhavisoft.AutowireByName;

public class SportType {

	String SName;
	int Sid;
	
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	@Override
	public String toString() {
		return "SportType :- " + SName + " \n Sid :- " + Sid ;
	}
	
}
