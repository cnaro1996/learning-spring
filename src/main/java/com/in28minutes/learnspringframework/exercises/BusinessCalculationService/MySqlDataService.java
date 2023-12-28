package com.in28minutes.learnspringframework.exercises.BusinessCalculationService;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] { 8, 44, 3, 2, 11 };
    }
}
