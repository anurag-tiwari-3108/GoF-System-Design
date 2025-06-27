package com.codex.patterns.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype design pattern is used when the Object creation is a costly affair
 * and requires a lot of time and resources and you have a similar object
 * already existing. Prototype pattern provides a mechanism to copy the original
 * object to a new object and then modify it according to our needs. Prototype
 * design pattern uses java cloning to copy the object.
 * 
 * @author anutiwar
 *
 */
public class EmployeePrototype implements Cloneable {

	private List<String> emplist;

	public EmployeePrototype() {
		emplist = new ArrayList<String>();
	}

	public EmployeePrototype(List<String> alist) {
		this.emplist = alist;
	}

	public void loadData() {
		emplist.add("sample_1");
		emplist.add("sample_2");
		emplist.add("sample_3");
	}

	public List<String> getEmpList() {
		return emplist;
	}

	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new EmployeePrototype(temp);
	}

}
