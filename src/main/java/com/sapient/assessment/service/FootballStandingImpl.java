package com.sapient.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.assessment.pojo.Country;
import com.sapient.assessment.pojo.League;
import com.sapient.assessment.pojo.LeagueStanding;
import com.sapient.assessment.pojo.ResponseDetails;
import com.sapient.assessment.web.FootballApiService;

@Service("standingService")
public class FootballStandingImpl implements IFootballStanding {

	@Autowired
	private FootballApiService footballApiService;

	/**
	 * @param name
	 * @return {@link Country}
	 */
	public Country findCountryByName(String name) {
		List<Country> allCountries = footballApiService.getAllCountries();

		Optional<Country> countryPrd = allCountries.stream().filter(country -> name.equals(country.getCountryName()))
				.findFirst();
		return countryPrd.isPresent() ? countryPrd.get() : null;
	}

	/**
	 * @param countryId
	 * @return {@link League}
	 */
	public League findLeagueByCountryId(String countryId) {
		List<League> allLeagues = footballApiService.getLeageForCountry(countryId);

		Optional<League> leaguePrd = allLeagues.stream().filter(league -> countryId.equals(league.getCountryId()))
				.findFirst();
		return leaguePrd.isPresent() ? leaguePrd.get() : null;
	}

	public ResponseDetails findTeamsByLeagueId(String leagueId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param leagueId
	 * @return {@link LeagueStanding}
	 */
	public List<LeagueStanding> findStandingForTeam(String leagueId) {

		return footballApiService.getStandingForCountry(leagueId);

	}

}
