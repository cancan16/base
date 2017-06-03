package cn.volc.task.job;

public class TestThread implements Runnable {

    @Override
    public void run() {
	try {
	    System.out.println("执行线程");
	    Thread.sleep(5000);
	    System.out.println("执行完毕");
	} catch (InterruptedException e1) {
	    e1.printStackTrace();
	}
    }
}
