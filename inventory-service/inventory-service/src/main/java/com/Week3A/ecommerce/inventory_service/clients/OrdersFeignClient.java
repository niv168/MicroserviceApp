package com.Week3A.ecommerce.inventory_service.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service",path ="/orders")  //name should be same as name of order microservice in its app.properties. Using this it'll talk to eureka server i.e. discoveryclient about port
public interface OrdersFeignClient {  //this name because here we want to show that inventory client is talking to ordersclient

    @GetMapping("/core/helloOrders")
    String helloOrders();
}
