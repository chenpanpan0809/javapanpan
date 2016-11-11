package ood.thread;


class MyRunnabl implements Runnable {

   boolean stop;

   // @Override
    public void run() {
        for (int i = 1; i <= 10 && !stop; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public void stopThread() {
        this.stop = true;
    
}


}
