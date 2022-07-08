package org.example;

import org.jboss.logging.Logger;
import org.jboss.logging.Messages;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Messages.class);

        List<Double> array1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> array2 = Arrays.asList(0.0, 7.0, 8.0, 9.0, 10.0);

        Calculator calculator = new Calculator();

        System.out.println(calculator.division(array1, array2));
    }
}