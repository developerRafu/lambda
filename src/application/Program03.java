package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import services.ProductServies;
import util.PriceUpdate;
import util.UpperCaseName;

/**
 *
 * @author PC
 */
public class Program03 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductServies ps = new ProductServies();
        double sum = ps.filteredSum(list, p->p.getPrice()<100.0);
        System.out.println("Sum="+String.format("%.2f",sum));
        
    }
}
