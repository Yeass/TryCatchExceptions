package com.company;

class TestClass{

    int[] tablica = {0, 1, 2, 3, 4};

    void Exceptions() {
        System.out.println(tablica[4] / tablica[2]);
        System.out.println(tablica[5]);
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        TestClass testClass = new TestClass();

        try {
            testClass.Exceptions();
        } catch (ArithmeticException e){
            System.out.println("Wykryto wyjątek ArithmeticException!");
            System.out.println("Niedozwolona operacja matematyczna.:");
            //e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wykryto wyjątek ArrayIndexOutOfBoundsException!");
            System.out.println("Element tablicy wykracza poza jej rozmiar");
            //e.printStackTrace();
        } finally {
            System.out.println("\nWykonano.");
        }
    }
}
