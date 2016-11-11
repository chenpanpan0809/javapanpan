package ood.thread;


//打破run方法中循环的机制
public class ThreadDemo3 {

	    public static void main(String[] args) throws Exception {

	    	MyRunnabl myRunnable = new MyRunnabl();
	        Thread thread = new Thread(myRunnable);
	        
	        for (int i = 0; i <= 50; i++) {
	            System.out.println(Thread.currentThread().getName() + " " + i);
	            if (i == 30) {
	                thread.start();
	            }
	            Thread.sleep(1);
	            if(i == 40){
	                myRunnable.stopThread();
	                
	            }
	            
	           
	        }
	    }
	}
        
	