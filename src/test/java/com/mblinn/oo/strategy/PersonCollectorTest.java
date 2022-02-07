
package com.mblinn.oo.strategy;

import static org.junit.Assert.assertEquals;

import com.mblin.oo.strategy.Person;
import com.mblin.oo.strategy.PersonCollector;
import org.junit.Before;
import org.junit.Test;

public class PersonCollectorTest {
	
	PersonCollector personCollector;
	
	@Before
	public void setup(){
		personCollector = new PersonCollector(new DummyValidator());
	}
	
	@Test
	public void personCollector_startsWithEmptyList(){
		assertEquals(0, personCollector.getValidPeople().size());
	}
	
	@Test
	public void personCollector_addsPeopleToList(){
		Person mike = new Person("Mike", "", "Bevilacqua");
		Person rollo = new Person("Rollo", "", "Tomassi");
		
		personCollector.addPerson(mike);
		personCollector.addPerson(rollo);
		
		assertEquals(2, personCollector.getValidPeople().size());
	}

}
