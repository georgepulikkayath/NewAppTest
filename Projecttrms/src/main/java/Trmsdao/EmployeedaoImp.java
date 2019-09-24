package Trmsdao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.EmpLogin;
import model.Employee;

import util.JDBCConnection;

public class EmployeedaoImp implements Employeedao{
public static Connection conn = JDBCConnection.getConnection();

	
	public boolean InsertUser(String uname,String pswd,int sid,int did,int type) {
		try {
			String sql = "CALL add_employee_(?,?,?,?,?)";
            CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1,uname);
			cs.setString(2,pswd);
			cs.setInt(3,sid);
			cs.setInt(4,did);
			cs.setInt(5,type);
			
			cs.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}


	public EmpLogin Login(String user_name, String pswd) {
		try {
			String sql = "SELECT emp_id,emp_type_id FROM employee WHERE user_name = ? AND pswd= ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user_name);
			ps.setString(2, pswd);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return new EmpLogin(rs.getInt("emp_id"),
						rs.getInt("emp_type_id"));
						
				
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
return null;
		
	}

}
