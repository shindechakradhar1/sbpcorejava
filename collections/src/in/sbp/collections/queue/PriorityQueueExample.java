package in.sbp.collections.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import in.sbp.collections.entities.Mails;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> intQueue = 
				new PriorityQueue<>();
		
//		boolean add(e) / boolean offer(e)
//		enqueing
		intQueue.offer(10);
		intQueue.offer(0);
		intQueue.offer(9);
		intQueue.offer(1);
		intQueue.offer(3);
		intQueue.offer(7);
		intQueue.offer(5);
		
		System.out.println(intQueue);
		
//		Dequeing
//		E remove() / E poll()
//		System.out.println(intQueue.poll());
//		System.out.println(intQueue.poll());
//		System.out.println(intQueue.poll());
//		System.out.println(intQueue.poll());
//		System.out.println(intQueue.poll());
//		System.out.println(intQueue.poll());
//		System.out.println(intQueue.poll());
//		System.out.println(intQueue.poll());
		
		
//		for(Integer val:intQueue) {
//			System.out.println(val);
//		}
//		
		intQueue.forEach(PriorityQueueExample::acceptInt);
//		
//		Iterator<Integer> iterator = intQueue.iterator();
//		while(iterator.hasNext())
//			System.out.println(iterator.next());
		
		
		
		
//		Queue<Mails> mailQueue = 
//				new PriorityQueue<>((e1,e2)->e1.getPriority().compareTo(e2.getPriority()));
//		PriorityQueue<Mails> mailQueue = 
//				new PriorityQueue<>((e1,e2)->e1.getPriority().compareTo(e2.getPriority()));
//		mailQueue.offer(new Mails("abc1@abc.in","p4"));
//		mailQueue.offer(new Mails("abc2@abc.in","p1"));
//		mailQueue.offer(new Mails("abc3@abc.in","p1"));
//		mailQueue.offer(new Mails("abc4@abc.in","p2"));
//		mailQueue.offer(new Mails("abc5@abc.in","p2"));
//		mailQueue.offer(new Mails("abc6@abc.in","p3"));
//		
//		System.out.println(mailQueue.poll());
//		System.out.println(mailQueue.poll());
//		System.out.println(mailQueue.poll());
//		System.out.println(mailQueue.poll());
//		System.out.println(mailQueue.poll());
//		System.out.println(mailQueue.poll());
//		System.out.println(mailQueue.poll());
//		
//		Comparator<Mails> mailComparator = (Comparator<Mails>) mailQueue.comparator();
//		System.out.println(mailComparator);
//		
////		get Array from priorityQueue using toArray() method
//		Mails[] mailArray = mailQueue.toArray(new Mails[0]);
//		System.out.println(Arrays.toString(mailArray));
//				
		
		
		
	}
	
	
	public static void acceptInt(Integer val) {
		System.out.println(val);
	}
}
