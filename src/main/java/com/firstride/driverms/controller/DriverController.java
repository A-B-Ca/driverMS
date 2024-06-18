package com.firstride.driverms.controller;

import com.firstride.driverms.entity.DriverEntity;
import com.firstride.driverms.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping
    public ResponseEntity<DriverEntity> registerDriver(@RequestBody DriverEntity driver) {
        return ResponseEntity.ok(driverService.registerDriver(driver));
    }

}
