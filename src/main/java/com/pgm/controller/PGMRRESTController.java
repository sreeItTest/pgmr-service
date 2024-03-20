package com.pgm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pgm.service.RoomService;
import com.pgm.to.RoomTO;

@RestController
@RequestMapping("/pgm")
public class PGMRRESTController {
	Logger logger = LoggerFactory.getLogger(PGMRRESTController.class);
	
	@Autowired
	RoomService roomService;
	
	
	@PostMapping("/saveRoom")
	public RoomTO save(@RequestBody RoomTO roomTO) {
		return roomService.save(roomTO);
	}

	@GetMapping("/retriveRoom")
	public RoomTO retriveRoom(@RequestParam Integer roomNumber) {
		return roomService.retriveRoom(roomNumber);
	}
	
	@GetMapping("/findAll")
	public List<RoomTO> findAll() {
		return roomService.findAll();
	}
	
}
