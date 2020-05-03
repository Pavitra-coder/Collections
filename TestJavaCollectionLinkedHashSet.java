import java.util.*;
public class TestJavaCollectionLinkedHashSet
{
	public static void main(String args[]){
		//Creating LinkedHashSet and adding elements
		Set<String> set=new LinkedHashSet<String>();
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
