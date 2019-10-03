
import java.io.*;
import java.util.*;
public class Question_2
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] T = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] R = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] B = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int t_size = T.length;
		int r_size = R.length;
		int total = 0;
		for(int i = 0;i<t_size; i++)
		{
		    int max = 0;
		    for(int j = 0;j<r_size;j++)
		    {
		        if(T[i] >= R[j])
		        {
		            if(B[j] > max)
		                max = B[j];
		        }
		    }
		    total = total + max;
		}
		System.out.println(total);
	}
}
