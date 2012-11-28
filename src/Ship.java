import java.awt.Point;

public class Ship extends GameObject {
	private int angle; //���� �������� �������
	
	public Ship(Point position, Point vector, int angle)
	{
		super(position, vector); //����� ������������ GameObject
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
