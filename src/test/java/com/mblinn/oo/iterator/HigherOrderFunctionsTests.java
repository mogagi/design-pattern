
package com.mblinn.oo.iterator;

import static com.mblin.oo.iterator.HigherOrderFunctions.prependHello;
import static com.mblin.oo.iterator.HigherOrderFunctions.sumSequence;
import static com.mblin.oo.iterator.HigherOrderFunctions.vowelsInWord;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class HigherOrderFunctionsTests {

	@Test
	public void sumOfEmptySequenceIsZero(){
		List<Integer> sequence = new ArrayList<Integer>();
		assertEquals((Integer) 0, sumSequence(sequence));
	}
	
	@Test
	public void sumOfSequenceComputesASequencesSum(){
		List<Integer> sequence = new ArrayList<Integer>();
		sequence.add(42);
		sequence.add(100);
		sequence.add(8);
		assertEquals((Integer) 150, sumSequence(sequence));
	}
	
	@Test
	public void sumOfSequenceComputesASequencWithNegatives(){
		List<Integer> sequence = new ArrayList<Integer>();
		sequence.add(42);
		sequence.add(100);
		sequence.add(-42);
		assertEquals((Integer) 100, sumSequence(sequence));
	}
	
	@Test
	public void prependHelloPrependsHello(){
		List<String> names = new ArrayList<String>();
		names.add("Michael");
		names.add("Mishu");
		names.add("Joe");
		
		List<String> prepended = new ArrayList<String>();
		prepended.add("Hello, Michael");
		prepended.add("Hello, Mishu");
		prepended.add("Hello, Joe");
		
		assertEquals(prepended, prependHello(names));
	}
	
	@Test
	public void vowelsInWordReturnsSetOfVowelsInWord(){
		String word = "mishu";
		Set<Character> expectedVowels = new HashSet<Character>();
		expectedVowels.add('i');
		expectedVowels.add('u');
		
		assertEquals(expectedVowels, vowelsInWord(word));
	}
	
	@Test
	public void vowelsInWordWithNoVowelsReturnsEmptySet(){
		String word = "sdf";
		Set<Character> expectedVowels = new HashSet<Character>();
		
		assertEquals(expectedVowels, vowelsInWord(word));
	}
}
