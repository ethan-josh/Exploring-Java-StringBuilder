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
        StringBuilder sb3 = new StringBuilder("This is a test sentence.");
        // Deletes " a test"
        sb3.delete(8, 16); 
        System.out.println("After delete(8, 16): " + sb3);

        // Deletes the character at index 4 (the ' ')
        sb3.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb3);
        // Example #3 ******************************

        // *****************************************

        // Example #4 ******************************

        // *****************************************

        // Example #5 ******************************

        // *****************************************

        // Example #6 ******************************

        // *****************************************

        // Example #7 ******************************

        // *****************************************
}
}
