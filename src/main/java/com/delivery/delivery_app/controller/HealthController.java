package com.delivery.delivery_app.controller;

import com.delivery.delivery_app.service.AppInfoService;
import com.delivery.delivery_app.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;
    private final AppInfoService appInfoService;

    public HealthController(
            HealthService healthService,
            AppInfoService appInfoService, AppInfoService appInfoService1
    ) {
        this.healthService = healthService;
        this.appInfoService = appInfoService1;
    }

    @GetMapping("/health")
    public String health() {
        return healthService.getHealthMessage();
    }

    @GetMapping("/version")
    public String version() {
        return appInfoService.getVersion();
    }
}
