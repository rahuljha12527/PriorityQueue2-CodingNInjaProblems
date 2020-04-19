import java.util.PriorityQueue;
public class Solution {

	public static int kthLargest(int arr[], int k) {
		
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        
        
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        
        int temp=pq.poll();
//         while(!pq.isEmpty()){
//            pq.poll();
//             if(pq.size()==1){
//                  temp=pq.poll();
                
//             }
//         }
        
        return temp;
	}
}
