package br.edu.insper.desagil.backend.model;

public class Track {
	Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public double getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int finalDuration = 0;
		int realDuration = this.duration;
		
		while (realDuration >= 0) {
			
			if (realDuration < 10) {
				return (finalDuration + ":" + "0" + realDuration);
			}
			//Agora, ir regredindo de 60 em 60 até terminar a duração toda.
			realDuration = realDuration - 60;
			
			if (realDuration < 0) {
				realDuration += 60;
				return (finalDuration + ":" + realDuration);
			}
			finalDuration +=1;
		}
		
		return null;
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
}
