package com.testapp.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.AdvertisementsRepository;
import com.testapp.entities.AdvertisementEntity;
import com.testapp.entities.BidderEntity;

@Service
public class AdvertisementsService {

	@Autowired
	AdvertisementsRepository advertisementsRepository;
	
	public List<AdvertisementEntity> getAdvertisementsByBid() {

		List<AdvertisementEntity> advertisements=getAdvertisements();
		return advertisements;
	}
	
	
	public List<AdvertisementEntity> getAdvertisements(){
		
		return advertisementsRepository.getAdvertisements();
	}
	
}
