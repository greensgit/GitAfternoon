package org.cts.test;

public class MethodOverloading {
	
	public void studentDetails() {
		System.out.println("Student enrolled for Java selenium");
	}
	
	public void studentDetails(int age) {
		System.out.println("Age is "+age);
	}
	
	
	public void studentDetails(String name) {
		System.out.println("name is"+name);
	}
	
	public void studentDetails(String course,int pincode ) {
		System.out.println("course and pincode is"+course +pincode);
	}
	
	public void studentDetails(String trainerName,String studentName ) {
		System.out.println("Trainer name is"+trainerName +studentName);
	}

	public void studentDetails(int empid,String location ) {
		System.out.println("Emp id and location is"+empid +location);
	}
	
	public void studentDetails(String companyName,String projectName, String clienLocation ) {
		System.out.println("copany details"+companyName +projectName +clienLocation);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.studentDetails();
		m.studentDetails("Raj","Hari");
		m.studentDetails(12345,"Banglore");
		m.studentDetails("Anitha");
		m.studentDetails("CTS","IRCTC","Banglore");
		
	}

}
