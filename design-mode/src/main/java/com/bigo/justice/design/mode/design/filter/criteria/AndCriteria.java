package com.bigo.justice.design.mode.design.filter.criteria;

import com.bigo.justice.design.mode.design.filter.Criteria;
import com.bigo.justice.design.mode.design.filter.Person;

import java.util.List;

/**
 * @author ambi
 * @data 2021/6/9 15:20
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
