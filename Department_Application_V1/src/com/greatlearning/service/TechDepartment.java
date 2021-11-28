package com.greatlearning.service;

import com.greatlearning.model.SuperDepartment;

public class TechDepartment  extends SuperDepartment {
	public static SuperDepartment superdepartment =new SuperDepartment();
	public void showTechDepartmentDetails() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		String getholiday=superdepartment.isTodayAHoliday();
		System.out.println(getholiday+"\n");
	}
	public String departmentName() {
		String  departmentname ="Tech Department";
		return departmentname;
	}
	public String getTodaysWork() {
		String  todaywork="Complete coding of module 1";
		return todaywork;
	}
	public String getWorkDeadline() {
		String  deadline="Complete by EOD ";
		return deadline;
	}
	public String getTechStackInformation () {
		String  techstack="core Java";
		return techstack;
	}
	

}
