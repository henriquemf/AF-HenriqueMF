package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name, int duration) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	public String getFullArtistName() {
		String f = this.artist.getName() +" (feat. ";
		
		//Fazendo um for para percorrer a lista de nomes e ir adicionando cada colaborador como string
		for (int i = 0; i < this.collaborators.size(); i++) {
			if (i == this.collaborators.size()-1) {
				f += this.collaborators.get(i).getName();
			}
			else {
				f += String.join(", ",this.collaborators.get(i).getName());
			}
		}
		f += ")";
		return f;
	}
}
