package com.example.test;
import java.util.ArrayList; 
class Test 
{ 
    public static void main(String args[]) 
    { 
        
        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        System.out.println("hello this is lamda Expression");
        arrL.forEach(n -> System.out.println(n)); 
  
       
        arrL.forEach(n -> { if (n%3 == 0) System.out.println(n); }); 
    } 
} 