import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int sno;
	private String sname;
	private String course;
	private double fee;
    // private String email;
	private transient String usn; //not saved
	private transient String pwd;
	
	private long mobile;
	
	static {
		System.out.println("SB is executed, Student class is loaded");
	}
	
	public Student() {
		System.out.println("NPC is executed, Student class object is created");
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;		
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student(sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + ", usn=" + usn
				+ ", pwd=" + pwd + ", mobile=" + mobile + ")";
	}

	
}