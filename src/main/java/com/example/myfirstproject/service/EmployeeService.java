package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.Employee;


import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
