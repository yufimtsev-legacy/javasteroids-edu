import java.awt.Point;


public abstract class GameObject {
	private Point position;
	private Point vector;
	
	abstract public int CheckCollision(GameObject obj);
	
	public GameObject(Point position, Point vector)
	{
		this.setPosition(position);
		this.setVector(vector);
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
	
	public Point getVector() {
		return vector;
	}

	public void setVector(Point vector) {
		this.vector = vector;
	}

}
