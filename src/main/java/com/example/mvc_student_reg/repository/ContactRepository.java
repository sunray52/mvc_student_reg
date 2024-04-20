/*
 * Copyright (c) 2019-2024. Luka Pavlov and others.
 * https://github.com/sunRay52/mvc_student_reg
 *
 * Licensed under the Apache License 2.0
 */

package com.example.mvc_student_reg.repository;

import com.example.mvc_student_reg.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
