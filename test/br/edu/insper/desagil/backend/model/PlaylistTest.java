package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist p;

	@BeforeEach
	void setUp() {
		p = new Playlist(5);
	}

	@Test
	void testRoundDownToZero() {
		p.putRating("anitta", 1);
		p.putRating("rick", 2);
		p.putRating("alberto", 3);
		p.putRating("carlos", 3);
		double result = p.averageRatings();
		assertEquals(2.0, result, DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		p.putRating("anitta", 1);
		p.putRating("rick", 2);
		p.putRating("alberto", 1);
		double result = p.averageRatings();
		assertEquals(1.5, result, DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		p.putRating("anitta", 1);
		p.putRating("rick", 2);
		p.putRating("alberto", 2);
		double result = p.averageRatings();
		assertEquals(1.5, result, DELTA);
	}

	@Test
	void testRoundUpToOne() {
		p.putRating("anitta", 1);
		p.putRating("rick", 1);
		p.putRating("alberto", 2);
		p.putRating("carlos", 3);
		double result = p.averageRatings();
		assertEquals(2.0, result, DELTA);
	}
}
