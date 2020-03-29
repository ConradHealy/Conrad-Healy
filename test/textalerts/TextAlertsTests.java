package textalerts;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextAlertsTests {

	// Test number 1.
//	@Test
//	public void attenderInitiallyAnswersThatGameIsScoreless() {
//		MatchAttender attender = new MatchAttender();
//		assertEquals("0-0", attender.getScore());
//	}

	//Test number 2.
//	@Test
//	public void attenderKeepsTrackOfScore() {
//		MatchAttender attender = new MatchAttender();
//		attender.updateGameKnowledge("Home", 12, "Firmino");
//		assertEquals("1-0", attender.getScore());
//		attender.updateGameKnowledge("Home", 29, "Salah");
//		assertEquals("2-0", attender.getScore());
//		attender.updateGameKnowledge("Away", 44, "Aguero");
//		assertEquals("2-1", attender.getScore());
//	}

	// Test number 3.
//	@Test
//	public void attenderKnowsTimeOfLastGoal() {
//		MatchAttender attender = new MatchAttender();
//		attender.updateGameKnowledge("Home", 22, "Firmino");
//		assertEquals(22, attender.getTimeOfLastGoal());
//	}

	// Test number 4.
//	@Test
//	public void attenderKnowsLastScorer() {
//		MatchAttender attender = new MatchAttender();
//		attender.updateGameKnowledge("Away", 22, "Firmino");
//		assertEquals("Firmino", attender.getLastScorer());
//	}


	// Test number 5.
//	@Test
//	public void shouldNotifyAbsentFansWhoAreSubscribed() {
//		MatchAttender attender = new MatchAttender();
//		AbsentFan john = new AbsentFan("John", attender, "Home");
//		AbsentFan jane = new AbsentFan("Jane", attender, "Away");
//		john.subscribeToAlerts();
//		attender.updateGameKnowledge("Home", 12, "Firmino");
//		assertEquals("1-0", john.getScore());
//		assertEquals(null, jane.getScore());
//		attender.updateGameKnowledge("Away", 44, "Aguero");
//		assertEquals("1-1", john.getScore());
//		assertEquals(null, jane.getScore());
//	}

	// Test number 6.
//	@Test
//	public void supportersShouldBeHappyWhenTeamScores() {
//		MatchAttender attender = new MatchAttender();
//		AbsentFan john = new AbsentFan("John", attender, "Home");
//		AbsentFan jane = new AbsentFan("Jane", attender, "Away");
//		john.subscribeToAlerts();		
//		jane.subscribeToAlerts();
//		attender.updateGameKnowledge("Home", 12, "Firmino");
//		assertTrue(john.isHappy());
//		assertFalse(jane.isHappy());
//		attender.updateGameKnowledge("Away", 44, "Rashford");
//		assertFalse(john.isHappy());
//		assertTrue(jane.isHappy());
//	}

	// Test number 7.
//	@Test
//	public void supportersShouldKnowOtherDetails() {
//		MatchAttender attender = new MatchAttender();
//		AbsentFan john = new AbsentFan("John", attender, "Home");
//		AbsentFan jane = new AbsentFan("Jane", attender, "Away");
//		john.subscribeToAlerts();
//		jane.subscribeToAlerts();
//		attender.updateGameKnowledge("Home", 12, "Firmino");
//		assertEquals("Firmino", john.getLastScorer());
//		assertEquals(12, john.getTimeOfLastGoal());
//	}

	// Test number 8.
//	@Test
//	public void sportsReportersCanBeNotified() {
//		MatchAttender attender = new MatchAttender();
//		SportsReporter megan = new SportsReporter("Megan", attender);
//		megan.subscribeToAlerts();
//		attender.updateGameKnowledge("Home", 12, "Firmino");
//		assertEquals("Firmino has scored for the Home team in the 12th minute.",
//				megan.getLastReport());
//		attender.updateGameKnowledge("Away", 43, "Rashford");
//		assertEquals("Rashford has scored for the Away team in the 43rd minute.",
//				megan.getLastReport());
//	}

	// Test number 9.
//	@Test
//	public void footballScoutCanBeNotified() {
//		MatchAttender attender = new MatchAttender();
//		FootballScout fred = new FootballScout("Fred", attender);
//		fred.subscribeToAlerts();
//		assertFalse(fred.isInterestedIn("Firmino"));
//		assertFalse(fred.isInterestedIn("Rashford"));
//		attender.updateGameKnowledge("Home", 12, "Firmino");
//		assertTrue(fred.isInterestedIn("Firmino"));
//		assertFalse(fred.isInterestedIn("Rashford"));
//		attender.updateGameKnowledge("Away", 43, "Rashford");
//		assertTrue(fred.isInterestedIn("Firmino"));
//		assertTrue(fred.isInterestedIn("Rashford"));
//	}

	// Test number 10.
//	@Test
//	public void displayScreenCanBeNotified() {
//		MatchAttender attender = new MatchAttender();
//		DisplayScreen screen = new DisplayScreen();
//		attender.addMatchListener(screen);
//		attender.updateGameKnowledge("Home", 12, "Firmino");
//		assertEquals("Update: Firmino has scored for the Home team (12).",
//				screen.getMessage());
//		attender.updateGameKnowledge("Away", 43, "Rashford");
//		assertEquals("Update: Rashford has scored for the Away team (43).",
//				screen.getMessage());
//	}
	
}
