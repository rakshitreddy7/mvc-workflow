package com.spring.mvc.controllers;

import com.spring.mvc.models.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public ModelAndView getEmployee() {
        Employee employee = Employee.builder()
                .id(123)
                .name("Reddy")
                .company("Google")
                .build();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employee", employee);
        modelAndView.setViewName("employee");

        return modelAndView;
    }
}
