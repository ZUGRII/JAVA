package com.assignment;

public class Data {
	
	//attributes
	String temperature;		// cold, cool, normal, hot
	String aches ;			// yes / no
	String cough;			// yes / no
	String soreThroat;		// yes / no
	String dangerZone;		// yes / no
	String hasCovid19;		// yes / no
	
	//Constructor1
	public Data(String temperature, String aches, String cough, String soreThroat, String dangerZone,
			String hasCovid19) {
		super();
		this.temperature = temperature;
		this.aches = aches;
		this.cough = cough;
		this.soreThroat = soreThroat;
		this.dangerZone = dangerZone;		
		this.hasCovid19 = hasCovid19;		
	}//end constructor 1
	
	//Constructor2 without has_covid19
	public Data(String temperature, String aches, String cough, String soreThroat, String dangerZone) {
		super();
		this.temperature = temperature;		
		this.aches = aches;					
		this.cough = cough; 				
		this.soreThroat = soreThroat;		
		this.dangerZone = dangerZone;		
	}//end constructor 2
	
	
	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", aches=" + aches + ", cough=" + cough + ", sore_throat="
				+ soreThroat + ", danger_zone=" + dangerZone + ", has_covid19=" + hasCovid19 + "]";
	}

	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getAches() {
		return aches;
	}
	public void setAches(String aches) {
		this.aches = aches;
	}
	public String getCough() {
		return cough;
	}
	public void setCough(String cough) {
		this.cough = cough;
	}
	public String getSoreThroat() {
		return soreThroat;
	}
	public void setSoreThroat(String soreThroat) {
		this.soreThroat = soreThroat;
	}
	public String getDangerZone() {
		return dangerZone;
	}
	public void setDangerZone(String dangerZone) {
		this.dangerZone = dangerZone;
	}
	public String getHasCovid19() {
		return hasCovid19;
	}
	public void setHasCovid19(String hasCovid19) {
		this.hasCovid19 = hasCovid19;
	}

	
	

}
