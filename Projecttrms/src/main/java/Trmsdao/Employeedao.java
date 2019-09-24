package Trmsdao;

import model.EmpLogin;
import model.Employee;

public interface Employeedao {
	public  boolean InsertUser(String uname,String pswd,int sid,int did,int type);
	public 	EmpLogin Login(String user_name,String pswd);
}
