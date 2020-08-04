package com.testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
	   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	   EmploeeDetails employee = new EmploeeDetails();

	   @Test
	   public void testCalculateAppriasal() {
	   
	      employee.setName("Randy");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      
	      double appraisal = empBusinessLogic.calculateAppraisal(employee);
	      Assert.assertEquals(500, appraisal, 0.0, "500");
	      
	     
	   }

	   // Test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	   
	      employee.setName("Randy");
	      employee.setAge(51);
	      employee.setMonthlySalary(8000);
	      
	      double salary = empBusinessLogic.calculateYearlySalary(employee);
	      Assert.assertEquals(96000, salary, 0.0, "8000");
	   }

}
