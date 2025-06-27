package com.codex.patterns.creation.prototype;

import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeePrototype emp = new EmployeePrototype();
        emp.loadData();

        EmployeePrototype empClone = (EmployeePrototype) emp.clone();
        List<String> list = empClone.getEmpList();
        list.add("sample_4");

        System.out.println("Original Employee List: " + emp.getEmpList());
        System.out.println("Cloned Employee List: " + list);
    }
}
