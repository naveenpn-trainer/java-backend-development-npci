package org.letsupgrade.annotations.qualifier_primary;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("popularMovies")
public class PopularMovies implements Movie{

	@Override
	public List<String> getMovieNames() {
		return Arrays.asList("Popular Movie01","Popular Movie02");
	}

}
