package Prototype;

public class IntelligentStudent extends Student {
	private int iq;
	
	public IntelligentStudent(IntelligentStudent is) {
		super(is);
		this.iq= is.iq;
	}
	
	public IntelligentStudent() {
		
	}
	
	public IntelligentStudent clone() {
		return new IntelligentStudent(this);
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	@Override
	public String toString() {
		return "IntelligentStudent [iq=" + iq + ", toString()=" + super.toString() + "]";
	}

}
