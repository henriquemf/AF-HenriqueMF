package br.edu.insper.desagil.backend.model;

public class Track {
	Artist artist;
	private String name;
	private double duration;
	
	public Track(Artist artist, String name, double duration) {
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
		String d = "0:00";
		if (this.getDuration() < 10) {
			d = "0:0" + Double.toString(this.duration);
		}
		
		else if (this.getDuration() >= 10 && this.getDuration() <= 60) {
			d = "0:" + Double.toString(this.duration);
		}
		
		else if (this.getDuration() > 60) {
			int i = (int) this.duration;
			double s = this.duration - i;
			d = Double.toString(i) + Double.toString(s);
		}
		return d;
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
}
