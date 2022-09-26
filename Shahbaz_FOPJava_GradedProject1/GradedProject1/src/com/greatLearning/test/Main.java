package com.greatLearning.test;

import com.greatLearning.departments.AdminDepartment;
import com.greatLearning.departments.HrDepartment;
import com.greatLearning.departments.TechDepartment;

public class Main 
{
	public static void main (String [] args) 
	{
		AdminDepartment admin = new AdminDepartment();

		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("\n                 ");


		HrDepartment hr = new HrDepartment();

		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n                 ");


		TechDepartment tech = new TechDepartment();

		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}

}
