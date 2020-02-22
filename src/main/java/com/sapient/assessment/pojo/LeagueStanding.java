package com.sapient.assessment.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeagueStanding {
	@JsonProperty("country_name")
	private String countryNm;

	@JsonProperty("league_id")
	private String leagueId;

	@JsonProperty("league_name")
	private String leagueName;

	@JsonProperty("team_id")
	private String teamId;

	@JsonProperty("team_name")
	private String teamName;

	@JsonProperty("overall_league_position")
	private String overallLeaguePosition;

	/**
	 * @return the countryNm
	 */
	public String getCountryNm() {
		return countryNm;
	}

	/**
	 * @param countryNm the countryNm to set
	 */
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}

	/**
	 * @return the leagueId
	 */
	public String getLeagueId() {
		return leagueId;
	}

	/**
	 * @param leagueId the leagueId to set
	 */
	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	/**
	 * @return the leagueName
	 */
	public String getLeagueName() {
		return leagueName;
	}

	/**
	 * @param leagueName the leagueName to set
	 */
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the overallLeaguePosition
	 */
	public String getOverallLeaguePosition() {
		return overallLeaguePosition;
	}

	/**
	 * @param overallLeaguePosition the overallLeaguePosition to set
	 */
	public void setOverallLeaguePosition(String overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}

}
