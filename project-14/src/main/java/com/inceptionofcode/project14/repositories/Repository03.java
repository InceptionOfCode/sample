package com.inceptionofcode.project14.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class Repository03 {

    private final ConcurrentMap<String, String> records = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong();

    public String save(String value) {
        String id = String.valueOf(sequence.incrementAndGet());
        records.put(id, value);
        return id;
    }

    public String findById(String id) {
        return records.get(id);
    }

    public List<String> findAll() {
        return new ArrayList<>(records.values());
    }
    public String extra1() {
        return "extra-1";
    }

    public String extra2() {
        return "extra-2";
    }

    public String extra3() {
        return "extra-3";
    }

    public String extra4() {
        return "extra-4";
    }

    public String extra5() {
        return "extra-5";
    }

    public String extra6() {
        return "extra-6";
    }

    public String extra7() {
        return "extra-7";
    }
}
