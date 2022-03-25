package com.codex.dp.creation.Prototype;

import java.util.List;
/**
 * Java Shallow cloning technique is based on this design pattern.
 * @author anutiwar
 *
 */
public class EmployeePrototypeTest {
	
	public static void main(String [] args) throws CloneNotSupportedException {
		EmployeePrototype emp = new EmployeePrototype();		
		emp.loadData();
		
		EmployeePrototype emp_1 = (EmployeePrototype)emp.clone();
		EmployeePrototype emp_2 = (EmployeePrototype)emp.clone();
		
		List<String> list = emp_1.getEmpList();
		list.add("sample_4");
		List<String> list1 = emp_2.getEmpList();
		list1.remove("sample_5");
		
		System.out.println("emp List: "+emp.getEmpList());
		System.out.println("emp_1 List: "+list);
		System.out.println("emp_2 List: "+list1);
	}

}
