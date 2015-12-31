package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }
    
    public String getName() {
    	List<String> list = new ArrayList<>();
    	switch ("ssss") {
		case "1111":
			break;
		default:
			break;
		}
        return name;
    }

}
