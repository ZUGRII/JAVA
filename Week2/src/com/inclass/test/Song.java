package com.inclass.test;

public class Song 
{
	private String name;
	private String artist;
	private boolean recentlyPlayed;
	
	//Constructor
	public Song (String name, String artist, boolean recentlyPlayed)
	{
		setName(name);
		setArtist(artist);
		setRecentlyPlayed(recentlyPlayed);
	}//end constructor

	//set the song name
	public void setName(String newName) {
		name = newName;		
	}//end setName
	
	//need to validate that there are at least 2 words sent in the artist name 
	public void setArtist(String newArtist) {
		
		if(newArtist.contains(" ")) {
			artist= newArtist;
		}
		else {
			System.out.println("You didn't send in a valid name.");
		}
	}//end setArtist
	
	//set the flag recently played
	public void setRecentlyPlayed(boolean newRecentlyPlayed) {
		recentlyPlayed = newRecentlyPlayed;
	}//end setREcentlyPlayed
	
	public String getName() {
		return name;
	}//end getName
	
	public String getArtist() {
		return artist;
	}//end getArtist
	
	public boolean getrecentlyPlayed () {
		return recentlyPlayed;
	}//end getRecentlyPlayed
	
	public void playSong() {
		
		if(recentlyPlayed)// better to usee getter
		{
			System.out.println("Recently played, pick another");
		}
		else
		{
			//audioPlayer.play(name);
			recentlyPlayed = true; //better to get setters
		}
	}//end playSong
	
}//end class
