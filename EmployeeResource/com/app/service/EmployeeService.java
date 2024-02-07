package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepository;
import com.app.exceptions.EmailAlreadyExistsException;
import com.app.exceptions.ResourceNotFoundException;
import com.app.pojos.Employee;

@Service
public class EmployeeService {

    private  EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) throws EmailAlreadyExistsException {
        if (employeeRepository.findByEmail(employee.getEmail()).isPresent()) {
            throw new EmailAlreadyExistsException("Employee with email " + employee.getEmail() + " already exists");
        }
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Long id) throws ResourceNotFoundException {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee with ID " + id + " not found"));
    }
}

