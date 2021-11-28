package com.greatlearning.service;

import com.greatlearning.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public static SuperDepartment superdepartment =new SuperDepartment();
	public void showAdminDepartmentDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		String getholiday=superdepartment.isTodayAHoliday();
		System.out.println(getholiday+"\n");
	}
	public String departmentName() {
		String  departmentname ="Admin Department";
		return departmentname;
	}
	public String getTodaysWork() {
		String  todaywork="Complete your documents Submission";
		return todaywork;
	}
	public String getWorkDeadline() {
		String  deadline="Complete by EOD ";
		return deadline;
	}

	
}
