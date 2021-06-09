package com.bigo.justice.design.mode.design.filter.criteria;

import com.bigo.justice.design.mode.design.filter.Criteria;
import com.bigo.justice.design.mode.design.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ambi
 * @data 2021/6/9 15:18
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
