package com.sorting.Maven_MergeSort;

import java.util.Arrays;



import junit.framework.TestCase;

public class TestMergeSort1 extends TestCase 
{
public void testApp()
{
	assertTrue(Arrays.equals(new int[]{1,2,3,4,5}, new App().start_merge_sort(new int[]{2,1,3,5,4})));
}
}
