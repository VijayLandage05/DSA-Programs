package com.arrayinsertion.main;

import com.arrayinsertion.entity.ArrayInsertionEntity;

public class ArrayOperationMain {
	
	public static void main(String[] args) {
		int[] array= new int[15];
	    array[0]=1; 
	    array[1]=2;
	    array[2]=3;
	    array[3]=4;
	    array[4]=5;
	    array[5]=6;
	    array[6]=7;
	    array[7]=8;
	    array[8]=9;
	    array[9]=10;
		
	    ArrayInsertionEntity a1=new ArrayInsertionEntity(array);
        a1.traverseArray();
        a1.insertArray(25,5);
	}

}