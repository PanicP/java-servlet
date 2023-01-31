package com.example.test;

import jakarta.ejb.Stateless;

@Stateless
public class BMIBean {
    public float BMICalculator(float weight, float height) {
        return weight/(height * height);
    }
}
