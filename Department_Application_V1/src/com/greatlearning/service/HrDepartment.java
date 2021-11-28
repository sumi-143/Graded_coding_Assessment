package com.greatlearning.service;

import com.greatlearning.model.SuperDepartment;

public class HrDepartment  extends SuperDepartment {
	public static SuperDepartment superdepartment =new SuperDepartment();
	public void showHrDepartmentDetails() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		String getholiday=superdepartment.isTodayAHoliday();
		System.out.println(getholiday+"\n");
	}
	public String departmentName() {
		String  departmentname ="Hr Department";
		return departmentname;
	}
	public String getTodaysWork() {
		String  todaywork="Fill today’s timesheet and mark your attendance";
		return todaywork;
	}
	public String getWorkDeadline() {
		String  deadline="Complete by EOD ";
		return deadline;
	}
	public String doActivity() {
		String activity ="team Lunch";
		return activity;
	}

}
