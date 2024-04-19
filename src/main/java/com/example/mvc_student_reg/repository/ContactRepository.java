package com.example.mvc_student_reg.repository;

import com.example.mvc_student_reg.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
