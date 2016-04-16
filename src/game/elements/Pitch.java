package game.elements;

public class Pitch {
	
	private final Team team1 = new Team(1);
	private final Team team2 = new Team(2);
	private final Referee ref = new Referee();
	
	public class Goal {
		
		private Double length = new Double(7.32);
		private Double post1;
		private Double post2;
		private Double width;
		public Goal(Double pitchLength, Double pitchWidth) {
			post1 = (pitchLength / 2) - (length / 2);
			post2 = (pitchLength / 2) + (length / 2);
			width = pitchWidth;
		}
		
		public boolean isBallInGoal(Ball ball){
			if (ball.getxLocation().equals(width) && isBetween(ball.getyLocation())){
				return true;
			}
			return false;
		}
		
		private boolean isBetween(Double yPosition){
			return (yPosition.doubleValue() > post1.doubleValue() && 
					yPosition.doubleValue() < post2.doubleValue());

		}

	}
	
	private Ball theBall = Ball.getBall();
	
	private Pitch(){
		
	}
	
	private static Pitch thePitch;
	
	public static Pitch getPitch(){
		if (thePitch == null){
			thePitch = new Pitch();
		}
		return thePitch;
	}
	
	private Double width = new Double(105);
	private Double length = new Double(68);
	private Goal goal1 = new Goal(length, new Double(0));
	private Goal goal2 = new Goal(length, width);

	public Double getWidth(){
		return width;
	}
	
	public Double getLength(){
		return length;
	}

	public Goal getGoal1() {
		return goal1;
	}

	public Goal getGoal2() {
		return goal2;
	}

	public Ball getTheBall() {
		return theBall;
	}

	public void setTheBall(Ball theBall) {
		this.theBall = theBall;
	}

	public Team getTeam2() {
		return team2;
	}

	public Team getTeam1() {
		return team1;
	}

	public Referee getRef() {
		return ref;
	}

	
}
