

public class TestGeometricObject {
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize two geometric objects
    GeometricObject geoObject1 = new Circle(5);
    GeometricObject geoObject2 = new Rectangle(5, 3);
    
    //test array object list
    GeometricObject[] listGeoObj = {new Circle(2), geoObject1, new Circle(5), new Rectangle(2,2), new Rectangle(3,2), new Circle(7)};
	System.out.println("Testing object array///////////////////////////////////// \n");
	for (int i=0; i<6; i++){
		System.out.println("Object " + (i+1) + " information:");
		displayGeometricObject(listGeoObj[i]);
		System.out.println("\n");
	}
    
    System.out.println("The two objects have the same area? " +
      equalArea(geoObject1, geoObject2));

	  
	 //test Triangle class
	System.out.println("Testing Triangle Class///////////////////////////////////");
	GeometricObject tri1 = new Triangle(5,7,3);
	System.out.println(tri1.toString());
	System.out.println("Perimeter: " + tri1.getPerimeter());
	System.out.println("Area: " + tri1.getArea() + "\n");
	  
    // Display circle
    displayGeometricObject(geoObject1);

    // Display rectangle
    displayGeometricObject(geoObject2);
  }

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricObject object1,
      GeometricObject object2) {
    return object1.getArea() == object2.getArea();
  }

  /** A method for displaying a geometric object */
  public static void displayGeometricObject(GeometricObject object) {
    System.out.println("The area is " + object.getArea());
    System.out.println("The perimeter is " + object.getPerimeter());
  }
}

