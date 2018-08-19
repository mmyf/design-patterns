package com.etudes.design.patterns.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.etudes.design.patterns.filter.Criteria;
import com.etudes.design.patterns.filter.domain.Person;

public class CriteriaMale implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}