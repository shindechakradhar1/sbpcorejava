package in.sbp.collections.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueExamples {

	public static void main(String[] args) {
		// bound ArrayBlocking Queue
//		BlockingQueue<Integer> intQueue = 
//				new ArrayBlockingQueue<>(5);
		BlockingQueue<Integer> intQueue = 
				new LinkedBlockingDeque<>();
		
//		try {
//			intQueue.put(10);
//			intQueue.put(9);
//			intQueue.put(8);
//			intQueue.put(7);
//			intQueue.put(10);
//			intQueue.put(11);
//			intQueue.take();
//			intQueue.take();
//			intQueue.take();
//			intQueue.take();
//			intQueue.take();
//			intQueue.take();
//			System.out.println(intQueue);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// Suplier
		new Thread(()->{
			for(int i=0;i<10;i++) {
				try {
					System.out.println("Set :" + i);
					intQueue.put(i);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}).start();
		
		
//		Consumer
		new Thread(()->{
			int temp=0;
			while(temp<=10) {
				try {
					System.out.println("Get : " + temp);
					temp=intQueue.take();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
	} 
}
