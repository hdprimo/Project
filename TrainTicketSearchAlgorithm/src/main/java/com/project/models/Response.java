package com.project.models;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import com.project.interfaces.IResponse;
import com.project.interfaces.IStation;

public class Response implements Serializable,IResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4981433307312912756L;
	
	private List<IStation> stations;
	
	public Response(){
		this.setStations(new LinkedList<IStation>());
	}

	public List<IStation> getStations() {
		return stations;
	}

	public void setStations(List<IStation> stations) {
		this.stations = stations;
	}
	
	public String printStationNames(){
		StringBuilder stationNames = new StringBuilder();
		if(stations != null){
			for(IStation station: stations){
				if(stationNames.length() > 0){
					stationNames.append("\n");
				}
				stationNames.append(station.getName());
			}
		}
		return stationNames.toString();
	}
	
	public String printStationNextLetter(String stationToSearch){
		StringBuilder nextLetters = new StringBuilder();
		if(stations != null){
			for(IStation station: stations){
				if(stationToSearch.length() < station.getName().length()){
					if(nextLetters.length() > 0){
						nextLetters.append("\n");
					}
					nextLetters.append("'").append(station.nextChar(stationToSearch.length())).append("'");
				}
			}
		}
		return nextLetters.toString();
	}

}
