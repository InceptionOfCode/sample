package com.inceptionofcode.project12.services;

import org.springframework.stereotype.Service;
import com.inceptionofcode.project12.repositories.Repository04;
import java.util.List;

@Service
public class Service04Impl implements Service04 {

    private final Repository04 repository;

    public Service04Impl(Repository04 repository) {
        this.repository = repository;
    }

    @Override
    public String create(String value) {
        String id = repository.save(value);
        return "Created resource 12-04 with id " + id;
    }

    @Override
    public String find(String id) {
        String value = repository.findById(id);
        return value == null ? "Resource 12-04 not found" : value;
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
