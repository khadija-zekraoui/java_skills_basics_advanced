package dev.lpa;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // The first challenge is convert this anonymous class to lambda expression
        Consumer<String> printWords = new Consumer<String>() {

            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        //First solution
        System.out.println(("-").repeat(6) + "1.First solution" + ("-").repeat(6));
        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Let's split this up into an array");
        printWordsLambda.accept("Let's split this up into an array");

        //Second solution
        System.out.println(("-").repeat(6) + "1.Second solution" + ("-").repeat(6));
        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWordsForEach.accept("Let's split this up into an array");

        //Third solution
        System.out.println(("-").repeat(6) + "1.Third solution" + ("-").repeat(6));
        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printWordsConcise.accept("Let's split this up into an array");


        // The transformation of everySecondChar to a lambda expression
        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // execution of the everySecondChar lambda expression
        System.out.println(("-").repeat(6) + "3.Transform everySecondChar to lambda expression" + ("-").repeat(6));
        String source = "1234567890";
        System.out.println(everySecondChar.apply(source));

        // Second execution using a call to the method everySecondCharacter
        System.out.println(("-").repeat(6) + "4.Transform everySecondChar to lambda expression using a call method" + ("-").repeat(6));
        System.out.println(everySecondCharacter(everySecondChar, source));

        System.out.println(("-").repeat(6) + "6.I love Java" + ("-").repeat(6));
        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

    }

    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> unaryOperator, String source) {
        return unaryOperator.apply(source);
    }

}
