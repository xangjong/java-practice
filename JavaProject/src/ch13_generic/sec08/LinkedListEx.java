package ch13_generic.sec08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> listArray = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();
		
		ArrayList<String> arraylist = new ArrayList<String>();
		LinkedList<String> linkedLinst = new LinkedList<String>();
		
		long startTime, endTime;
		
		startTime =System.nanoTime();
		for(int i=0; i<10000; i++){
			listArray.add(0, String.valueOf(i));		
		}
		endTime = System.nanoTime();
		System.out.println("listArray 걸린 시간 : " + (endTime-startTime)+" ns" );
		
		startTime =System.nanoTime();
		for(int i=0; i<10000; i++){
			listArray.add(0, String.valueOf(i));		
		}
		endTime = System.nanoTime();
		System.out.println("listLinkedList 걸린 시간 : " + (endTime-startTime)+" ns" );
		
		startTime =System.nanoTime();
		for(int i=0; i<10000; i++){
			listArray.add(0, String.valueOf(i));		
		}
		endTime = System.nanoTime();
		System.out.println("arrayList 걸린 시간 : " + (endTime-startTime)+" ns" );
		
		startTime =System.nanoTime();
		for(int i=0; i<10000; i++){
			listArray.add(0, String.valueOf(i));		
		}
		endTime = System.nanoTime();
		System.out.println("linkedList 걸린 시간 : " + (endTime-startTime)+" ns" );
		
		
		
		
	}

}
