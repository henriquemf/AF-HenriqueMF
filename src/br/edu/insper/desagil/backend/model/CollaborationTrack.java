package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name, int duration) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	public String getFullArtistName() {
		String f = "";
		List<String> all = new ArrayList <>();
		for (int i = 0; i < this.collaborators.size(); i++) {
			Artist collaborator = this.collaborators.get(i);
			all.add(collaborator.getName());
		}
		f = String.join("feat.", all + ",");
		return f;
	}
}
