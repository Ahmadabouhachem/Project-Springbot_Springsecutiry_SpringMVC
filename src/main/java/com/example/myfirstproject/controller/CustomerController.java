package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // with this Methode if the user write in last name box "     " it will be false, and if user write "ab     cd" it will be "ab cd"
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("")
    public String showForm(Model theModel){

        theModel.addAttribute("customer", new Customer());

        return "/customer/customer";
    }

    @PostMapping("/processForm")
        public String processForm (@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult){
        if(theBindingResult.hasErrors()) {
            return "/customer/customer-error";
        }
        else {
            return "/customer/customer-confirmation";
        }
    }

}
