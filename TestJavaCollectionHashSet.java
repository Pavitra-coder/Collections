import java.util.*;
public class TestJavaCollectionHashSet
{
	public static void main(String args[]){
		//Creating HashSet and adding elements
		Set<String> set=new HashSet<String>();
		set.add("Gautam");
		set.add("Karan");
		set.add("Ajay");
		set.add("Karan");
		//Traversing elements
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());		
		}
	}
}