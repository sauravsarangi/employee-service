package com.example.saurav.service;

import com.example.saurav.model.EmployeeDto;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class EmployeeStore {

    // In-memory data for demo. Replace with DB repository in real systems.
    private final Map<String, EmployeeDto> data = new ConcurrentHashMap<>();

    public EmployeeStore() {
        data.put("E101", new EmployeeDto("E101", "Aarav", "IT", 120000));
        data.put("E102", new EmployeeDto("E102", "Meera", "HR", 85000));
        data.put("E103", new EmployeeDto("E103", "Rohan", "Finance", 110000));
    }

    public Optional<EmployeeDto> findById(String id) {
        return Optional.ofNullable(data.get(id));
    }
}
