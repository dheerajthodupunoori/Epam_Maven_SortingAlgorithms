package com.sorting.Maven_MergeSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public int[] merge(int arr[],int left,int middle,int right)
    {
    	int lengthof_input_array = arr.length;
    	 int n1 = middle - left + 1;
         int n2 = right - middle;
  
        
         int L[] = new int [n1];
         int R[] = new int [n2];
  
        
         for (int i=0; i<n1; ++i)
             L[i] = arr[left + i];
         for (int j=0; j<n2; ++j)
             R[j] = arr[middle + 1+ j];
  
  
       
         int i = 0, j = 0;
  
        
         int k = left;
         while (i < n1 && j < n2)
         {
             if (L[i] <= R[j])
             {
                 arr[k] = L[i];
                 i++;
             }
             else
             {
                 arr[k] = R[j];
                 j++;
             }
             k++;
         }
  
        
         while (i < n1)
         {
             arr[k] = L[i];
             i++;
             k++;
         }
  
         
         while (j < n2)
         {
             arr[k] = R[j];
             j++;
             k++;
         }
    	
    	return arr;
    }
    public void divide(int arr[], int left, int right)
    {
        if (left < right)
        {
            // Finding  the middle point
            int middle = (left+right)/2;
 
            // Sort first and second halves
            divide(arr, left, middle);
            divide(arr , middle+1, right);
 
            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }
    public int[]  start_merge_sort(int arr[])
    		{
    	divide(arr,0,arr.length-1);
    	   return arr;
    	    
    		}
}
