package oop_project;



public class Cube extends ThreeD_Shape {
	private double side;

	public Cube() {
		super();
		side=1.0;
	}

	public Cube(double s) {
		super();
		side = s;
	}
	
	public Cube (double s,String c)
	{
		super.getColor();
		side=s;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	public String toString() {
		return "Cube [side=" + side + "]";
	}
	
	public  double getVolum(){
		return Math.pow(this.side, 3) ;
	}
	
	public  double getArea()
	{
		return 6*this.side*this.side;
	}
	public  double getPerimeter() {
		return 12*this.side;
	}

	public String HowToDraw() {
		
		return "Cube";
	}
	public String HowToPrint()
	{
		return "way";
	}

}
