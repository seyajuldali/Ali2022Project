package comb.pack1;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Blckingqueue {

	public static void main(String[] args) {
		
		BlockingQueue ts=new LinkedBlockingQueue();
		ts.offer(105);
		ts.offer(102);
		ts.offer(103);
		ts.offer(104);
		System.out.println(ts);
		

	}

}
