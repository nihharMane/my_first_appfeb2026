package com.example.demo.service.serviceImp;

import com.example.demo.service.serviceInterface.AddService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.health.actuate.endpoint.HealthEndpoint;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;


@RequiredArgsConstructor


@Service
@Slf4j
public class ADDno implements AddService{
    // Lombok's @Slf4j annotation creates a 'log' field automatically
    //Read server.port from application.properties and assign to serverPort variable
     @Value("${server.port}")
     private int serverPort;

   private final Random random ;
   private final HealthEndpoint healthEndpoint;

     //read spring.application.name from application.properties and assign to appName variable
        @Value("${spring.application.name}")
    private String appName;


    @Override
    public int add(int val1,int val2){

        log.info("ADDno serverPort={}", serverPort);
        return val1 + val2 +random.nextInt(100);

    }

    @Override
    public int subtract(int val1,int val2) {

        int result = val1 - val2;
        log.info("Subtracting: {} - {} = {}", val1, val2, result);
        return result;
    }
}
