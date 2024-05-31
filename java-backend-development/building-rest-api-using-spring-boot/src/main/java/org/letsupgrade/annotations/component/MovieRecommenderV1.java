package org.letsupgrade.annotations.component;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("movieRecommenderV1")
public class MovieRecommenderV1 {

	public List<String> getMovieRecommendations(){
		return Arrays.asList("Movie01","Movie02");
	}
}
