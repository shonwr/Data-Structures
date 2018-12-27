import java.util.Arrays;
public class GenericStackArray<E> {
  //private java.util.ArrayList<E> list = new java.util.ArrayList<>();
  private int element;
  private int size = 10;
  private E[] myArray = (E[])new Object[size];

  GenericStackArray() {
	  this.element=0;
  }

  public int getSize() {
    return element;
  }
  
  public boolean isEmpty() {
    return (element == 0);
  }

  //fix these methods
  public void push(E o) {
        //if array full = create new array with double size and copy contents to new array 
	if (element == size) {
		E[] nextArray = (E[])new Object[size * 2];
		System.arraycopy(myArray, 0, nextArray, 0, myArray.length);
		myArray = nextArray;
	}
	myArray[element] = o;
	element++;
  }

  public E pop() {
    if(element == 0){
		return null;
    }else{
		//create temp E var to hold pop'd element
		//return temp var 
        E tmp = myArray[element-1];
		myArray[element-1] = null;
		element--;
		return tmp;
	}
  }
  
    public E peek() {
		if(element == 0){
			return null;
		}
		else{
			return myArray[element-1];
		}
	}


  @Override
  public String toString() {
	return "stack: " + Arrays.toString(myArray);
  }
}

/*
stack: [null, null, null, null, null, null, null, null, null, null]
stack: [One, Two, Three, Four, null, null, null, null, null, null]
Size of stack: 4
Top of stack: Four
After one Pop: 
stack: [One, Two, Three, null, null, null, null, null, null, null]
Element left was: One
Is stack empty:true
*/