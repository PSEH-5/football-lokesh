package com.sapient.assessment.service;

import java.util.List;

import com.sapient.assessment.pojo.Country;
import com.sapient.assessment.pojo.League;
import com.sapient.assessment.pojo.LeagueStanding;
import com.sapient.assessment.pojo.ResponseDetails;

public interface IFootballStanding {
	Country findCountryByName(String name);

	League findLeagueByCountryId(String countryId);

	ResponseDetails findTeamsByLeagueId(String leagueId);

	List<LeagueStanding> findStandingForTeam(String leagueId);

}
