package com.sapient.assessment.football;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.sapient.assessment.pojo.Country;
import com.sapient.assessment.pojo.League;
import com.sapient.assessment.pojo.LeagueStanding;
import com.sapient.assessment.pojo.StandingResult;
import com.sapient.assessment.service.IFootballStanding;

@Component
public class FootballLeagueStandingService {

	@Autowired
	@Qualifier("standingService")
	private IFootballStanding standingService;

	public StandingResult getFinalStandingPosition(String countryNm, String leagueNm, String teamNm) {
		StandingResult result = new StandingResult();

		Country c = this.standingService.findCountryByName(countryNm);
		if (c == null) {
			throw new RuntimeException("Country not found");
		}
		result.setCountryNm(countryNm);
		result.setCountryId(c.getCountryId());

		League league = this.standingService.findLeagueByCountryId(result.getCountryId());

		if (league == null) {
			throw new RuntimeException("No leagues");
		}

		result.setLeagueId(league.getLeagueId());
		result.setLeagueNm(leagueNm);

		List<LeagueStanding> standings = this.standingService.findStandingForTeam(result.getLeagueId());

		standings = standings.stream()
				.filter(standing -> standing.getCountryNm().equals(countryNm) && standing.getTeamName().equals(teamNm))
				.collect(Collectors.toList());

		if (!CollectionUtils.isEmpty(standings)) {
			LeagueStanding standing = standings.get(0);

			result.setTeamId(standing.getTeamId());
			result.setTeamNm(standing.getTeamName());
			result.setStandingPosition(standing.getOverallLeaguePosition());
		} else {
			throw new RuntimeException("No country/team in this League");
		}

		return result;

	}
}
