package com.testapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.entities.AdvertisementEntity;
import com.testapp.entities.BidderEntity;

@Service
public class AuctionSystemService {
	
	@Autowired
	AdvertisementsService advertisementsService;
	
	@Autowired
	BidderService bidderService;
	
	
	public List<AdvertisementEntity> getAdvertisements() {
		List<BidderEntity> bidders=bidderService.getBidderByBid();
		List<AdvertisementEntity> advertisements=advertisementsService.getAdvertisementsByBid();

		return getAdvertisementsByBiddersRank(bidders,advertisements);
	}
	
	public List<AdvertisementEntity> getAdvertisementsByBiddersRank(List<BidderEntity> bidders,List<AdvertisementEntity> advertisements){
		
		List<AdvertisementEntity> list=new ArrayList<>();
		for(BidderEntity bidder:bidders) {
			for(AdvertisementEntity advertisement:advertisements) {
				if(bidder.getBidderId() == advertisement.getBidderId()) {
					list.add(advertisement);
				}
				
			}
		}
		 System.out.println("****************** Advertisements List Sorted By Bid ***********************"+bidders.size()+" "+advertisements.size());
		for(AdvertisementEntity entity:advertisements) {
			System.out.println(entity.toString());
		}
		
		return list;
		
	}

	
	
}
