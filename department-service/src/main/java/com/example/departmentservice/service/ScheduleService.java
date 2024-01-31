package com.example.departmentservice.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {


    @Scheduled(fixedRate = 1000)
    public String  batchProcess(){
        System.out.println("Schedule job running....");
        return testBatch();
    }

    public static String testBatch(){
        System.out.println("Demo Schedule job running....");
        return "batchProcess";
    }
}
