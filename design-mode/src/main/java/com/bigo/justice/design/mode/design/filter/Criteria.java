package com.bigo.justice.design.mode.design.filter;

import java.util.List;

/**
 * @author ambi
 * @data 2021/6/9 15:17
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}
