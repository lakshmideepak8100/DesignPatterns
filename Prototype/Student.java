package Prototype;

public class Student implements Prototype<Student> {

	private int id;
	private String name;
	private int age;
	private String batchName;
	private String instructorName;
	private double avgBatchPsp;
	private int yrOfEnrol;

	public Student() {

	}

	public Student(Student s) {

		this.batchName = s.batchName;
		this.instructorName = s.instructorName;
		this.avgBatchPsp = s.avgBatchPsp;
		this.yrOfEnrol = s.yrOfEnrol;

	}

	@Override
	public Student clone() {
		return new Student(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public double getAvgBatchPsp() {
		return avgBatchPsp;
	}

	public void setAvgBatchPsp(double avgBatchPsp) {
		this.avgBatchPsp = avgBatchPsp;
	}

	public int getYrOfEnrol() {
		return yrOfEnrol;
	}

	public void setYrOfEnrol(int yrOfEnrol) {
		this.yrOfEnrol = yrOfEnrol;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", batchName=" + batchName
				+ ", instructorName=" + instructorName + ", avgBatchPsp=" + avgBatchPsp + ", yrOfEnrol=" + yrOfEnrol
				+ "]";
	}

}
