package model;

public class EmpLogin {
private int emp_id;
private int employee_type_id;
public EmpLogin() {
	super();
	// TODO Auto-generated constructor stub
}
public EmpLogin(int emp_id, int employee_type_id) {
	super();
	this.emp_id = emp_id;
	this.employee_type_id = employee_type_id;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public int getEmployee_type_id() {
	return employee_type_id;
}
public void setEmployee_type_id(int employee_type_id) {
	this.employee_type_id = employee_type_id;
}
@Override
public String toString() {
	return "EmpLogin [emp_id=" + emp_id + ", employee_type_id=" + employee_type_id + "]";
}

}
