/*
 * Copyright (c) 2019-2024. Luka Pavlov and others.
 * https://github.com/sunRay52/mvc_student_reg
 *
 * Licensed under the Apache License 2.0
 */

package com.example.mvc_student_reg.dao;

import com.example.mvc_student_reg.models.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<Contact> {


    //
    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact contact = new Contact();

        contact.setName(rs.getString("name"));
        contact.setName(rs.getString("lastName"));
        contact.setName(rs.getString("email"));
        contact.setName(rs.getString("number"));

        return contact;
    }
}
