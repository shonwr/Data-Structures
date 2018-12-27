Import  java.util.ArrayList;

public class TestArrayList{
	public static void main(String[] args){
		ArrayList<Integer> tmp = new ArrayList();
		System.out.println(tmp);
		tmp.add(12);
		System.out.println(tmp);
		for(int i=0; i<100; i++){
			tmp.add(i+1 * 10);
		}
		System.out.println(tmp);
		
		String[] temp = {"Los Angeles", "San Francisco", "Sylmar", "Anaheim", "Universal City"};
		ArrayList<String> names = new ArrayList();
		for(int i=0; temp.length; i++){
			names.add(temp[i]);
		}
		
		System.out.println("Size of names: " + names.size());
		System.out.println("Cities:" + names);
	}
}