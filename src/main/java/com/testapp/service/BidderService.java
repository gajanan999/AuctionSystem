package com.testapp.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.BidderRepository;
import com.testapp.entities.BidderEntity;

@Service
public class BidderService {
	
	@Autowired
	BidderRepository bidderRepository;
	
	public List<BidderEntity> getBidders(){	
		return bidderRepository.getBidders();
	}
	
	public List<BidderEntity> getBidderByBid(){	
		
		 List<BidderEntity> list=getBidders();
		 list.sort(new Comparator<BidderEntity>() {
			public int compare(BidderEntity bidderOne,BidderEntity bidderTwo){
				 if(bidderOne.getBidPerClick() == bidderTwo.getBidPerClick()){
				        return 0;
				    }
				    return bidderOne.getBidPerClick()>bidderTwo.getBidPerClick() ? -1 : 1;
			 }
		 });
		 System.out.println("****************** Bidder List Sorted By Bid ***********************");
		for(BidderEntity entity: list) {
			System.out.println(entity.toString());
		}
		
		return list;
	}
	


}
