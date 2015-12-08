package com.project.services;

import java.util.ArrayList;
import java.util.List;

import com.project.interfaces.IStation;
import com.project.models.Station;

public class TrainTicketService {
	
	private static final String STATION_LIST_FILE_NAME = "TOWER HILL,DERBY,DARTFORD,DARTMOUTH,LIVERPOOL,LIVERPOOL LIME STREET,PADDINGTON,EUSTON,LONDON BRIDGE,VICTORIA";

	public List<IStation> getAllStations(){
		List<IStation> stationList = new ArrayList<IStation>();

		String[] stations = STATION_LIST_FILE_NAME.split(",");
		for(String station:stations){
			stationList.add(new Station(station));
		}
		
		return stationList;
	}
}
