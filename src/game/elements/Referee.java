package game.elements;

import java.util.Date;
import java.util.Timer;
import java.util.Random;

public class Referee {
	Date gameTime;
	Integer periods = 2;
	Integer minutesInPeriod = 45;
	Random rand = new Random();
	Integer stoppage1;
	Integer stoppage2;
	Integer period1;
	Integer period2;
	Timer timer;
	
	private Integer score1 = 0;
	private Integer score2 = 0;
	private Integer currentTime = 0;
	private Integer currentPeriod = 1;
	
	public Referee(){
		rand.setSeed(System.currentTimeMillis());
		stoppage1 = rand.nextInt() % 5 + 1;
		stoppage2 = rand.nextInt() % 5 + 1;
		period1 = minutesInPeriod + stoppage1;
		period2 = minutesInPeriod + stoppage2;
	}
	
	public boolean checkIsOffsides(){
		return true;
	}
	
	public boolean checkBallOutOfBounds(){
		return true;
	}

	public Integer getScore2() {
		return score2;
	}

	public void setScore2(Integer score2) {
		this.score2 = score2;
	}

	public Integer getScore1() {
		return score1;
	}

	public void setScore1(Integer score1) {
		this.score1 = score1;
	}

	public Integer getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Integer currentTime) {
		this.currentTime = currentTime;
	}

	public Integer getCurrentPeriod() {
		return currentPeriod;
	}

	public void updatePeriod() {
		this.currentPeriod = 2;
	}

}
