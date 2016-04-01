import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testPartion(){
		int[] a1 = {3,2,1};
		Sorting s1 = new Sorting();
		s1.insertionSort(a1);
		assertEquals(true,s1.isSorted(a1));
		
		int[] a2 = {3,2,1};
		Sorting s2 = new Sorting();
		assertEquals(false, s2.isSorted(a2));
		
		int[] a3 = {-1,4,3,0,6,7,8};
		Sorting s3 = new Sorting();
		s3.quicksort(a3);
		assertEquals(true,s1.isSorted(a3));
		
		int[] a4 = {1,2,3,4,6,7,8,3,5,2,1,4,3,2,8,9};
		Sorting s4 = new Sorting();
		s3.quicksort(a4);
		assertEquals(true,s4.isSorted(a4));
		
		int[] a5 = {1,2,3};
		Sorting s5 = new Sorting();
		s1.insertionSort(a5);
		assertEquals(true,s5.isSorted(a5));
		
		
		/*int[] a4 = {3,2,1};
		Sorting s4 = new Sorting();
		int[] a5 = {1,2,3};
		assertEquals(a5, s4.swap(a4,3,1));
		*/
		
	//	arr1.partition();
	//	assertEquals(true,arr1.isWeaklySorted());
//		ArrayPartition arr2 = new ArrayPartition(a1);
//		arr2.partition();
//		ArrayPartition arr3 = new ArrayPartition(a1);
//		arr3.partition();
		
		
	}

}



