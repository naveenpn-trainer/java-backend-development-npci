package org.letsupgrade.annotations.qualifier_primary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("movieRecommenderV3")
public class MovieRecommenderV3 {
	
	
	private Movie movie;
	
	public MovieRecommenderV3(@Qualifier("recentMovies") Movie movie) {
		this.movie = movie;
	}

	public List<String> getMovieRecommendations(){
		return movie.getMovieNames();
	}
	
	
}
