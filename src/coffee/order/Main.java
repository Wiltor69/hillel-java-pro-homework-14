package coffee.order;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    CoffeeOrderBoard cob = new CoffeeOrderBoard();
        Order order1 = new Order( 1,"Andrew");
        Order order2 = new Order( 2,"Roman");
        Order order3 = new Order( 5,"Ira");
        Order order4 = new Order( 4,"Slava");
        Order order5 = new Order( 3,"Johns");
        cob.add(order3);
        cob.add(order1);
        cob.add(order5);
        cob.add(order4);
        cob.add(order2);

        System.out.println(cob);

        Queue<Order> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(order1);
        priorityQueue.add(order4);
        priorityQueue.add(order2);
        priorityQueue.add(order5);
        priorityQueue.add(order3);

        System.out.println(priorityQueue);

        cob.deliver();

        System.out.println(cob);
        cob.draw();

    }
}
