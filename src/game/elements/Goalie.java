package game.elements;

public class Goalie extends Player {
	
	public Goalie(int team){
		super(3.0);
		Pitch p = Pitch.getPitch();
		if (team == 1){
			this.setxPosition(0.2);
			this.setyPosition(p.getLength() / 2.0 );
		} else if (team == 2){
			this.setxPosition(p.getWidth() - 0.2);
			this.setyPosition(p.getLength() / 2.0);
		}
	}
	
	public void runWithBall(){
		Ball theBall = Ball.getBall();
	}
	
	public void stopBall(){
		Ball theBall = Ball.getBall();
	}

}
