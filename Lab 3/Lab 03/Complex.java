public class Complex implements Cloneable {
  //instance variables
    private double a;
    private double b;
  
  //constructors
  public Complex() {
    this(0);
  }

  public Complex(double a) {
    this(a,0);
  }
  
  public Complex(double a, double b) {
    this.a = a;
    this.b = b;
  }

 //methods
 public double getRealPart(){
     return a;
 }
 
 public double getImaginaryPart(){
     return b;
 }

//method returns Complex obj 
//inside method uses constructors 
//a + bi + c + di = (a + c) + (b + d)i  
 public Complex add(Complex myObj){
     return new Complex((a + myObj.a), (b + myObj.b));
 }
 
 //a + bi − (c + di) = (a − c) + (b − d)i 
 public Complex subtract(Complex myObj){
     return new Complex((a - myObj.a), (b - myObj.b));
 }
 
 //(a + bi) ∗ (c + di) = (ac − bd) + (bc + ad)i 
 public Complex multiply(Complex myObj){
     return new Complex((a * myObj.a - b * myObj.b), (b * myObj.a + a * myObj.b));
 }
 
 //(a + bi) ∕ (c + di) = (ac + bd) ∕ (c2 + d2) + (bc − ad)i ∕ (c2 + d2)
 public Complex divide(Complex myObj){
     return new Complex( (a*myObj.a+b*myObj.b) / ((Math.pow(myObj.a, 2) + Math.pow(myObj.b, 2))),
                            (b * myObj.a - a * myObj.b) / ((Math.pow(myObj.a, 2) + Math.pow(myObj.b, 2))));
 }
 
 public double abs(){
     return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
 }
 
 @Override
 public String toString(){
    if(b == 0)
        return " " + a;
    else
        return " " + (a+b*Math.sqrt(-1));
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
