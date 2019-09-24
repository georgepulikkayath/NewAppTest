package service;

import Trmsdao.EmployeedaoImp;
import model.EmpLogin;
import model.Employee;

public class EmployeeService {
	public static EmployeedaoImp ed = new EmployeedaoImp();
	public static boolean InsertUser(String user_name, String pswd,int sid,int did,int type) {
		boolean u1=ed.InsertUser(user_name, pswd,sid,did,type);
		return u1;

	}

public static EmpLogin Login(String user_name,String pswd) {
EmpLogin e=ed.Login(user_name,pswd);	
return e;
}
}