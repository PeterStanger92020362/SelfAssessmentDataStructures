/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfassessmentdatastructures;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

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
        
        
        /*
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
        */
        
        
        
        //DeQueues
        
        Deque<Integer> firstQueue = new LinkedList<>();
        Deque<Integer> secondQueue = new LinkedList<>();
        Deque<Integer> thirdQueue = new LinkedList<>();
        
        
        for (int i = 0; i <= 10; i++) {
            firstQueue.add(i);
            secondQueue.add(i);
            thirdQueue.add(i);
        }
        
        System.out.println("Print out the three queues:");
        System.out.println(firstQueue);
        System.out.println(secondQueue);
        System.out.println(thirdQueue + "\n");
        
        
        Iterator fQIterator = firstQueue.iterator();
        Iterator sQIterator = secondQueue.iterator();
        Iterator tQIterator = thirdQueue.iterator();
        
        while (!thirdQueue.isEmpty()){
            while(fQIterator.hasNext()){
                System.out.println(firstQueue.pop());
            }
            System.out.println("\nFirst Queue is empty!");
            System.out.println("Finishing work in other queues - oldest to newest\n");
            while(sQIterator.hasNext()) {
                System.out.println(secondQueue.removeLast());
            }
            while(tQIterator.hasNext()) {
                System.out.println(thirdQueue.removeLast());
            }
            
        }

        System.out.println("\nConfirming all three queues are empty?: " 
                + "\nFirst Queue: " + firstQueue.isEmpty() 
                + "\nSecond Queue:" + secondQueue.isEmpty() 
                + "\nThird Queue: " + thirdQueue.isEmpty());
        
    }
    
}
