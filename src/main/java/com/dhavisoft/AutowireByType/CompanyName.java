package com.dhavisoft.AutowireByType;

public class CompanyName {
	String cname;
	long ccont;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCcont() {
		return ccont;
	}
	public void setCcont(long ccont) {
		this.ccont = ccont;
	}
void print()
{
	System.out.println("COMPANY NAME :-  "+cname+"\tCONTACT :-  "+ccont);
}
	
}
