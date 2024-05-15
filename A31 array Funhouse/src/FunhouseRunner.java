//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class FunhouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + FunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + FunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + FunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + FunHouse.getCount(one,9));
		System.out.println("New array with all 7s removed" + Arrays.toString(FunHouse.removeVal(one, 7)));


		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};
		System.out.println("");
		System.out.println(Arrays.toString(two));
		System.out.println("sum of spots 3-6  =  " + FunHouse.getSum(two,3,6));
		System.out.println("sum of spots 2-9  =  " + FunHouse.getSum(two,2,9));
		System.out.println("# of 4s  =  " + FunHouse.getCount(two,4));
		System.out.println("# of 9s  =  " + FunHouse.getCount(two,9));
		System.out.println("New array with all 7s removed" + Arrays.toString(FunHouse.removeVal(two, 7)));
		//add test cases


	}
}