
/* Assignment 4: CS702-Advanced Algorithm Analysis:
 * Submitted By: Mazhar Mahmmood 
 * 				 MSCS(2020-ag-1504) 
 * I have expianed all steps of this assignment here. */
 
/******************************************************************************
 *  Command for Compilation:  javac BinarySearch.java    
 *  Command for Execution:    java BinarySearch allowlist.txt < input.txt
 *
 *  		This Class Depends on following two files. These files are required for standard input and 
 *			output. These files are copied to same folder in which this file exists.
 *	
 *	Dependencies: In.java StdIn.java StdOut.java
 * 
 *
 *  Executing this file with following arguments will produce output as below: 
 *  % java BinarySearch tinyW.txt < tinyT.txt
 *  50
 *  99
 *  13
 *
 ******************************************************************************/

//package edu.princeton.cs.algs4;

import java.util.Arrays; // imports a java library

/**
 *  The {@code BinarySearch} class provides a static method for binary
 *  searching for an integer in a sorted array of integers.
 *  <p>
 *  The <em>indexOf</em> operations takes logarithmic time in the worst case.
 *  
 */
public class BinarySearch {

    /**
     * This class  don't need to be instantiated. 
	 * Because it's methods are static so we can use with out creating object. 
	 * that why it's constructor is private and empty.
	 * 
     */
    private BinarySearch() { }

    /**
     * indexOf Method Returns the index of the specified key in the specified array from 0 to n-1. and  * will return -1 if key not found in the specified array.
     *
     * @param  a the array of integers, must be sorted in ascending order
     * @param  key is also integer that we want to search from specified array.
     */
    public static int indexOf(int[] a, int key) {
        // starting index of specified array
		int lo = 0; 

		// ending index of specified array
        int hi = a.length - 1;	
       /* if there is Key present in array then it should be in array[lo] to array[hi] range otherwise it don't contain. */
	   while (lo <= hi) {		// loop will run 
            /* Following statement will calculate mid point that will be used to split array to it's half every time */
            int mid = lo + (hi - lo) / 2;  
			
			/* if key is less then value present at mid index (is true) then key must be in first half of considered range. so we will assign hi = mid-1, we will assign mid-1 because of the reason that if key is equal to this mid element then this condition will be false and else part of this if-else structure will run. */
			
            if      (key < a[mid]) hi = mid - 1; 
			/* if key is greater then value present at mid index (is true) then key must be in second half of considered range. so we will assign lo = mid+1 to consider second half for next iteration, we will assign mid+1 because of the reason that if key is equal to this mid element then this condition will be false and else part of this if-else structure will run. */
			
            else if (key > a[mid]) lo = mid + 1;
			/* if key is equal to the value present at mid index (is true) then we will return mid. mid is the index of element of array at which value found. */
            else return mid;
        }
		/* if key not found in specified array then following statement will run */
        return -1;
    }

    /**
     * indexof method is explained in detail. 
     */
    @Deprecated
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }

    /**
     * Reads in a sequence of integers from the allowlist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     *
     * @param args the command-line arguments
     */
	 // main method is entry point from where program will be started to exectue. 
    public static void main(String[] args) {

        // read the integers from a file given be command line.
        In in = new In(args[0]);
		// reads all integers from  file and save in integer array
        int[] allowlist = in.readAllInts();

        // Sort method from standard java library is used to sort array
        Arrays.sort(allowlist);

        // checks if there is input present 
        while (!StdIn.isEmpty()) {
			// read single integer value from standard input and save in key variable.
            int key = StdIn.readInt();
			
			//this will call indexof method to check if key is present in allowlist array if not present it's value will be printed. 
            if (BinarySearch.indexOf(allowlist, key) == -1)
				// prints value of key to standard output one value per line
				StdOut.println(key);
        } // while loop will end when standard input will finish.
    } // end of main function()
	
} // end of BinarySearch class
