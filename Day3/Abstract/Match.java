
public abstract class Match {
	private int current_score;
	private float current_over;
	private int target;
	public int getCurrent_score() {
		return current_score;
	}
	public void setCurrent_score(int current_score) {
		this.current_score = current_score;
	}
	public float getCurrent_over() {
		return current_over;
	}
	public void setCurrent_over(float current_over) {
		this.current_over = current_over;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public abstract float calculateRunRate();
	public abstract	int calculateBalls();
	public abstract	void display(double reqRunrate, int balls);
	
}
