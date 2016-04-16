package game.elements;

public class Ball {
	private Double xSpeed;
	private Double ySpeed;
	private Double xLocation;
	private Double yLocation;
	private Double xAcceleration;
	private Double yAcceleration;
	
	private static Ball theBall;
	
	private Ball(){
		Pitch thePitch = Pitch.getPitch();
		this.xLocation = thePitch.getWidth() / 2.0;
		this.yLocation = thePitch.getLength() / 2.0;
		this.xAcceleration = 0.0;
		this.yAcceleration = 0.0;
		this.xSpeed = 0.0;
		this.ySpeed = 0.0;
	}
	
	public static Ball getBall(){
		if (theBall == null){
			theBall = new Ball();
		}
		return theBall;
	}
	
	public boolean isOutOfBounds(){
		Pitch thePitch = Pitch.getPitch();
		if (xLocation < 0.0){
			Pitch.Goal goal1 = thePitch.getGoal1();
			if(goal1.isBallInGoal(this)){
				//Score!
				return true;
			} else {
				//set up corner kick
				return true;
			}
		} else if (xLocation > thePitch.getWidth()){
			Pitch.Goal goal2 = thePitch.getGoal2();
			if(goal2.isBallInGoal(this)){
				//Score!
				return true;
			} else {
				//set up corner kick
				return true;
			}
		} else if (yLocation < 0){
			//throw in
			yLocation = 0.0;
			return true;
		} else if (yLocation > thePitch.getLength()){
			//throw in
			yLocation = thePitch.getLength();
			return true;
		} else {
			return false;
		}
	}
	
	public Double getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(Double xSpeed) {
		this.xSpeed = xSpeed;
	}
	public Double getySpeed() {
		return ySpeed;
	}
	public void setySpeed(Double ySpeed) {
		this.ySpeed = ySpeed;
	}
	public Double getxLocation() {
		return xLocation;
	}
	public void setxLocation(Double xLocation) {
		this.xLocation = xLocation;
	}
	public Double getyLocation() {
		return yLocation;
	}
	public void setyLocation(Double yLocation) {
		this.yLocation = yLocation;
	}
	public Double getxAcceleration() {
		return xAcceleration;
	}
	public void setxAcceleration(Double xAcceleration) {
		this.xAcceleration = xAcceleration;
	}
	public Double getyAcceleration() {
		return yAcceleration;
	}
	public void setyAcceleration(Double yAcceleration) {
		this.yAcceleration = yAcceleration;
	}
	
	public void kick(Double xSpeed, Double ySpeed){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void throwIn(){
		//TODO: logic!
	}
	
	public void cornerKick(){
		//TODO: logic!
	}
	
	public void kick(){
		
	}
}
