package com.dhavisoft.AutowireByType;

public class PatnerName {
private OwnerName owner;
String Pname;

public OwnerName getOwner() {
	return owner;
}


public String getPname() {
	return Pname;
}



@Override
public String toString() {
	owner.print();
	return   "PATNER NAME :-  " + Pname ;
}


void owner()
{
	owner.toString();
}


public void setOwner(OwnerName owner) {
	this.owner = owner;
}


public void setPname(String pname) {
	Pname = pname;
}
}
