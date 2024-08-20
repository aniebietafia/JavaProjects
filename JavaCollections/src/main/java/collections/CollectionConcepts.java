package collections;

import arrays.Product;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcepts {
    public static void main(String[] args) {
        var door = new Product("Wooden Door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);

        products.forEach(System.out::println);
    }
}
