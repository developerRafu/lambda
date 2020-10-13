/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class Program06 {
    public static void main(String[] args) {
        String path = "C:\\temp\\in.txt";
          List<Product> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
                        
            String line = br.readLine();
            while(line!=null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line=br.readLine();
            }
            double avg = list.stream()
                                      .map(p->p.getPrice())
                                      .reduce(0.0, (x,y)-> x+y)/list.size();
            System.out.println("Average price = "+String.format("%.2f",avg));
           
            Comparator<String> comp = (s1,s2) ->s1.toUpperCase().compareTo(s2.toUpperCase());
                    
            
           List<String> names =  list.stream()
                                                   .filter(p->p.getPrice()<avg)
                                                   .map(p->p.getName())
                                                   .sorted(comp.reversed())
                                                   .collect(Collectors.toList());
           
           names.forEach(System.out::println);
        }catch(IOException e){
            e.getMessage();
        }
    }
}
