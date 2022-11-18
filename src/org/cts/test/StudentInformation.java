package org.cts.test;


import org.hcl.test.TaskComplete;
//import packagename.classname
import org.tcs.test.InstituteDetails;
import org.tcs.test.TrainingMode;

public class StudentInformation {
	
	public void studentName() {
		System.out.println("Student name is Umar");
	}
	
	public void studentLocation() {
		System.out.println("Location is OMR");
	}
	
	public void courseTime() {
		System.out.println("Course time is 12 PM");
	}
	
	public static void main(String[] args) {
		
		//classname objectname = new classname();
		
		StudentInformation s = new StudentInformation(); 
		
		//objectname.methodname
		
		s.studentName();
		s.studentLocation();
		s.courseTime();
		
		TrainerDetails t = new TrainerDetails();
		t.trainerName();
		t.trainerLocation();
		
		CourseInformation c = new CourseInformation();
		c.nameOfCourse();
		c.courseDuration();
		
		InstituteDetails i = new InstituteDetails();
		i.nameOfInstitute();
		i.instituteLocation();
		
		TrainingMode tm = new TrainingMode();
		tm.modeOfTraining();
		
		TaskComplete tc = new TaskComplete();
		tc.completionOfTask();
	}

}
