package coffee.order;

public class Order implements Comparable<Order>{
    int order;
    String name;

    public Order(int order, String name) {
        this.order = order;
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
