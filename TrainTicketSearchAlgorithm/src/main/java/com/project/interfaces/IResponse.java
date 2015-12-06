package com.project.interfaces;

public interface IResponse {
	public String printStationNames();
	public String printStationNextLetter(String stationToSearch);
	public void addStation(IStation station);
}
