package br.com.ricardorolim.utils;

 public class Calculator {

     public static Double sum(double numberOne, double numberTwo) {

         Double result = 0d;

         result = numberOne + numberTwo;

         return result;
     }

     public static Double divide(double numberOne, double numberTwo) {

         Double result = 0d;

         result = numberOne / numberTwo;

         return result;
     }

     public static Double multiple(double numberOne, double numberTwo) {

         Double result = 0d;

         result = numberOne * numberTwo;

         return result;
     }

     public static Double squareRoot(double number) {

         Double result = 0d;

         result = Math.sqrt(number);

         return result;
     }

}
