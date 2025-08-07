package org.example;

public class ExploringStringBuilder{
	public static void main(String[] args){

		// Example #1 ******************************
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        // System.out.println(sb);

        //Additional
        sb.append(" Welcome to");
        sb.append(" 2025");
        sb.append(".");
        // System.out.println(sb);
		// *****************************************

		// Example #2 ******************************
        StringBuilder sb2 = new StringBuilder("Java is great!");
        sb2.insert(8, "really ");
        //System.out.println(sb2);
        // *****************************************
        

        // Example #3 ******************************
        StringBuilder sb3 = new StringBuilder("This is a test sentence.");
        // Deletes " a test"
        sb3.delete(8, 16); 
        //System.out.println("After delete(8, 16): " + sb3);

        // Deletes the character at index 4 (the ' ')
        sb3.deleteCharAt(4);
        //System.out.println("After deleteCharAt(4): " + sb3);
        // *****************************************

        // Example #4 ******************************
        StringBuilder sb4 = new StringBuilder("I like programming in Python.");
        sb4.replace(24, 30, "Java");
        // System.out.println(sb4);
        // *****************************************

        // Example #5 ******************************
        StringBuilder sb5 = new StringBuilder("Start");
        sb5.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        //System.out.println(sb5);
        // *****************************************

        // Example #6 ******************************
        StringBuilder sb6 = new StringBuilder("The quick brown fox jumps over the lazy dog.");
        
        // Substring returns a String, it does not modify the StringBuilder
        String sub = sb6.substring(16, 19);
        //System.out.println("Substring: " + sub);
        
        // indexOf works just like in String
        int indexOfFox = sb6.indexOf("fox");
        //System.out.println("Index of 'fox': " + indexOfFox);
        
        // Searching for a word that doesn't exist
        int indexOfCat = sb6.indexOf("cat");
        //System.out.println("Index of 'cat': " + indexOfCat);
        // *****************************************

        // Example #7 ******************************
        StringBuilder sb7 = new StringBuilder("Status: ");
        sb7.append("Pending");
        
        // Now, we need a final, unchangeable String
        String finalStatus = sb7.toString();
        
        // Let's try to change the StringBuilder again
        sb7.append(" - Approved"); 
        
        System.out.println("StringBuilder: " + sb7);
        System.out.println("Final String: " + finalStatus);
        // *****************************************
}
}
