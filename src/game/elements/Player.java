package game.elements;


public class Player {
	private Double yPosition;
	private Double xPosition;
	private Double xSpeed;
	private Double ySpeed;
	
	private Double maxSpeed;
	
	private enum Team {Team1, Team2};
	
	Team team;
	
	public Player(Double xPosition, Double yPosition, int team, Double maxSpeed){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.maxSpeed = maxSpeed;
		if (team == 1){
			this.team = Team.Team1;
		} else if (team == 2){
			this.team = Team.Team2;
		}
	}

	public Player(Double maxSpeed) {
		//for Goalie use
		this.maxSpeed = maxSpeed;
	}

	public Double getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(Double xSpeed) {
		this.xSpeed = xSpeed;
	}
	public double getySpeed() {
		return ySpeed;
	}
	public void setySpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	public Double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public boolean goingTooFast(){
		Double velocity = Math.sqrt(Math.pow(xSpeed.doubleValue(), 2) + Math.pow(ySpeed.doubleValue(), 2));
		return velocity > maxSpeed;
	}
	
	public void collide(Player otherGuy){
		otherGuy.xSpeed = 0.0;
		otherGuy.ySpeed = 0.0;
		xSpeed = 0.0;
		ySpeed = 0.0;
	}
	
	public void run(){
		//TODO: set speed
	}

	public Double getyPosition() {
		return yPosition;
	}

	public void setyPosition(Double yPosition) {
		this.yPosition = yPosition;
	}

	public Double getxPosition() {
		return xPosition;
	}

	public void setxPosition(Double xPosition) {
		this.xPosition = xPosition;
	}

}
