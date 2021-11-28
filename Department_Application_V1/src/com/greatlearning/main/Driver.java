package com.greatlearning.main;

import com.greatlearning.service.AdminDepartment;
import com.greatlearning.service.HrDepartment;
import com.greatlearning.service.TechDepartment;

public class Driver {
	public static AdminDepartment admindepartment = new AdminDepartment();
	public static HrDepartment hrdepartment = new HrDepartment();
	public static TechDepartment techdepartment =new TechDepartment();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		admindepartment.showAdminDepartmentDetails();
		hrdepartment.showHrDepartmentDetails();
		techdepartment.showTechDepartmentDetails();
		
	}

}
