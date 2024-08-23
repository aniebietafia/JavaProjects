package arrays;

import java.util.Arrays;

public class TheArrayProblem {
    public void arraysCollection() {
        var door = new Product("Wooden Door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);

        Product[] products = {door, floorPanel};
        System.out.println(Arrays.toString(products));
    }
}
