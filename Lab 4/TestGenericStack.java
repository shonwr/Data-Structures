public static void main(String[] args){
        GenericStackArray<String> test = new GenericStackArray();
        System.out.println(test.toString());
        test.push("One");
        test.push("Two");
        test.push("Three");
        test.push("Four");
        System.out.println(test.toString());
        System.out.println("Size of stack: " + test.getSize());
        System.out.println("Top of stack: " + test.peek());
        String o = test.pop();
        System.out.println("After one Pop: \n" + test.toString());
        o = test.pop();
        o = test.pop();
        if (test.isEmpty()) { 
                 System.out.println("Is stack empty:" + test.isEmpty());}
        else {
                 o = test.pop(); 
                 System.out.println("Element left was: " + o);}
        System.out.println("Is stack empty:" + test.isEmpty());
 }