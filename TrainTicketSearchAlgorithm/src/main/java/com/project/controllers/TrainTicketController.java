package com.project.controllers;

import java.util.List;

import com.project.interfaces.IResponse;
import com.project.interfaces.IStation;
import com.project.models.Response;
import com.project.models.Station;
import com.project.services.TrainTicketService;

public class TrainTicketController {

	private TrainTicketService ttService = new TrainTicketService();
	
	public IResponse search(String stationToSearch){
		IResponse response = new Response();		
		search(stationToSearch, ttService.getAllStations(), response);
		
		return response;
	}
	
	private void search(String wordSearch, List<IStation> nextStationList, IResponse result){
		int index = searchStation(nextStationList, new Station(wordSearch), result);
		if(index > -1 && (index+1) < nextStationList.size()){
			search(wordSearch, nextStationList.subList(index+1, nextStationList.size()), result);
		}
	}
	
	private int searchStation(List<IStation> stations, Station stationToSearch, IResponse result){
		int index = stations.indexOf(stationToSearch);
		
		if(index > -1){
			result.getStations().add(stations.get(index));
		}
		
		return index;		
	}
}
