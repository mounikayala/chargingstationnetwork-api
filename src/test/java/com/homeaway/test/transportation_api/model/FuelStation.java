package com.homeaway.test.transportation_api.model;

import com.google.gson.annotations.SerializedName;

public class FuelStation {
	@SerializedName("id")
	String id;
	
	@SerializedName("station_name")
	String stationName;
	
	@SerializedName("ev_network")
	String evNetwork;
	
	@SerializedName("street_address")
	String streetAddress;
	
	@SerializedName("city")
	String city;
	
    @SerializedName("state")
	String state;
    
    @SerializedName("zip")
	String zip;
    
    
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getEvNetwork() {
		return evNetwork;
	}

	public void setEvNetwork(String evNetwork) {
		this.evNetwork = evNetwork;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
