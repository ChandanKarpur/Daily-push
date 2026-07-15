package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Operation {
	public int insert(Employees emp) {
		int rows=0;
		Connection con=null;
		PreparedStatement stmt=null;
		
		String query="insert into employees(emp_id,name,department,salary,hire_year)values(? ,? ,? ,? ,?)";
		try{ 
			con=StockDao.getConnection();
			stmt =con.prepareStatement(query);
			
		
			stmt.setInt(1,emp.getEmp_id());
			stmt.setString(2,emp.getName());
			stmt.setString(3,emp.getDepartment());
			stmt.setDouble(4,emp.getSalary());
			stmt.setInt(5,emp.getHire_year());
			rows=stmt.executeUpdate();
			
			if (rows > 0) {
	            System.out.println("Employee data inserted successfully");
	        } else {
	            System.out.println("Insertion failed");
	        }
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return rows;
	}
	public int deleteEmployee(int empId) {
		String query="delete from employees where emp_id=?";
				int rows=0;
				Connection con=null;
				PreparedStatement stmt=null;
				
		      try {
					con=StockDao.getConnection();
					stmt =con.prepareStatement(query);
					
					stmt.setInt(1,empId);
					
					 rows=stmt.executeUpdate();
					 
					 if (rows > 0) {
			                System.out.println("Student deleted successfully");
			            } else {
			                System.out.println("Student not found");
			            }

					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(stmt!=null)
							stmt.close();
						if(con!=null)
							con.close();
						
				}catch(Exception e) {
						e.printStackTrace();
				}
		
	      }
		      return rows;
	}
	
	public int update(Employees emp) {
		String query="update employees set name=?,department=?,salary=?,hire_year=? where emp_id=?";
		int rows=0;
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=StockDao.getConnection();
			stmt =con.prepareStatement(query);
			 
			stmt.setString(1,emp.getName());
			stmt.setString(2,emp.getDepartment());
			stmt.setDouble(3,emp.getSalary());
			stmt.setInt(4,emp.getHire_year());
			stmt.setInt(5,emp.getEmp_id());
			rows=stmt.executeUpdate();

			if(rows > 0) {
				System.out.println("Employee data updated successfully");
			}else {
				System.out.println("Update failed");
			}
			
		}catch (Exception e) {
            e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		    }
		}
		return rows;
		
	}
	public boolean login(String username, String password) {
	    String query = "select * from users where username=? and password=?";
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        con =StockDao.getConnection();
	        ps = con.prepareStatement(query);
	        ps.setString(1, username);
	        ps.setString(2, password);

	        rs = ps.executeQuery();

	        if (rs.next()) {
	            return true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    return false;
	}
	public void displayEmployee(int empId) {
	    String query = "select * from employees where emp_id=?";
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        con =StockDao.getConnection();
	        ps = con.prepareStatement(query);
	        ps.setInt(1, empId);

	        rs = ps.executeQuery();

	        if (rs.next()) {
	            System.out.println("Emp ID: " + rs.getInt("emp_id"));
	            System.out.println("Name: " + rs.getString("name"));
	            System.out.println("Department: " + rs.getString("department"));
	            System.out.println("Salary: " + rs.getDouble("salary"));
				System.out.println("Hire Year: " + rs.getInt("hire_year"));
	        } else {
	            System.out.println("Employee not found");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	} 
}
