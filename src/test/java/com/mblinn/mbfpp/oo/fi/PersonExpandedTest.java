
package com.mblinn.mbfpp.oo.fi;

import static org.junit.Assert.assertEquals;

import com.mblin.oo.fi.ComplicatedNameComparator;
import com.mblin.oo.fi.PersonExpanded;
import org.junit.Before;
import org.junit.Test;


public class PersonExpandedTest {

	ComplicatedNameComparator complicatedNameComparator;
	
	@Before
	public void setup(){
		complicatedNameComparator = new ComplicatedNameComparator();
	}
	
	@Test
	public void complicatedNameComparator_sortsByFirstNameFirst(){
		PersonExpanded p1 = new PersonExpanded("a", "c", "d");
		PersonExpanded p2 = new PersonExpanded("b", "c", "d");
		assertEquals(-1, complicatedNameComparator.compare(p1,  p2));
	}
	
	@Test
	public void complicatedNameComparator_sortsByLastNameSecond(){
		PersonExpanded p1 = new PersonExpanded("a", "c", "b");
		PersonExpanded p2 = new PersonExpanded("a", "c", "d");
		assertEquals(-2, complicatedNameComparator.compare(p1,  p2));
	}
	
	@Test
	public void complicatedNameComparator_sortsByMiddleNameThird(){
		PersonExpanded p1 = new PersonExpanded("a", "b", "d");
		PersonExpanded p2 = new PersonExpanded("a", "c", "d");
		assertEquals(-1, complicatedNameComparator.compare(p1,  p2));
	}
}
