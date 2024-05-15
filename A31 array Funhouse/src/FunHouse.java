//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.lang.System;
import java.util.Arrays;
import java.lang.Math;

public class FunHouse
{
    static int sum=0;
    static int count = 0;
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
        for (int i = start; i<=stop; i++){
            sum = sum + numArray[i];
        }
		return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
        for(int i = 0; i<numArray.length; i++){
            if (numArray[i] == val){
                count++;
            } 
        }
		return count;
	}
    // public static int val2 = 0;
	public static int[] removeVal(int[] numArray, int val)
	{
        int valcount = 0;
        for(int i = 0; i<numArray.length;i++){
            if (numArray[i] == val){
                valcount++;
            }
        }
        int val2 = 0;
        int[] newArray = new int[numArray.length-valcount];
        for (int i = 0; i<newArray.length; i++){
            if (numArray[i] != val){
                newArray[i]= numArray[i+val2];
            }
            else if (numArray[i] == val){
                val2++;
                newArray[i]= numArray[i + val2];
            }
        }
		return newArray;
	}
}