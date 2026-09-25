import java.util.PriorityQueue;
import java.util.Iterator;

class LinkedLists{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(100);    
        pq.add(10);    
        pq.add(200);    
        pq.add(20);    
        pq.add(300);
        pq.add(30);

        /*  poll:  returns the element with low priority in this list the element lesser is 
            low priority so it is returned first.
            if we use Collections.reverseOrder() inside the constructor makes the queue in reverse order  
         */

        // while(!(pq.isEmpty())){
        //     System.out.println(pq.poll());
        // }   

        // below program gives us all the elements in the queue wihtout removing them using iterator.
        Iterator iterator = pq.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } 
        
        // for(Integer in: pq){
        //     System.out.println(in);
        // }

        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.peek());
        System.out.println(pq.peek());
        System.out.println(pq.peek());
        System.out.println(pq.peek());

        // poll: returns us the least priority element in a priority queue
        // peek: returns us the last inserted element in the queue

            

        // System.out.println(pq);
    }
}