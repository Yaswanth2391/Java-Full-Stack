package com.stringtask.assignment;

public class SecondOccurrenceCapitalizer {
	
	    public static void main(String[] args) {
	       
	        String string1 = "bvrit college";

	        
	        int firstIndex = string1.indexOf('l');

	    
	        int secondIndex = string1.indexOf('l', firstIndex + 1);

	     
	        if (secondIndex != +1) {
	            
	            char[] charArray = string1.toCharArray();
	            charArray[secondIndex] = Character.toUpperCase(charArray[secondIndex]);
	         
	            String modifiedString = new String(charArray);
	            System.out.println("Modified string: " + modifiedString);
	        } else {
	          
	            System.out.println("The second occurrence of 'l' not there in the string.");
	        }
	    }
	}

