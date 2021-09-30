package com.Tosin;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); //create object of arraylist class
        //we can access the methods of an arraylist by using the object.(numbers.) of the class
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50); //add to an arraylist at the end , second add show system overloading(choose where to add)
        //numbers.remove(3); //remove a number from the arraylist
        //Boolean container = numbers.contains(10); // returns true or false
        System.out.println(numbers);

        for(int i=0;i < numbers.size();i++) {
            System.out.println(numbers.get(i));
        }
        }




    }

