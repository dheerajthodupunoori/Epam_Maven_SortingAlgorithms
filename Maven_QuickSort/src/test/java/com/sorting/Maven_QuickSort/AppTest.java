package com.sorting.Maven_QuickSort;

import java.util.Arrays;

import com.sorting.Maven_MergeSort.App;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	assertFalse(Arrays.equals(new int[]{2,3,4,5}, new App().start_sort(new int[]{2,1,3,5,4})));
    	assertTrue(Arrays.equals(new int[]{1,2,3,4,5}, new App().start_sort(new int[]{2,1,3,5,4})));
    }
}
