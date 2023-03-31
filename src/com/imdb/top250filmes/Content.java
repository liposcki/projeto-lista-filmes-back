package com.imdb.top250filmes;

public interface Content extends Comparable<Content> {

	String title();
	String urlImage();
	String rating();
	String year();
}
