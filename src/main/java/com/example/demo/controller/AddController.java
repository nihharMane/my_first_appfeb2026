package com.example.demo.controller;

import com.example.demo.service.serviceInterface.AddService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class AddController {

    private final AddService service;
    private final ApplicationContext applicationContext;

   // AddService addService = applicationContext.getBean(AddService.class);



    @GetMapping("/add")
    public int add(@RequestParam int val1,
                   @RequestParam int val2) {

        log.info("AddController this={}", this);
        int result = service.add(val1, val2);
        log.info("Result={}", result);


        return result;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int val1,
                        @RequestParam int val2) {

        log.info("AddController this={}", this);
        int result = service.subtract(val1, val2);
        log.info("Result={}", result);
        return result;
    }
    @PostConstruct
    private void init() {
        log.info("MathController.init ApplicationContext={}", applicationContext);
        //Print all the beans in the application context
//        String[] beanNames = applicationContext.getBeanDefinitionNames();
//
//        log.info("Beans in the application context: start");
//        for (String beanName : beanNames) {
//            log.info("Bean: {}", beanName);
//
        }
    }





