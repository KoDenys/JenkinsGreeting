package com.example.simplewebapp;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Greeting{

    @Override
    public String greeting(String name){
        return "Hello dear, " + name;
    }
}
