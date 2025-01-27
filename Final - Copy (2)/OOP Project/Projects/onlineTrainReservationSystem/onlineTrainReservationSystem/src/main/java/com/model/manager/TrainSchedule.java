package com.model.manager;

public class TrainSchedule {
	
	private int id;
	private String station1;
	private String station2;
	private int km;
	
	public TrainSchedule()
	{
		
	}
	
	public TrainSchedule(String station1, String station2, int km) {
		super();
		this.station1 = station1;
		this.station2 = station2;
		this.km = km;
	}

	public TrainSchedule(int id, String station1, String station2, int km) {
		super();
		this.id = id;
		this.station1 = station1;
		this.station2 = station2;
		this.km = km;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStation1() {
		return station1;
	}

	public void setStation1(String station1) {
		this.station1 = station1;
	}

	public String getStation2() {
		return station2;
	}

	public void setStation2(String station2) {
		this.station2 = station2;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	
	
	
	
	

}
