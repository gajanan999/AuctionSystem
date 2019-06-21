package com.testapp.dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testapp.entities.BidderEntity;

@Repository
public class BidderRepository {

	
	public List<BidderEntity> getBidders()  {
		String content="";
		List<BidderEntity> list=new ArrayList<>();
		try {
		//File file = new File(getClass().getResource("data/jsonschema.json").getFile());
			File file = ResourceUtils.getFile("classpath:data/bidders.json");
			
			content = new String(Files.readAllBytes(file.toPath()));
			byte[] jsonData = Files.readAllBytes(file.toPath());
			ObjectMapper objectMapper = new ObjectMapper();
			 list= objectMapper.readValue(jsonData, new TypeReference<List<BidderEntity>>(){});
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(content);
		
		//JsonNode mySchema = JsonLoader.fromFile(file);
		return list;
		
	}
}
