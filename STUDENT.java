package com.example.demo.MODEL;

public class STUDENT {
	private String name;
	private String Rollno;
	private String emailid;
	private String phoneno;
	public STUDENT() {
	}
	
	public STUDENT(String name, String rollno, String emailid, String phoneno) {
		this.name = name;
		Rollno = rollno;
		this.emailid = emailid;
		this.phoneno = phoneno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return Rollno;
	}

	public void setRollno(String rollno) {
		Rollno = rollno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	

}
