package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(800,800);
		Circle c1 = new Circle(400,400,300);
		Line l1 = new Line(525,550,275,550);
		Circle c2 = new Circle(250,300,15);
		Circle c3 = new Circle(550,300,15);
		pic.add(c1);
		pic.add(l1);
		pic.add(c2);
		pic.add(c3);
		pic.draw();	
	}
}
