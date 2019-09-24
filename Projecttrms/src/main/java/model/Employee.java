package model;

public class Employee {
 
private int employee_id;
  private String user_name;
  private String pswd;
  private int supervisor_id;
  private int department_id;
  private int employee_type_id;
  public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
public Employee(int employee_id, String user_name, String pswd, int supervisor_id, int department_id,
		int employee_type_id) {
	super();
	this.employee_id = employee_id;
	this.user_name = user_name;
	this.pswd = pswd;
	this.supervisor_id = supervisor_id;
	this.department_id = department_id;
	this.employee_type_id = employee_type_id;
}
public Employee(String user_name, String pswd, int supervisor_id, int department_id,
		int employee_type_id) {
	super();
	
	this.user_name = user_name;
	this.pswd = pswd;
	this.supervisor_id = supervisor_id;
	this.department_id = department_id;
	this.employee_type_id = employee_type_id;
}
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPswd() {
	return pswd;
}
public void setPswd(String pswd) {
	this.pswd = pswd;
}
public int getSupervisor_id() {
	return supervisor_id;
}
public void setSupervisor_id(int supervisor_id) {
	this.supervisor_id = supervisor_id;
}
public int getDepartment_id() {
	return department_id;
}
public void setDepartment_id(int department_id) {
	this.department_id = department_id;
}
public int getEmployee_type_id() {
	return employee_type_id;
}
public void setEmployee_type_id(int employee_type_id) {
	this.employee_type_id = employee_type_id;
}
@Override
public String toString() {
	return "Employee [employee_id=" + employee_id + ", user_name=" + user_name + ", pswd=" + pswd + ", supervisor_id="
			+ supervisor_id + ", department_id=" + department_id + ", employee_type_id=" + employee_type_id + "]";
}
}
