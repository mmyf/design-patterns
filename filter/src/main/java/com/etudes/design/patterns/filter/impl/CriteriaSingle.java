package com.etudes.design.patterns.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.etudes.design.patterns.filter.Criteria;
import com.etudes.design.patterns.filter.domain.Person;

public class CriteriaSingle implements Criteria {

   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> singlePersons = new ArrayList<Person>(); 
      
      for (Person person : persons) {
         if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
            singlePersons.add(person);
         }
      }
      return singlePersons;
   }
}