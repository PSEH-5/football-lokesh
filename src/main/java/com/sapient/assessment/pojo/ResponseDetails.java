package com.sapient.assessment.pojo;

public class ResponseDetails {

	private StandingResult results;
	private boolean isSuccess;
	private String message;

	/**
	 * @return the results
	 */
	public StandingResult getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(StandingResult results) {
		this.results = results;
	}

	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}

	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
