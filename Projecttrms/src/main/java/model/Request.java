package model;

import java.sql.Blob;
import java.sql.Date;

public class Request {
	private int emp_id;
	  private String event_info;
	  private String event_venue;
	  private Date event_date;
	  private int amount_cost;
	  private Date submit_date;
	  private int approve_status;
	  private int exceeds_amount;
	  private String exceeds_reason;
	  private String denied_reason;
	  private Date sp_approve_date;
	  private Date dept_approve_date;
	  private Date bnco_approve_date;
	  private int grade_status;
	  private Blob attach_file;
	  private int grade_upload;
	  private Blob grade_file_upload;
	  private int event_id;	

	  public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request(int emp_id, String event_info, String event_venue, Date event_date, int amount_cost,
			Date submit_date, int approve_status, int exceeds_amount, String exceeds_reason, String denied_reason,
			Date sp_approve_date, Date dept_approve_date, Date bnco_approve_date, int grade_status, Blob attach_file,
			int grade_upload, Blob grade_file_upload, int event_id) {
		super();
		this.emp_id = emp_id;
		this.event_info = event_info;
		this.event_venue = event_venue;
		this.event_date = event_date;
		this.amount_cost = amount_cost;
		this.submit_date = submit_date;
		this.approve_status = approve_status;
		this.exceeds_amount = exceeds_amount;
		this.exceeds_reason = exceeds_reason;
		this.denied_reason = denied_reason;
		this.sp_approve_date = sp_approve_date;
		this.dept_approve_date = dept_approve_date;
		this.bnco_approve_date = bnco_approve_date;
		this.grade_status = grade_status;
		this.attach_file = attach_file;
		this.grade_upload = grade_upload;
		this.grade_file_upload = grade_file_upload;
		this.event_id = event_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEvent_info() {
		return event_info;
	}
	public void setEvent_info(String event_info) {
		this.event_info = event_info;
	}
	public String getEvent_venue() {
		return event_venue;
	}
	public void setEvent_venue(String event_venue) {
		this.event_venue = event_venue;
	}
	public Date getEvent_date() {
		return event_date;
	}
	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}
	public int getAmount_cost() {
		return amount_cost;
	}
	public void setAmount_cost(int amount_cost) {
		this.amount_cost = amount_cost;
	}
	public Date getSubmit_date() {
		return submit_date;
	}
	public void setSubmit_date(Date submit_date) {
		this.submit_date = submit_date;
	}
	public int getApprove_status() {
		return approve_status;
	}
	public void setApprove_status(int approve_status) {
		this.approve_status = approve_status;
	}
	public int getExceeds_amount() {
		return exceeds_amount;
	}
	public void setExceeds_amount(int exceeds_amount) {
		this.exceeds_amount = exceeds_amount;
	}
	public String getExceeds_reason() {
		return exceeds_reason;
	}
	public void setExceeds_reason(String exceeds_reason) {
		this.exceeds_reason = exceeds_reason;
	}
	public String getDenied_reason() {
		return denied_reason;
	}
	public void setDenied_reason(String denied_reason) {
		this.denied_reason = denied_reason;
	}
	public Date getSp_approve_date() {
		return sp_approve_date;
	}
	public void setSp_approve_date(Date sp_approve_date) {
		this.sp_approve_date = sp_approve_date;
	}
	public Date getDept_approve_date() {
		return dept_approve_date;
	}
	public void setDept_approve_date(Date dept_approve_date) {
		this.dept_approve_date = dept_approve_date;
	}
	public Date getBnco_approve_date() {
		return bnco_approve_date;
	}
	public void setBnco_approve_date(Date bnco_approve_date) {
		this.bnco_approve_date = bnco_approve_date;
	}
	public int getGrade_status() {
		return grade_status;
	}
	public void setGrade_status(int grade_status) {
		this.grade_status = grade_status;
	}
	public Blob getAttach_file() {
		return attach_file;
	}
	public void setAttach_file(Blob attach_file) {
		this.attach_file = attach_file;
	}
	public int getGrade_upload() {
		return grade_upload;
	}
	public void setGrade_upload(int grade_upload) {
		this.grade_upload = grade_upload;
	}
	public Blob getGrade_file_upload() {
		return grade_file_upload;
	}
	public void setGrade_file_upload(Blob grade_file_upload) {
		this.grade_file_upload = grade_file_upload;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	@Override
	public String toString() {
		return "Request [emp_id=" + emp_id + ", event_info=" + event_info + ", event_venue=" + event_venue
				+ ", event_date=" + event_date + ", amount_cost=" + amount_cost + ", submit_date=" + submit_date
				+ ", approve_status=" + approve_status + ", exceeds_amount=" + exceeds_amount + ", exceeds_reason="
				+ exceeds_reason + ", denied_reason=" + denied_reason + ", sp_approve_date=" + sp_approve_date
				+ ", dept_approve_date=" + dept_approve_date + ", bnco_approve_date=" + bnco_approve_date
				+ ", grade_status=" + grade_status + ", attach_file=" + attach_file + ", grade_upload=" + grade_upload
				+ ", grade_file_upload=" + grade_file_upload + ", event_id=" + event_id + "]";
	}
	
}
