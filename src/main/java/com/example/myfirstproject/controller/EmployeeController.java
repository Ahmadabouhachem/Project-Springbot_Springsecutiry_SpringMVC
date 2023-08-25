package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.Employee;
import com.example.myfirstproject.service.EmployeeService;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import jakarta.validation.Valid;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/company")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService=theEmployeeService;
    }

    @GetMapping("")
    public String getCompany(){
        return "/company/home";
    }

    @GetMapping("/employees")
    public String getEmployees(Model theModel){
        List<Employee> myEmployees = employeeService.findAll();
        theModel.addAttribute("Employees",myEmployees);
        return "/company/employees";
    }

    @GetMapping("/form")
    public String showForm(Model theModel){
        Employee employee = new Employee();
        theModel.addAttribute("employee", employee);

        return "/company/add-employee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/company/employees";
    }

    @GetMapping("/update")
    public String update(@RequestParam("employeeId")int theId, Model theModel){
        Employee employee= employeeService.findById(theId);

        theModel.addAttribute("employee",employee);

        return "/company/add-employee";
    }

    @GetMapping("delete")
    public String delete(@RequestParam("employeeId")int theId){
        employeeService.deleteById(theId);
        return "redirect:/company/employees";
    }

    }
