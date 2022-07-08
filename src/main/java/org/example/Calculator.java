package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    public List<Double> addition (List<Double> array1, List<Double> array2){
        return array1.stream().map( item -> item + array2.get(array1.indexOf(item)))
                .collect(Collectors.toList());
    }

    public List<Double> substraction (List<Double> array1, List<Double> array2){
        return array1.stream().map( item -> item - array2.get(array1.indexOf(item)))
                .collect(Collectors.toList());
    }

    public List<Double> multiplication (List<Double> array1, List<Double> array2){
        return array1.stream().map( item -> item / array2.get(array1.indexOf(item)))
                .collect(Collectors.toList());
    }

    public List<Double> division (List<Double> array1, List<Double> array2) {

        List<Double> response = array1.stream().map( item -> {
            if(array2.get(array1.indexOf(item)) == 0) {
               return null;
            };
            return item / array2.get(array1.indexOf(item));
        }).collect(Collectors.toList());

        return  response;
    }

    public List<Double> module (List<Double> array1, List<Double> array2){
        List<Double> response = array1.stream().map( item -> {
            if(array2.get(array1.indexOf(item)) == 0) {
                return null;
            };
            return item % array2.get(array1.indexOf(item));
        }).collect(Collectors.toList());

        return  response;
    }

    public List<Double> maximun (List<Double> array1, List<Double> array2){
        List<Double> response = new ArrayList<>();
        double max1 = array1.stream().max(Double::compare).get();
        response.add(max1);
        double max2 = array2.stream().max(Double::compare).get();
        response.add(max2);
        return response;

    }

    public List<Double> minimun (List<Double> array1, List<Double> array2){
        List<Double> response = new ArrayList<>();
        double min1 = array1.stream().max(Double::compare).get();
        response.add(min1);
        double min2 = array2.stream().max(Double::compare).get();
        response.add(min2);
        return response;
    }
}
