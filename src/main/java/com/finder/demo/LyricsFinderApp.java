package com.finder.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LyricsFinderApp {

	private static final Logger log = LoggerFactory.getLogger(LyricsFinderApp.class);

	public static void main(String[] args){
		SpringApplication.run(LyricsFinderApp.class, args);
	}
}