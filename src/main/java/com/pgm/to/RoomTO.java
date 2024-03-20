package com.pgm.to;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomTO {

	private Integer roomNumber;
	private Integer numberOfBeds;
	private List<BedTO> bedList;
	
	
}
