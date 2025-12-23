package com.example.saurav.controller;

import com.example.saurav.model.EmployeeDto;
import com.example.saurav.service.EmployeeStore;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {
    private final EmployeeStore store;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable String id,
                                                   @RequestHeader(value = "X-Correlation-Id", required = false)String correlationId){
        log.info("CorrelationId:: {}",correlationId);
        EmployeeDto employee = store.findById(id).orElseGet(()->null);
        return ResponseEntity.ok(employee);
    }
}
