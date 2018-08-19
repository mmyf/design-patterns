package com.etudes.design.patterns.filter;

import java.util.List;

import com.etudes.design.patterns.filter.domain.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}