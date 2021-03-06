
package com.mblinn.oo.command;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mblin.oo.command.CashRegister;

public class CashRegisterTests {

	private CashRegister cashRegisterUnderTest;
	
	@Before
	public void setup(){
		cashRegisterUnderTest = new CashRegister(0);
	}
	
	@Test
	public void addingMoneyToRegister_addsItToTotal(){
		cashRegisterUnderTest.addCash(100);
		assertEquals(Integer.valueOf(100), cashRegisterUnderTest.getTotal());
		cashRegisterUnderTest.addCash(50);
		assertEquals(Integer.valueOf(150), cashRegisterUnderTest.getTotal());
	}
	
}
