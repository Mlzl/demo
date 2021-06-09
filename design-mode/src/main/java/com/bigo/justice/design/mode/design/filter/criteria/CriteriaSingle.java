package com.bigo.justice.design.mode.design.filter.criteria;

import com.bigo.justice.design.mode.design.filter.Criteria;
import com.bigo.justice.design.mode.design.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ambi
 * @data 2021/6/9 15:20
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
