package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myjdbc.entity.Employee;

public class  Employeedaoimpl implements Employeedao {
 static	Connection con;
	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "578038");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertEmp(Employee e) {
		try(Statement stmt = con.createStatement()) {
			stmt.executeUpdate("insert into employee(id,name,age,city) values ("+e.getId()+" ,'"+e.getName()+"','"+e.getAge()+"' , '"+e.getCity()+"')");
		     System.out.println("insert successfully");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void deleteEmp(int id) {
		try(Statement stmt = con.createStatement()){
			stmt.executeUpdate("delete from employee where id="+id);
			System.out.println("Delete successfuffy");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmp(Employee e) {
		try(Statement stmt = con.createStatement()) {
			stmt.executeUpdate("update employee set  name='"+e.getName()+"', age='"+e.getAge()+"' where id ="+e.getId()+" ");
			System.out.println("Updated successfully");
			
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void getEmpById(int id) {
		try(Statement stmt = con.createStatement()){
			
			stmt.executeUpdate("select city from employee where id="+id);
			System.out.println("Getting successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getAllEmp() {
		try(Statement stmt = con.createStatement()){
			
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			while(rs.next()) {
				System.out.println("id="+rs.getInt(1)+ " " +"name="+rs.getString(2)+  " " + "age=" +rs.getInt(3)+  " " +"city="+rs.getString(4) + " " );
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
      
}
      