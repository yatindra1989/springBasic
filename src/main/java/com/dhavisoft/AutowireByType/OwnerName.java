package com.dhavisoft.AutowireByType;

public class OwnerName {
private CompanyName cn;


String Oname;
long Ocont;
public CompanyName getCn() {
	return cn;
}
public void setCn(CompanyName cn) {
	this.cn = cn;
}
public String getOname() {
	return Oname;
}
public void setOname(String oname) {
	Oname = oname;
}
public long getOcont() {
	return Ocont;
}
public void setOcont(long ocont) {
	Ocont = ocont;
}
void print()
{
	cn.print();
	System.out.println("OWNER NAME :-  "+Oname+"\t CONTACT :-  "+Ocont);
}

}
