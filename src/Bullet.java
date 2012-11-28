import java.awt.Point;


public class Bullet extends GameObject {
	private int distance; //���������� ����� ���������� (��� ���������������)
	
	public Bullet(Point position, Point vector)
	{
		super(position, vector); //����� ������������ GameObject
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
