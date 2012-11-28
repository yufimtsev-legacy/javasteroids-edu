import java.awt.Point;


public class Bullet extends GameObject {
	private int distance; //пройденное пулей расстояние (для самоуничтожения)
	
	public Bullet(Point position, Point vector)
	{
		super(position, vector); //вызов конструктора GameObject
		this.setDistance(0);
	}
	
	public int CheckCollision(GameObject obj)
	{
		return 0;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
