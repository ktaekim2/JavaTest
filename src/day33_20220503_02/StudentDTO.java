package day33_20220503_02;

public class StudentDTO {

	private Long id;
	private String studentName;
	private String studentMobile;
	private String major;

	public StudentDTO() {
	}

	public StudentDTO(Long id, String studentName, String studentMobile, String major) {
		this.id = id;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.major = major;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", studentName=" + studentName + ", studentMobile=" + studentMobile + ", major="
				+ major + "]";
	}

}
