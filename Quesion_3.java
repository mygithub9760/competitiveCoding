/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] scores = Arrys.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] yours = Arrys.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int yours_size = yours.length;
		int scores_size = scores.length;
		
		Set<Integer> ts = new TreeSet<>(new myComparator());
		for(int  i : scores)
		{
		    ts.add(i);
		}
		
		Map<Integer, Integer> count = new HashMap<>(new myComparator());
		for(int i = 0; i< yours_size ;i++)
		{
		    ts.add(yours[i]);
		    int val = ts.headSet(i).size()+1;
		    if(count.containsKey(val))
		    {
		        count.put(val, count.get(val)+1);
		    }
		    else
		    {
		        count.put(val, 1);
		    }
		}
		
		Iterator itr = count.entrySet().iterator();
		while()
		
		
	}
}

class myComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        int o1 = (Integer)obj1;
        int o2 = (Integer)obj2;
        return o2 - o1;
    }
}
