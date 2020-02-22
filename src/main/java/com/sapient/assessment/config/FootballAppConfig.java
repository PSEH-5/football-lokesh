package com.sapient.assessment.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("football")
public class FootballAppConfig {

	private String hostUrl;

	private String apiKey;

	private String apiCountries;

	private String apiLeagues;

	private String apiTeams;

	private String apiStandings;

	/**
	 * @return the hostUrl
	 */
	public String getHostUrl() {
		return hostUrl;
	}

	/**
	 * @param hostUrl the hostUrl to set
	 */
	public void setHostUrl(String hostUrl) {
		this.hostUrl = hostUrl;
	}

	/**
	 * @return the apiKey
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * @param apiKey the apiKey to set
	 */
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * @return the apiCountries
	 */
	public String getApiCountries() {
		return apiCountries;
	}

	/**
	 * @param apiCountries the apiCountries to set
	 */
	public void setApiCountries(String apiCountries) {
		this.apiCountries = apiCountries;
	}

	/**
	 * @return the apiLeagues
	 */
	public String getApiLeagues() {
		return apiLeagues;
	}

	/**
	 * @param apiLeagues the apiLeagues to set
	 */
	public void setApiLeagues(String apiLeagues) {
		this.apiLeagues = apiLeagues;
	}

	/**
	 * @return the apiTeams
	 */
	public String getApiTeams() {
		return apiTeams;
	}

	/**
	 * @param apiTeams the apiTeams to set
	 */
	public void setApiTeams(String apiTeams) {
		this.apiTeams = apiTeams;
	}

	/**
	 * @return the apiStatings
	 */
	public String getApiStandings() {
		return apiStandings;
	}

	/**
	 * @param apiStatings the apiStatings to set
	 */
	public void setApiStandings(String apiStandings) {
		this.apiStandings = apiStandings;
	}

}
