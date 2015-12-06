package com.project.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.interfaces.IStation;
import com.project.models.Station;

public class TrainTicketService {
	
	private static final String STATION_LIST_FILE_NAME = "stationsList.txt";

	public List<IStation> getAllStations(){
		List<IStation> stationList = new ArrayList<IStation>();
		ClassLoader loader = getClass().getClassLoader();
		
		File file = new File(loader.getResource(STATION_LIST_FILE_NAME).getFile());
		
		Scanner scanner=null;
		try {
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()){
				stationList.add(new Station(scanner.nextLine()));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(scanner != null){
				scanner.close();
			}
		}
		
		return stationList;
	}
}
