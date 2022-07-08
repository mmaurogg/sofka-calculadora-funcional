package org.example;

import org.jboss.logging.Logger;
import org.jboss.logging.Messages;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Messages.class);

        List<Double> arrayUno = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> arrayDos = Arrays.asList(0.0, 7.0, 8.0, 9.0, 10.0, 1.0);

        List<Double> array1 = compararArray(arrayUno, arrayDos);
        if(array1.stream().count() <arrayUno.stream().count()){
            logger.info("se redujo la cantidad de items del array uno a " + array1.stream().count());
        }
        List<Double> array2 = compararArray(arrayDos, arrayUno);
        if(array2.stream().count() <arrayDos.stream().count()){
            logger.info("se redujo la cantidad de items del array dos a " + array1.stream().count());
        }

        Calculator calculator = new Calculator();

        List<Double> suma = calculator.addition(array1, array2);
        logger.info("La suma de los array es: " + suma);
        logger.info("La suma del array suma es: " + calculator.getReduce(suma));

        List<Double> resta = calculator.substraction(array1, array2);
        logger.info("La resta de los array es: " + resta);
        logger.info("La suma del array resta es: " + calculator.getReduce(resta));

        List<Double> multiplicacion = calculator.multiplication(array1, array2);
        logger.info("La multiplicacion de los array es: " + multiplicacion);
        logger.info("La suma del array multiplicacion es: " + calculator.getReduce(multiplicacion));

        List<Double> division = calculator.division(array1, array2);
        logger.info("La division de los array es: " + division);

        List<Double> modulo = calculator.module(array1, array2);
        logger.info("El modulo de los array es: " + modulo);

        List<Double> maximo = calculator.maximun(array1, array2);
        logger.info("El maximo de los array es: " + maximo);
        logger.info("La suma del array maximo es: " + calculator.getReduce(maximo));

        List<Double> minimo = calculator.minimun(array1, array2);
        logger.info("El minimo de los array es: " + minimo);
        logger.info("La suma del array minimo es: " + calculator.getReduce(minimo));




    }

    private static List<Double> compararArray (List<Double> a, List<Double>b) {
        if (a.stream().count() > b.stream().count()){
            return a.stream().limit(b.stream().count()).collect(Collectors.toList());
        }
        return a;
    }

}