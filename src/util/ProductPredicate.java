/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.function.Predicate;
import entities.Product;
/**
 *
 * @author PC
 */
public class ProductPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product pt {
       return  pt -> pt.getPrice() >= 100.0;
    }
    
}
