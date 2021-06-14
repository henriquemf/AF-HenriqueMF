package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Track t;
	private Artist a;
	
	@BeforeEach
	void setUp() {
		a = new Artist("Anitta");
	}

	@Test
	void testZeroSeconds() {
		t = new Track(a, "RedHot", 0);
		assertEquals("0:00", t.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		t = new Track(a, "RedHot", 5);
		assertEquals("0:05", t.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		t = new Track(a, "RedHot", 25);
		assertEquals("0:25", t.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		t = new Track(a, "RedHot", 60);
		assertEquals("1:00", t.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		t = new Track(a, "RedHot", 65);
		assertEquals("1:05", t.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		t = new Track(a, "RedHot", 85);
		assertEquals("1:25", t.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		t = new Track(a, "RedHot", 120);
		assertEquals("2:00", t.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		t = new Track(a, "RedHot", 125);
		assertEquals("2:05", t.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		t = new Track(a, "RedHot", 145);
		assertEquals("2:25", t.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		Artist a1 = new Artist("Anitta");
		Artist a2 = new Artist("Becky G");
		List<Artist> c = new ArrayList<>();
		c.add(a2);
		
		CollaborationTrack ct = new CollaborationTrack(a1, c, "RedHot", 0);
		assertEquals("Anitta (feat. Becky G)", ct.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		Artist a1 = new Artist("Anitta");
		Artist a2 = new Artist("Ludmilla");
		Artist a3 = new Artist("Snoop Dog");
		List<Artist> c = new ArrayList<>();
		c.add(a2);
		c.add(a3);
		
		CollaborationTrack ct = new CollaborationTrack(a1, c, "RedHot", 0);
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", ct.getFullArtistName());
	}
}
