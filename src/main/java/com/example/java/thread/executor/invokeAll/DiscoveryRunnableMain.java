package com.example.java.thread.executor.invokeAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DiscoveryRunnableMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        String[] iparr = {"10.0.0.1", "10.0.0.2","10.0.0.3","10.0.0.4"};
        List<String> ipAddressList = Arrays.asList(iparr);
        List<DiscoveryRunnable> taskList = new ArrayList<>();

        ipAddressList.forEach(ipAddr -> {
            DiscoveryRunnable discovery = new DiscoveryRunnable(ipAddr);
            //taskList.add(discovery);
            service.execute(discovery);
        });

        //List<Future<String>> response = service.invokeAll(taskList);



        service.shutdown();

    }
}
