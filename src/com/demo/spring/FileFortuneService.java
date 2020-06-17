package com.demo.spring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\Users\\kavvy\\Documents\\fortune-data.txt";
	private List<String> fortuneList;
	
	// create a random number generator
	private Random randomNumberGenerator= new Random();
	public FileFortuneService() {

		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		fortuneList = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				fortuneList.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = randomNumberGenerator.nextInt(fortuneList.size());

		String tempFortune = fortuneList.get(index);

		return tempFortune;
	}

}
