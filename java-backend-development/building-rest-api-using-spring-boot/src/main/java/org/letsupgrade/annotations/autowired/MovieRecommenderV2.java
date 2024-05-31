package org.letsupgrade.annotations.autowired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("movieRecommenderV2")
public class MovieRecommenderV2 {
	
	@Autowired
	private PopularMovieRecommender popularMovieRecommender;
	
	// Constructor Injection
	/*
	 
	public MovieRecommenderV2( PopularMovieRecommender popularMovieRecommender) {
		this.popularMovieRecommender = popularMovieRecommender;
	}
	
	*/

	public List<String> getMovieRecommendations(){
		return popularMovieRecommender.getMovieNames();
	}
	
	/*
	 * @Autowired public void setPopularMovieRecommender(PopularMovieRecommender
	 * popularMovieRecommender) { this.popularMovieRecommender =
	 * popularMovieRecommender; }
	 */
}
