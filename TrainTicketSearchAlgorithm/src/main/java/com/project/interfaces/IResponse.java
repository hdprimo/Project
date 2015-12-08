package com.project.interfaces;

import java.util.List;

public interface IResponse {
	public String printStationNames();
	public String printStationNextLetter(String stationToSearch);
	public List<IStation> getStations();
}
