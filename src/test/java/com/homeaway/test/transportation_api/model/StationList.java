package com.homeaway.test.transportation_api.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class StationList {
	
	@SerializedName("latitude")
	private String latitude;
	@SerializedName("longitude")
	private String longitude;
	@SerializedName("fuel_stations")
	private List<FuelStation> fuelStation;
	
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public List<FuelStation> getFuelStation() {
		return fuelStation;
	}

	public void setFuelStation(List<FuelStation> fuelStation) {
		this.fuelStation = fuelStation;
	}

	
	
}
