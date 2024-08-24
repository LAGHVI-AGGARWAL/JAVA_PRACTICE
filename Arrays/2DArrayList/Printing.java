
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> a = new ArrayList<>();
	    a.add(10);  a.add(20);  a.add(30);
	    ArrayList<Integer> b = new ArrayList<>();
	    b.add(40);  b.add(50);
	    ArrayList<Integer> c = new ArrayList<>();
	    ArrayList<Integer> d = new ArrayList<>();
	    d.add(60);
	    ArrayList<ArrayList<Integer>> l = new ArrayList<>();
	    l.add(a);   l.add(b);    l.add(c);  l.add(d);
	    
	   // for(int i = 0; i < l.size(); i++){
	   //     System.out.print(l.get(i) + " ");
	   // }
	    
	    for(int i = 0; i < l.size(); i++){
	        for(int j = 0; j < l.get(i).size(); j++){
	            System.out.print(l.get(i).get(j) + " ");
	        }
	        System.out.println();
	    }

	}
}
