package coffee.order;


import java.util.Map;

import java.util.TreeMap;


public class CoffeeOrderBoard implements Comparable<CoffeeOrderBoard> {

    Map<Integer,Order> map = new TreeMap<>();

     public int numOrder;

    @Override
    public String toString() {
        return "All Queue: " +
                 map ;


    }

    public Map<Integer,Order> add(int numOrder, Order order) {

        map.put(numOrder, order);
        return map;


    }
    public Map<Integer,Order> deliver(int numOrder){
        map.remove(numOrder);
        return map;
    }
    public void draw () {
        for (Map.Entry<Integer, Order> m : map.entrySet()) {
            System.out.println(m.getKey() +" | " + m.getValue());
        }

    }

    @Override
    public int compareTo(CoffeeOrderBoard o) {
        return this.numOrder - o.numOrder;
    }


}




