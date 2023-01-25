package com.fizzbuzz;

public class FizzBuzz {
    public String fizzbuzz(int numb) {
        if(numb % 3 == 0 && numb % 5 != 0 || String.valueOf(numb).contains("3")){
            return "Fizz";
        }
        if(numb % 5 == 0 && numb % 3 != 0 || String.valueOf(numb).contains("5")){
            return "Buzz";
        }
        if(numb % 5 == 0 && numb % 3 == 0){
            return "FizzBuzz";
        }
        return "Error";
    }
}
