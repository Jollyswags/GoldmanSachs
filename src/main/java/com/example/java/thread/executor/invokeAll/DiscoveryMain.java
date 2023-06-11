package com.example.java.thread.executor.invokeAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class DiscoveryMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        String[] iparr = {"10.0.0.1", "10.0.0.2","10.0.0.3","10.0.0.4"};
        List<String> ipAddressList = Arrays.asList(iparr);
        List<Discovery> taskList = new ArrayList<>();

        ipAddressList.forEach(ipAddr -> {
            Discovery discovery = new Discovery(ipAddr);
            taskList.add(discovery);
        });

        List<Future<String>> response = service.invokeAll(taskList);

        response.forEach(res -> {
            try {
                System.out.println(res.get()+" ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        service.shutdown();

    }
}
