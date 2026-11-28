package com.inceptionofcode.project01.services;

import org.springframework.stereotype.Service;
import com.inceptionofcode.project01.repositories.BulkRepository2003;

@Service
public class BulkService2003Impl implements BulkService2003 {

    private final BulkRepository2003 repository;

    public BulkService2003Impl(BulkRepository2003 repository) {
        this.repository = repository;
    }

    @Override
    public String get() {
        return repository.get();
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

    @Override
    public String extra8() {
        return repository.extra8();
    }

    @Override
    public String extra9() {
        return repository.extra9();
    }

}
