
package com.mblinn.oo.command;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.mblin.oo.command.PurchaseInvoker;

public class PurchaseInvokerTests {

	private PurchaseInvoker purchaseInvokerUnderTest;
	
	private RecordingStubCommand testCommand;
	
	@Before
	public void setUp(){
		purchaseInvokerUnderTest = new PurchaseInvoker();
		testCommand = new RecordingStubCommand();
	}
	
	@Test
	public void executingAPurchase_ShouldExecuteTheUnderlyingCommand(){
		purchaseInvokerUnderTest.executePurchase(testCommand);
		assertTrue(testCommand.wasExecuted);
	}
	
	@Test
	public void executingAPurchase_ShouldAddTheCommandToHistory(){
		purchaseInvokerUnderTest.executePurchase(testCommand);
		assertTrue(testCommand == purchaseInvokerUnderTest.getPurchaseHistory().get(0));
	}
	
}
