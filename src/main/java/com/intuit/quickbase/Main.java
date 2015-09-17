package com.intuit.quickbase;

import com.intuit.quickbase.devint.ConcreteStatService;
import com.intuit.quickbase.devint.IStatService;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class Main {
    public static void main( String args[] )
    {
       System.out.println("Starting.");
       
       IStatService service = new ConcreteStatService();
       List<Pair<String, Integer>> countries = service.GetCountryPopulations();
       for (Pair<String, Integer> pair : countries)
       {
    	  System.out.printf("%s: %d", pair.getLeft(), pair.getRight());
    	  System.out.println();
       }
    }
}