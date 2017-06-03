package cn.volc.task.job;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestJobTask {
    public void excute() {
	System.out.println("Start job");
	// 创建线程池大小
	ExecutorService exec = Executors.newFixedThreadPool(3);
	for (int i = 0; i < 2; i++) {
	    exec.execute(new TestThread());
	}
	exec.shutdown();
	while (!exec.isTerminated()) {
	}
	System.out.println("end job");
    }

}
