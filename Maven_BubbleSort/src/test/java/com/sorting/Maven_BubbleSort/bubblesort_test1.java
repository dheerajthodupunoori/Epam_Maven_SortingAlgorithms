package com.sorting.Maven_BubbleSort;

import java.util.Arrays;

import junit.framework.TestCase;

public class bubblesort_test1 extends TestCase
{
	 public void testApp()
	    {
	        //assertTrue( true );
	    	assertTrue(Arrays.equals(new int[]{1,2,3,4,5}, new App().bubble_sort(new int[]{2,1,3,5,4})));
	    	assertTrue(Arrays.equals(new int[]{1,2,3}, new App().bubble_sort(new int[]{1,2,3})));
	    	assertFalse(Arrays.equals(new int[]{2,1,3}, new App().bubble_sort(new int[]{2,3,3})));
	    }
}
