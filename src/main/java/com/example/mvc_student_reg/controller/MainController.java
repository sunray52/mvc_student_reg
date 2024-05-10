/*
 * Copyright (c) 2019-2024. Luka Pavlov and others.
 * https://github.com/sunRay52/mvc_student_reg
 *
 * Licensed under the Apache License 2.0
 */

package com.example.mvc_student_reg.controller;

import com.example.mvc_student_reg.dao.ContactDAO;
import com.example.mvc_student_reg.models.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RequiredArgsConstructor
@Controller
public class MainController {

    private final ContactDAO contactDAO;

    @GetMapping("/student_reg")
    public String entryPoint(final Model model) {
        contactsRefreash(model);
        return "home";
    }

    @PostMapping("/student_reg")
    public String contactsAdd(final Model model, final Contact contact) {
        contactDAO.add(contact);
        contactsRefreash(model);
        return "redirect:/home";
    }

    @PostMapping("/delete")
    public String contactsDelete(final Model model, final long id) {
        contactDAO.delete(id);
        contactsRefreash(model);
        return "redirect:/home";
    }

    private void contactsRefreash(final Model model) {
        final Iterable<Contact> contacts = contactDAO.getAll();
        model.addAttribute("contact", contacts);
    }
}
