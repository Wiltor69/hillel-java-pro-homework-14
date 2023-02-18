package coffee.order;

import java.util.Objects;

public class Order implements Comparable<Order>{
    private static int order;

    private String name;

    public Order(int order,String name) {
       this.order = order;
        this.name = name;
        order ++;



    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Order: " +
                "order: " + order +
                ", name: '" + name + '\'';
    }

    @Override
    public int compareTo(Order o) {
        return this.order - o.order;
    }
}
