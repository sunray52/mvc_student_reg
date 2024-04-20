/*
 * Copyright (c) 2019-2024. Luka Pavlov and others.
 * https://github.com/sunRay52/mvc_student_reg
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class MainController {

    private ContactRepository contactRepository;

    @GetMapping("/student_reg")
    public String entryPoint(final Model model) {
        final Iterable<Contact> contacts = contactRepository.findAll();
        model.addAttribute("contact", contacts);
        return "home";
    }

    @PostMapping("/student_reg")
    public String contactsAdd(@RequestParam final String nameValue, final @RequestParam String lastNameValue, @RequestParam final  String emailValue, @RequestParam final String numberValue, final Model model) {
        final Contact contact = new Contact(nameValue, lastNameValue, emailValue, numberValue);
        contactRepository.save(contact);
        return "";
    }
}
