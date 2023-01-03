package coffee.order;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

    CoffeeOrderBoard cob = new CoffeeOrderBoard();
        Order order1 = new Order(12, "Andrew");
        Order order2 = new Order(34, "Roman");
        Order order3 = new Order(15, "Ira");
        Order order4 = new Order(3, "Slava");
        Order order5 = new Order(9, "Johns");
        cob.add(2,order3);
        cob.add(5,order1);
        cob.add(1,order5);
        cob.add(4,order4);
        cob.add(3,order2);

        System.out.println(cob);

        PriorityQueue<Order> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(order1);
        priorityQueue.add(order4);
        priorityQueue.add(order2);
        priorityQueue.add(order5);
        priorityQueue.add(order3);

        System.out.println(priorityQueue);

        cob.deliver(1);

        System.out.println(cob);
        cob.draw();

    }
}
