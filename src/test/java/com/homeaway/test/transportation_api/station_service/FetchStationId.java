package com.homeaway.test.transportation_api.station_service;

import java.io.BufferedReader;
import org.junit.Test;

import com.homeaway.test.transportation_api.constants.ApiConstants;
import com.homeaway.test.transportation_api.model.FuelStation;
import com.homeaway.test.transportation_api.model.StationList;
import com.homeaway.test.transportation_api.util.ApiCallUtil;
import com.homeaway.test.transportation_api.util.FileUtil;

import junit.framework.Assert;

public class FetchStationId extends ApiConstants{
	BufferedReader reader;
	String hyattAustinId;
	
	@Test
	public void fetchStationId(){
		ApiCallUtil apiCallUtil = new ApiCallUtil();
		FileUtil fileUtil = new FileUtil();
		StationList stationList = apiCallUtil.init();
		boolean ifFound = false;
		for(FuelStation fuelStation: stationList.getFuelStation()){
			if(hyattAustin.equals(fuelStation.getStationName()) && chgPtNwk.equals(fuelStation.getEvNetwork())){
				ifFound=true;
				Assert.assertTrue(true);
				this.hyattAustinId = fuelStation.getId();
				fileUtil.writeIdToFile(fuelStation.getId());	
			}
		}
		if(!ifFound){
			Assert.assertFalse(true);
		}
	}

}
