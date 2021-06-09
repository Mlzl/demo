package com.bigo.justice.design.mode.design.filter.criteria;

import com.bigo.justice.design.mode.design.filter.Criteria;
import com.bigo.justice.design.mode.design.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ambi
 * @data 2021/6/9 15:19
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
