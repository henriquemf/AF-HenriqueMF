package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, double duration, List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	public Artist getFullArtistName() {
		
	}
}
