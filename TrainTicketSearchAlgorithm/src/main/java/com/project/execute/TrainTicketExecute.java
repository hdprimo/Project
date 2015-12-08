package com.project.execute;

import com.project.controllers.TrainTicketController;
import com.project.interfaces.IResponse;

public class TrainTicketExecute {

	public static void main(String[] args) {
		if(args.length == 1){
			TrainTicketController ttController = new TrainTicketController();
			IResponse response = ttController.search(args[0]);
			if(response != null){
				System.out.println("Station Names:");
				System.out.println(response.printStationNames());
				System.out.println();
				System.out.println("Next Stations Letter:");
				System.out.println(response.printStationNextLetter(args[0]));
			}
		}else{
			System.out.println("Please insert only one argument!");
		}
	}

}
