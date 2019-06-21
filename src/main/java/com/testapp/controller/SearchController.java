package com.testapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.dao.BidderRepository;
import com.testapp.entities.AdvertisementEntity;
import com.testapp.service.AuctionSystemService;

@RestController
public class SearchController {
	
	
	@Autowired
	AuctionSystemService auctionSystemService;
	
	@GetMapping("/search")
	List<AdvertisementEntity> getAdvertisements() {

	    return auctionSystemService.getAdvertisements();
	}

}
