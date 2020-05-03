import java.util.*;
public class TestJavaCollectionTreeSet
{
	public static void main(String args[]){
		//Creating TreeSet and adding elements
		SortedSet<String> set=new TreeSet<String>();
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