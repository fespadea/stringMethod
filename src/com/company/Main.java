package com.company;

public class Main {

    public static void main(String[] args) {
	/* public int compareTo(object myObj)
	* can take any object but we will specifically be talking about it accepting Strings
	* takes a String and alphabetically compares it to another String to see which String would come first in an alphabetically ordered list.
	* It returns a negative integer if the String making the call precedes the String in the paranthesis
	* a positive is returned if the String comes after the one in the paranthesis
	* and a 0 is returned if they are equal
	* note: alphabeticalness is decided based on ASCII so capital letters come first
	* error:
	* String s = "Apple";
	* int a = s.compareTo"Aptitude";
	* this would return a positive number since the second p in "Apple" comes before the t in "Aptitude"*/
        String s = "pie";
        int x = s.compareTo("pipe");
        if(x<0)
        System.out.print(x);
    }
}
