import java.awt.Point;

public class Asteroid extends GameObject {
	private int size; //������ ��������� (������)
	private int childsize; //������ "�����" ���������
	private int childcount; //���������� ������� "�����"
	
	public Asteroid(Point position, Point vector, int size)
	{
		super(position, vector); //����� ������������ GameObject
		this.setSize(size);
	}
	public Asteroid(Point position, Point vector, int size, int childsize, int childcount)
	{
		super(position, vector); //����� ������������ GameObject
		this.setSize(size);
		this.setChildsize(childsize);
		this.setChildcount(childcount);
	}
	public int CheckCollision(GameObject obj)
	{
		return 0;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChildsize() {
		return childsize;
	}
	public void setChildsize(int childsize) {
		this.childsize = childsize;
	}
	public int getChildcount() {
		return childcount;
	}
	public void setChildcount(int childcount) {
		this.childcount = childcount;
	}
}
