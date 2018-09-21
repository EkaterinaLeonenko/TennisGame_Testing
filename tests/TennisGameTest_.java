import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest_ {

	@Test

public void testTennisGame_firstplayerWins() throws TennisGameException {
	//Arrange
	TennisGame game = new TennisGame();
	
	game.player1Scored();
	game.player1Scored();
	game.player1Scored();
	
	game.player2Scored();

	game.player1Scored();

	//Act
	String score = game.getScore() ;
	// Assert
	assertEquals("Player1 wins incorrect", "player1 wins", score);		
	}

	@Test
	public void testTennisGame_2playerWins() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();

		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Player2 wins incorrect", "player2 wins", score);		
		}
	@Test


public void testTennisGame_describingScorelove() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("love incorrect", "love - love", score);

	}
	
	@Test
// This test failed
// Because of bug in public getScore (wrong players order, fixed)

/*
 * We can't test individual scores, because they are in private getScore method,
 * so we should test public getScore for score of two players
 */
public void testTennisGame_describingScore15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("15 incorrect", "15 - love", score);

	}
	
	@Test
//This test failed
// Because of bug in public getScore (wrong players order, fixed)
	
/*
 * We can't test individual scores, because they are in private getScore method,
 * so we should test public getScore for score of two players
 */
public void testTennisGame_describingScore30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("30 incorrect", "30 - love", score);

	}
	
@Test
//This test failed
//Because of bug in public getScore (wrong players order, fixed)

/*
 * We can't test individual scores, because they are in private getScore method,
 * so we should test public getScore for score of two players
 */
public void testTennisGame_describingScore40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("40 incorrect", "40 - love", score);

	}

@Test
//This test failed
//Bug in getScore for deuce, 4 points instead 3, fixed
public void testTennisGame_deuce() throws TennisGameException {
	//Arrange
	TennisGame game = new TennisGame();
	
	game.player1Scored();
	game.player1Scored();
	game.player1Scored();
	
	game.player2Scored();
	game.player2Scored();
	game.player2Scored();

	//Act
	String score = game.getScore() ;
	// Assert
	assertEquals("deuce incorrect", "deuce", score);		
	}

@Test

public void testTennisGame_advantage() throws TennisGameException {
	//Arrange
	TennisGame game = new TennisGame();
	
	game.player1Scored();
	game.player1Scored();
	game.player1Scored();
	
	game.player2Scored();
	game.player2Scored();
	game.player2Scored();

	game.player1Scored();

	//Act
	String score = game.getScore() ;
	// Assert
	assertEquals("player1 has advantage incorrect", "player1 has advantage", score);		
	}

@Test
//This test failed
//if (player2Points > 4 && player2Points - player1Points == 1)
//Should be >=, not just >
//fixed
public void testTennisGame_advantage2() throws TennisGameException {
	//Arrange
	TennisGame game = new TennisGame();
	
	game.player2Scored();
	game.player2Scored();
	game.player2Scored();
	
	game.player1Scored();
	game.player1Scored();
	game.player1Scored();

	game.player2Scored();

	//Act
	String score = game.getScore() ;
	// Assert
	assertEquals("player2 has advantage incorrect", "player2 has advantage", score);		
	}
}