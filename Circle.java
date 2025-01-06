package oop_project;

public class Circle extends Shape{ 
		private double radius;
		
		public Circle() {
			super();
			radius=1.0;
		}
		public Circle(double r) {
			super();
			radius = r;
		}
		public Circle(double r,String c) {
			super(c);
			this.radius = r;
			
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double r) {
			radius = r;
		}
		
		public String toString() {
			return "Circle [radius=" + radius + "]";
		}
		public  double getArea()
		{
			return Math.PI*this.radius*this.radius;
		}
		public  double getPerimeter() {
			return 2*Math.PI*this.radius;
		}
		
		public String HowToDraw() {
			
			return "circle";
		}
		public String HowToPrint() {
			
			return "way";
		}
}
