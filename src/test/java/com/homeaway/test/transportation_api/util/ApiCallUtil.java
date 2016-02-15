package com.homeaway.test.transportation_api.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.annotation.PostConstruct;

import com.google.gson.Gson;
import com.homeaway.test.transportation_api.constants.ApiConstants;
import com.homeaway.test.transportation_api.model.StationList;

public class ApiCallUtil extends ApiConstants{

	@PostConstruct
	public StationList init() {
		StationList stationList = null;
		try {
			String transportationServiceUrl = this.serviceUrl+this.apiKey+this.location;
			URL url = new URL(transportationServiceUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			 BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			 Gson gson = new Gson();
			 stationList = gson.fromJson(br, StationList.class);
			conn.disconnect();
			return stationList;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stationList;

	}
}
