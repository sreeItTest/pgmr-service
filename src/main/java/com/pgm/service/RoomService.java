package com.pgm.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.pgm.to.BedTO;
import com.pgm.to.RoomTO;

@Service
public class RoomService {

  Logger logger = LoggerFactory.getLogger(RoomService.class);

  static List<RoomTO> roomList = new ArrayList<>();
  static {
	  RoomTO roomTO = new RoomTO(2,4,new ArrayList<BedTO>());
	  RoomTO roomTO1 = new RoomTO(1,2,new ArrayList<BedTO>());
	 
	  BedTO bedTO = new BedTO(1,2,"Ram","BLR","9686500500",null);
	  roomTO.getBedList().add(0,bedTO);
	  BedTO bedTO2 = new BedTO(2,2,"Raj","BLR","9686501501",null);
	  roomTO.getBedList().add(1,bedTO2);
	  
	  BedTO bedTO1 = new BedTO(1,2,"Marc","BLR","9686501501",null);
	  roomTO1.getBedList().add(0,bedTO1);
	  
		roomList.add(roomTO);
		roomList.add(roomTO1);
  }
  
   public RoomTO save(RoomTO roomTO) {
		
		return roomTO;
	}
	
    public RoomTO retriveRoom(Integer roomNumber) {
    	RoomTO room = null;
    	for (RoomTO roomTO : roomList) {
    		if(roomTO.getRoomNumber().equals(roomNumber)) {
    			room = roomTO;
    		}
		}
    	return room;
	}

	public List<RoomTO> findAll() {
		return roomList;
	}
}
