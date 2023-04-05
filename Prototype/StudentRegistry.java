package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	
	
	private Map<String, Student> streg;
	
	

	
	public StudentRegistry () {
		this.streg= new HashMap<>();
	}
	
	public Student get(String batchName) {
		
		return streg.get(batchName);
		
	}
	
	public void save(Student st) {
		streg.put(st.getBatchName(), st);
		
	}
}
