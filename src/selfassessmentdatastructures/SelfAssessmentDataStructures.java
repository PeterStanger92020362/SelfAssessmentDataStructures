/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfassessmentdatastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Peter
 */
public class SelfAssessmentDataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        
        //Sets
               
        ArrayList<Integer> duplicatedArray = new ArrayList<>();
        
        Random rand = new Random();
        
        for (int i = 0; i <= 100; i++) {
            duplicatedArray.add((int)(Math.random()*10)); 
        }
        
        System.out.println("Here is the duplicated Array:");
        System.out.println(duplicatedArray);
        
        Set<Integer> uniqueSet = new HashSet<>(duplicatedArray);
        
        System.out.println("Here is the same list, but only unique values using a Set data structure:");
        System.out.println(uniqueSet);
        

        */
        
        
        
        //Stacks
        
        Scanner entry = new Scanner(System.in);

        Stack<String> userInputStack = new Stack<>();
        
        System.out.println("Enter some data and then type 'u' to remove last entered items");
        while(true){
            
            String userInput = entry.next();

            if (userInput.toLowerCase().equals("u")){
                if (userInputStack.isEmpty()) {
                    System.out.println("Nothing to remove?");
                } else {
                    System.out.println(userInputStack.pop() + " removed from user entry stack");
                    System.out.println(userInputStack);
                }
            } else {
                userInputStack.push(userInput);
                System.out.println(userInputStack);                
            }

        }
        
        
        
        
    }
    
}
