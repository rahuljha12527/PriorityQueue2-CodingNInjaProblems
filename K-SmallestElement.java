import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*; 

public class solution {

	public static ArrayList<Integer> kSmallest(int[] input, int k) {
		
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            pq.add(input[i]);
        }
        
        for(int i=k;i<input.length;i++){
            
            if(pq.peek()>input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
        
       // Collections.sort(pq,Collections.reverseOrder());
        
        while(!pq.isEmpty()){
            arr.add(pq.peek());
            pq.poll();
        }
        
        return arr;

	}
}
