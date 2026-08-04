package com.delivery.delivery_app.service;

import org.springframework.stereotype.Service;

@Service
public class AppInfoService {

    public String getVersion() {
        return "Delivery App Version 1.0";
    }
}
