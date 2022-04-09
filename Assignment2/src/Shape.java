abstract class ShapeAll
{
	abstract void draw();
	
}
class Rectangle extends ShapeAll
{

	
	
	@Override
	void draw() {
		System.out.println("I am a rectangle class");
		
	}
	
}

class Line extends ShapeAll
{

	@Override
  public void draw() {
		System.out.println("I am Line");
	}
	
}
class Cube extends ShapeAll
{

	@Override
	void draw() {
		System.out.println("I am cube");
		
	}
	
}


public class Shape {
	public static void main(String[] args)
	{
		ShapeAll s=new Line();
		s.draw();
	}

}
