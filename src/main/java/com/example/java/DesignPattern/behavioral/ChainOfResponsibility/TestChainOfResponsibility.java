package com.example.java.DesignPattern.behavioral.ChainOfResponsibility;

public class TestChainOfResponsibility {
    public static void main(String[] args)
    {

        SupportService supportService = new SupportService();

        ServiceRequest request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_ONE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_THREE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        request = new ServiceRequest();
        request.setType(ServiceLevel.INVALID_REQUEST);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());
    }
}
/*
In chain of responsibility, sender sends a request to a chain of objects.
The request can be handled by any object in the chain.
 */