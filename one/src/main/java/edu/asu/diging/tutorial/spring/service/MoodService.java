package edu.asu.diging.tutorial.spring.service;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService implements MoodInterface {
 
	private ArrayList<String> moodList;
	private Random random;
	
	@PostConstruct
	public void init() {
		moodList = new ArrayList<String>();
		moodList.add("happy");
		moodList.add("funny");
		moodList.add("sad");
		moodList.add("angry");
		
		random = new Random(); 
	}
	
    public Mood getCurrentMood() {
    	int len = moodList.size();
    	int ind = random.nextInt(len);
		return new Mood(moodList.get(ind));
    }
}
