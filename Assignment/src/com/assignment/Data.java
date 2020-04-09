package com.assignment;

public class Data {
	
	//attributes
	String temperature;
	String aches ;
	String cough;
	String sore_throat;
	String danger_zone;
	String has_covid19;
	
	//Constructor1
	public Data(String temperature, String aches, String cough, String sore_throat, String danger_zone,
			String has_covid19) {
		super();
		this.temperature = temperature;
		this.aches = aches;
		this.cough = cough;
		this.sore_throat = sore_throat;
		this.danger_zone = danger_zone;
		this.has_covid19 = has_covid19;
	}//end constructor 1
	
	//Constructor2 without has_covid19
	public Data(String temperature, String aches, String cough, String sore_throat, String danger_zone) {
		super();
		this.temperature = temperature;
		this.aches = aches;
		this.cough = cough;
		this.sore_throat = sore_throat;
		this.danger_zone = danger_zone;
	}//end constructor 2
	
	
	
	
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
	public String getSore_throat() {
		return sore_throat;
	}
	public void setSore_throat(String sore_throat) {
		this.sore_throat = sore_throat;
	}
	public String getDanger_zone() {
		return danger_zone;
	}
	public void setDanger_zone(String danger_zone) {
		this.danger_zone = danger_zone;
	}
	public String getHas_covid19() {
		return has_covid19;
	}
	public void setHas_covid19(String has_covid19) {
		this.has_covid19 = has_covid19;
	}

	
	

}
