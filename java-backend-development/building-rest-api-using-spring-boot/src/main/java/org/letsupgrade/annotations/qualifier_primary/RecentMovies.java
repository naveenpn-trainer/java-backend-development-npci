package org.letsupgrade.annotations.qualifier_primary;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("recentMovies")
public class RecentMovies implements Movie{

	@Override
	public List<String> getMovieNames() {
		return Arrays.asList("Latest Movie01","Latest Movie02");
	}

}
