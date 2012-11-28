import java.awt.Point;

public class Ship extends GameObject {
	private int angle; //угол поворота корабля
	
	public Ship(Point position, Point vector, int angle)
	{
		super(position, vector); //вызов конструктора GameObject
		this.setAngle(angle);
	}
	
	public int CheckCollision(GameObject obj)
	{
		return 0;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}
}
