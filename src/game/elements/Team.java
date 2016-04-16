package game.elements;

public class Team {

	public Team(int id){
		this.id = id;
	}
	
	private Integer score = 0;
	private int id;

	public int getId(){
		return id;
	}
	
	private boolean hasball = false;
	
	private final Goalie goalie = new Goalie(id);
	//todo: set initial positions
	private final Player centerForward = new Player(null, null, id, 6.0);
	private final Player rtForward = new Player(null, null, id, 6.0);
	private final Player lfForward = new Player(null, null, id, 5.5);
	private final Player rtMidfield = new Player(null, null, id, 5.5);
	private final Player centerMidfield = new Player(null, null, id, 5.5);
	private final Player leftMidfield = new Player(null, null, id, 5.5);
	private final Player leftDefender = new Player(null, null, id, 5.0);
	private final Player rightDefender = new Player(null, null, id, 5.0);
	private final Player lfCtDefender = new Player(null, null, id, 4.5);
	private final Player rtCtDefender = new Player(null, null, id, 4.5);
	
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public boolean hasBall() {
		return hasball;
	}
	public void setHasball(boolean hasball) {
		this.hasball = hasball;
	}
	public Goalie getGoalie() {
		return goalie;
	}
	public Player getCenterForward() {
		return centerForward;
	}
	public Player getRtForward() {
		return rtForward;
	}
	public Player getLfForward() {
		return lfForward;
	}
	public Player getRtMidfield() {
		return rtMidfield;
	}
	public Player getCenterMidfield() {
		return centerMidfield;
	}
	public Player getLeftMidfield() {
		return leftMidfield;
	}
	public Player getLeftDefender() {
		return leftDefender;
	}
	public Player getRightDefender() {
		return rightDefender;
	}
	public Player getLfCtDefender() {
		return lfCtDefender;
	}
	public Player getRtCtDefender() {
		return rtCtDefender;
	}
}
