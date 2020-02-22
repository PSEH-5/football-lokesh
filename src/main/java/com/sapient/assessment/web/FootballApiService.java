package com.sapient.assessment.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.sapient.assessment.config.FootballAppConfig;
import com.sapient.assessment.pojo.Country;
import com.sapient.assessment.pojo.League;
import com.sapient.assessment.pojo.LeagueStanding;

@Component
public class FootballApiService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private FootballAppConfig appConfig;

	public List<Country> getAllCountries() {
		String url = new StringBuilder().append(appConfig.getHostUrl()).toString();

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("action", appConfig.getApiCountries()).queryParam("APIkey", appConfig.getApiKey());

		ResponseEntity<List<Country>> countries = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Country>>() {
				});

		return countries.getBody();
	}

	public List<League> getLeageForCountry(String country) {
		String url = new StringBuilder().append(appConfig.getHostUrl()).toString();

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("action", appConfig.getApiLeagues()).queryParam("country_id", country)
				.queryParam("APIkey", appConfig.getApiKey());

		ResponseEntity<List<League>> countries = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<League>>() {
				});

		return countries.getBody();
	}

	public List<LeagueStanding> getStandingForCountry(String league) {
		String url = new StringBuilder().append(appConfig.getHostUrl()).toString();

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("action", appConfig.getApiStandings()).queryParam("league_id", league)
				.queryParam("APIkey", appConfig.getApiKey());

		ResponseEntity<List<LeagueStanding>> countries = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,
				null, new ParameterizedTypeReference<List<LeagueStanding>>() {
				});

		return countries.getBody();
	}
}
