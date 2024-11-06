package com.myjdbc;

import com.myjdbc.entity.Employee;
import com.jdbc.dao.Employeedao;
import com.jdbc.dao.Employeedaoimpl;
public class JdbcConnection {

	public static void main(String[] args) {
		Employee emp = new Employee(105,"mohan",4444,"kanpur");
		Employeedao dao = new Employeedaoimpl();
//		dao.insertEmp(emp);
//		
//		Employee emp2 = new Employee(20,"pulkit",44,"Delhi");
//		dao.insertEmp(emp2);
		
		//dao.updateEmp(emp);
//		dao.deleteEmp(2);
		//dao.getAllEmp();
		dao.getEmpById(20);
	}

}
