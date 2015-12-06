package com.project.test;

import org.junit.Assert;
import org.junit.Test;

import com.project.controllers.TrainTicketController;
import com.project.interfaces.IResponse;

public class SearchAlgorithmTest {

	@Test
	public void searchTest() {
		String stationToSearch = "DART";
		String printedStationNames = "DARTFORD\nDARTMOUTH";
		String printedStationNextLetter = "'F'\n'M'";
		
		commonTest(stationToSearch, printedStationNames, printedStationNextLetter);
		
		stationToSearch = "LIVERPOOL";
		printedStationNames = "LIVERPOOL\nLIVERPOOL LIME STREET";
		printedStationNextLetter = "' '";
		
		commonTest(stationToSearch, printedStationNames, printedStationNextLetter);
		
		stationToSearch = "KINGS CROSS";
		printedStationNames = "";
		printedStationNextLetter = "";
		
		commonTest(stationToSearch, printedStationNames, printedStationNextLetter);
		
	}

	private void commonTest(String stationToSearch, String printedStationNames,String printedStationNextLetter){
		TrainTicketController trainTicket = new TrainTicketController();		
		IResponse response =  trainTicket.search(stationToSearch);
		
		Assert.assertTrue(printedStationNames.equals(response.printStationNames()));
		Assert.assertTrue(printedStationNextLetter.equals(response.printStationNextLetter(stationToSearch)));
	}
}
