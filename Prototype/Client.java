package Prototype;

public class Client {

	public static void main(String[] args) {
		

		StudentRegistry streg = new StudentRegistry();

		Student aprBatch = new Student();
		aprBatch.setBatchName("Apr2022");
		aprBatch.setAvgBatchPsp(90);
		aprBatch.setInstructorName("Tarun MalHotra");
		aprBatch.setYrOfEnrol(2022);

		Student mayBatch = new Student();
		mayBatch.setBatchName("May2022");
		mayBatch.setAvgBatchPsp(90);
		mayBatch.setInstructorName("Sandeep");
		mayBatch.setYrOfEnrol(2022);

		Student junebatch = new Student();
		junebatch.setBatchName("Jun2022");
		junebatch.setAvgBatchPsp(90);
		junebatch.setInstructorName("Amman");
		junebatch.setYrOfEnrol(2022);

		streg.save(aprBatch);
		streg.save(mayBatch);
		streg.save(junebatch);

		
		// Registry Design P
		Student aprBatchPrototype = streg.get("Apr2022");
		Student deepak = aprBatchPrototype.clone();
		deepak.setId(101);
		deepak.setName("Deepak");
		deepak.setAge(26);

		System.out.println(deepak);

		IntelligentStudent spb = new IntelligentStudent();
		spb.setBatchName("Super Batch");
		spb.setAvgBatchPsp(100);
		spb.setInstructorName("XYZ");
		spb.setYrOfEnrol(2023);

		IntelligentStudent spA = spb.clone();
		spA.setId(102);
		spA.setName("Lakshmi Deepak");
		spA.setAge(12);
		spA.setIq(200);

		System.out.println(spA);

	}

}
