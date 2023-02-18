package coffee.order;


import java.util.Map;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;


public class CoffeeOrderBoard implements Comparable<CoffeeOrderBoard> {

    //Map<Integer,Order> map = new TreeMap<>();
    Queue <Order> queue = new PriorityQueue<>();


    public static int numOrder ;

    public CoffeeOrderBoard() {
        numOrder++;
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoard{" +
                "queue=" + queue +
                '}';
    }

    public PriorityQueue<Order> add(Order order) {

        queue.add(order);

        return (PriorityQueue<Order>) queue;


    }
    public PriorityQueue<Order> deliver(){
        queue.remove();

        return (PriorityQueue<Order>) queue;
    }
   public void draw () {
       for (Order p : queue) {

           System.out.println(p.getName());

       }
   }

       @Override
       public int compareTo (CoffeeOrderBoard o){
           return this.numOrder - o.numOrder;
       }


}




