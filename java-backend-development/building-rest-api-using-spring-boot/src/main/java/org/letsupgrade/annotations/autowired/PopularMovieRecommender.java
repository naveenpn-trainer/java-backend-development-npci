package org.letsupgrade.annotations.autowired;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PopularMovieRecommender {

	public List<String> getMovieNames(){
		return Arrays.asList("3 idiots","Roja");
	}
}
