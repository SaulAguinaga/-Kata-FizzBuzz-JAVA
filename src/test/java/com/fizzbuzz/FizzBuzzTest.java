package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_should_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int numb = 3;
        String result = fizzBuzz.fizzbuzz(numb);
        assertEquals("Fizz", result);
    }
    @Test
    public void test_should_return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int numb = 5;
        String result = fizzBuzz.fizzbuzz(numb);
        assertEquals("Buzz", result);
    }
    @Test
    public void test_should_return_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int numb = 15;
        String result = fizzBuzz.fizzbuzz(numb);
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void test_should_return_Fizz_if_contains_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int numb = 30;
        String result = fizzBuzz.fizzbuzz(numb);
        assertEquals("Fizz", result);
    }
    @Test
    public void test_should_return_Fizz_if_contains_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int numb = 52;
        String result = fizzBuzz.fizzbuzz(numb);
        assertEquals("Buzz", result);
    }


}