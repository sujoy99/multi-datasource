package com.starter.demo.controller;

import com.starter.demo.dto.DataDTO;
import com.starter.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/save")
    public ResponseEntity<String> saveData(@RequestParam String db) {
        dataService.saveData(db);
        return ResponseEntity.ok("Data saved successfully.");
    }
}
