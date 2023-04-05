package Prototype;

import java.util.List;
import java.util.Map;

public class Train implements Prototype{

	// Common Attributes
	private int tfare; // Train Fare
	private String tType; // Train Type
	private String engineType;
	private int numOfSeats;
	private String route_name; // to make batches for registry

	// Specific Attributes
	private int trainNo;
	private String startTime; 
	private String destniationTime; 
	private Map<String, String> station_time;
	
	
	
	// Constructor to initiate a template
	public Train() {
		
	}
	
	
	
	
	// Copy Constructor to generate prototype of trains
	
	public Train(Train template) {
		this.tfare= template.tfare;
		this.tType = template.tType;
		this.engineType = template.engineType;
		this.numOfSeats = template.numOfSeats;
		this.route_name = template.route_name;
		
	}
	
	@Override
	public Train clone() {
		return new Train(this);
	}
	
	

	public int getTfare() {
		return tfare;
	}

	public void setTfare(int tfare) {
		this.tfare = tfare;
	}

	public String gettType() {
		return tType;
	}

	public void settType(String tType) {
		this.tType = tType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public Map<String, String> getStation_time() {
		return station_time;
	}

	public void setStation_time(Map<String, String> station_time) {
		this.station_time = station_time;
	}

	public String getRoute_name() {
		return route_name;
	}

	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}




	public String getStartTime() {
		return startTime;
	}




	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}




	public String getDestniationTime() {
		return destniationTime;
	}




	public void setDestniationTime(String destniationTime) {
		this.destniationTime = destniationTime;
	}




	@Override
	public String toString() {
		return "Train [tfare=" + tfare + ", tType=" + tType + ", engineType=" + engineType + ", numOfSeats="
				+ numOfSeats + ", route_name=" + route_name + ", trainNo=" + trainNo + ", startTime=" + startTime
				+ ", destniationTime=" + destniationTime + ", station_time=" + station_time + "]";
	}

}
