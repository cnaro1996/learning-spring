package com.in28minutes.learnspringframework.exercises.BusinessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] { 3, 4, 5, 66, 7 };
    }
}
