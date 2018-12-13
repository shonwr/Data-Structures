public class Triangle extends GeometricObject {
  private double side1;
  private double side2;
  private double side3;

  
  //constructors
  public Triangle() {
  }

  public Triangle(double side1, double side2, double side3) {
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
  }
  
  public Triangle(double side1, double side2, double side3, String color, boolean filled) {
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
  }

 //setters
 public void setSide1(double side1){
	 this.side1 = side1;
	 
 }
 public void setSide2(double side2){
	 this.side2 = side2;
	 
 }
 public void setSide3(double side3){
	 this.side3 = side3;
	 
 }
 
 //getters
 
 public double getSide1(){
	 return this.side1;
 }
 
 public double getSide2(){
	 return this.side2;
 }
 
 public double getSide3(){
	 return this.side3;
 }
 
 @Override
 public double getPerimeter(){
	 return (this.side1 + this.side2 + this.side3);
 }
 
 @Override
 public double getArea(){
	 double s = (getPerimeter()*.5);
	 return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
 }
 
 @Override
 public String toString(){
	 return ("Side 1: " + getSide1() + " Side 2: " + getSide2() + " Side 3: " + getSide3());
 }
 
 /*
 private double getHeight(){
	 
 }
 */
 
 /*

  @Override /** Return area */
  
/*
  public double getArea() {
    return width * height;
  }
  @Override /** Return perimeter */ 
  
 /*
  public double getPerimeter() {
    return 2 * (width + height);
  }
 */
}

