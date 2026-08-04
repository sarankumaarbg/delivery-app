package com.delivery.delivery_app.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String getHealthMessage() {
        return "Delivery App is running!";
    }
}
