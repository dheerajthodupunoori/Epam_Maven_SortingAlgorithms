package com.sorting.Maven_BubbleSort;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World! to Dheeraj" );
    	
    }
    public int[] bubble_sort(int arr[])
    {
    	int l = arr.length; //length of array
    	int temp = 0;
    	for(int i = 0 ;i<l ;i++)
    	{
    		for(int j=0 ;j<l-i-1 ;j++)
    		{
    			if(arr[j] > arr[j+1])
    			{
    				temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    			}
    		}
    	}
    	return arr;
    }
}
