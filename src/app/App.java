package app;

/*
    This program prints out prime numbers, and can 
    determine if a number is prime. 
*/

import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        testPrimeGeneration();
        System.out.println("Everything worked out!");
    }

    private static void testPrimeGeneration() {
        ArrayList<Integer> consequtivePrimesUpTo100 = new ArrayList<Integer>
        (
            Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19,23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
        );
        assert consequtivePrimesUpTo100.equals(createListOfPrimeNumbersUptoN(100)) : "Something went wrong";
    }

    private static ArrayList<Integer> createListOfPrimeNumbersUptoN(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= number; ++i) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}