package com.jdbc.dao;

import com.myjdbc.entity.Employee;

public interface Employeedao {
	
	 public void insertEmp(Employee e);
     
     public void deleteEmp( int id);
     
     public void updateEmp(Employee e);
     
     public void getEmpById(int id);
     
     public void getAllEmp();

}
