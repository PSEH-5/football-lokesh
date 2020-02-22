package com.sapient.assessment.football;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assessment.pojo.ResponseDetails;

@RestController
@RequestMapping("footballstandings")
public class FootballController {

	@Autowired
	private FootballLeagueStandingService footballLeagueStandingService;

	@RequestMapping(method = RequestMethod.GET, path = "getStandingByTeamCountryLeague", produces = "application/json")
	public ResponseDetails getStandingByTeamCountryLeague(@RequestParam String countryName,
			@RequestParam String leagueName, @RequestParam String teamName) {
		ResponseDetails r = new ResponseDetails();
		try {

			r.setResults(
					this.footballLeagueStandingService.getFinalStandingPosition(countryName, leagueName, teamName));
			r.setSuccess(true);
			r.setMessage("Found");
		} catch (Exception e) {
			e.printStackTrace();
			r.setResults(null);
			r.setSuccess(false);
			r.setMessage(e.getMessage());
		}
		return r;
	}
}
