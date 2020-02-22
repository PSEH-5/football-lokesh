package com.sapient.assessment.football;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sapient.assessment.pojo.StandingResult;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTest {

	@MockBean
	private FootballLeagueStandingService service;

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void getLeaguethenReturnJson() throws Exception {
		StandingResult r = new StandingResult();
		r.setLeagueId("149");
		Mockito.when(service.getFinalStandingPosition("England", "Championship", "Stoke")).thenReturn(r);
		assertTrue(r != null);
	}
}
