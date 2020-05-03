import java.util.*;
class TestJavaCollectionVector
{
	public static void main(String args[]){
		//Creating vector
		Vector<String> v=new Vector<String>();
		//adding object in vector
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		//Traversing list through iterator
		Iterator itr=v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());		
		}
	}
}