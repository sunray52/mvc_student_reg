/*
 * Copyright (c) 2019-2024. Luka Pavlov and others.
 * https://github.com/sunRay52/mvc_student_reg
 *
 * Licensed under the Apache License 2.0
 */

package com.example.mvc_student_reg.dao;

import com.example.mvc_student_reg.models.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ContactDAO {

    private final JdbcTemplate jdbcTemplate;

    public List<Contact> getAll() {
        return jdbcTemplate.query("select * from сontacts", new ContactMapper());
    }

    public Contact getOne(long id) {
        return jdbcTemplate.queryForObject("select * from contacts where id = ?", new Object[] {id}, new ContactMapper());
    }

    //TODO вернуть id и вернуть на форму ( liquid base для создания дб )
    //TODO посмотреть SQl запросы
    public long add(Contact contact) {
        return jdbcTemplate.update(
                "INSERT INTO contacts.tableName (column2, column3, column4, column5) VALUES (?, ?, ?, ?)",
                contact.getName(), contact.getLastName(), contact.getEmail(), contact.getNumber()
        );
    }

    public long delete(long id) {
        return jdbcTemplate.update("DELETE FROM contacts where id = ?", id);
    }

    //TODO добавить в ДАО методы удаления
    //TODO тесты на ДАО (для поднятия - тест контейнерс)
}
