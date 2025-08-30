package com.example.OODesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SpringBootApplication
public class OoDesignApplication {



        public static void main(String[] args) {
            LinkedList<Double> numbers = new LinkedList<>();

            try (Scanner sc = new Scanner(new File("numbers.txt"))) {
                while (sc.hasNextDouble()) {
                    numbers.add(sc.nextDouble());
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo numbers.txt");
                return;
            }

            if (numbers.isEmpty()) {
                System.out.println("No se cargaron números.");
                return;
            }

            double mean = Statistics.mean(numbers);
            double stddev = Statistics.standardDeviation(numbers);

            System.out.println("Cantidad de datos: " + numbers.size());
            System.out.println("Media: " + mean);
            System.out.println("Desviación estándar: " + stddev);
        }
    }
