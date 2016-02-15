package com.homeaway.test.transportation_api.station_service;

import org.junit.Test;

import com.homeaway.test.transportation_api.constants.ApiConstants;
import com.homeaway.test.transportation_api.model.FuelStation;
import com.homeaway.test.transportation_api.model.StationList;
import com.homeaway.test.transportation_api.util.ApiCallUtil;
import com.homeaway.test.transportation_api.util.FileUtil;

import junit.framework.Assert;

public class ValidateAddress extends ApiConstants{

	@Test
	public void validateStationAddress(){
		ApiCallUtil apiCallUtil = new ApiCallUtil();
		FileUtil fileUtil = new FileUtil();
		String stationId= fileUtil.readIdFromFile().trim();
		StationList stationList = apiCallUtil.init();
		for(FuelStation fuelStation: stationList.getFuelStation()){
			if(stationId.equals(fuelStation.getId().trim())){
				String address = fuelStation.getStreetAddress()+","+ fuelStation.getCity()+","+fuelStation.getState()+","+fuelStation.getZip();
				Assert.assertEquals(this.hyattAddress, address);
			}
		}
		
	}
}
