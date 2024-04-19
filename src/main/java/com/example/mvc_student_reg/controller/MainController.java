/*
 * Copyright (c) 2019-2024. Luka Pavlov and others.
 * https://github.com/sunRay52/work-userform
 *
 * Licensed under the Apache License 2.0
 */

package com.example.mvc_student_reg.controller;

import com.example.mvc_student_reg.models.Contact;
import com.example.mvc_student_reg.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    private ContactRepository contactRepository;

    @GetMapping("/")
    public String entryPoint(Model model) {
        Iterable<Contact> contacts = contactRepository.findAll();
        model.addAttribute("contact", contacts);
        return "home";
    }
}
