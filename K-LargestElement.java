import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<k;i++){
            pq.add(input[i]);
        }
		
        int n=input.length;
        for(int i=k;i<n;i++){
            
            if(pq.peek()<input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
        
       while(!pq.isEmpty()){
           arr.add(pq.poll());
       }
        
        return arr;
	}
}