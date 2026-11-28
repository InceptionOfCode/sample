package com.inceptionofcode.project10.services;

import org.springframework.stereotype.Service;
import com.inceptionofcode.project10.repositories.Repository05;
import java.util.List;

@Service
public class Service05Impl implements Service05 {

    private final Repository05 repository;

    public Service05Impl(Repository05 repository) {
        this.repository = repository;
    }

    @Override
    public String create(String value) {
        String id = repository.save(value);
        return "Created resource 10-05 with id " + id;
    }

    @Override
    public String find(String id) {
        String value = repository.findById(id);
        return value == null ? "Resource 10-05 not found" : value;
    }

    @Override
    public List<String> findAll() {
        return repository.findAll();
    }

    @Override
    public String extra1() {
        return repository.extra1();
    }

    @Override
    public String extra2() {
        return repository.extra2();
    }

    @Override
    public String extra3() {
        return repository.extra3();
    }

    @Override
    public String extra4() {
        return repository.extra4();
    }

    @Override
    public String extra5() {
        return repository.extra5();
    }

    @Override
    public String extra6() {
        return repository.extra6();
    }

    @Override
    public String extra7() {
        return repository.extra7();
    }

}
