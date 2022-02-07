
package com.mblinn.mbfpp.oo.tinyweb;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mblinn.mbfpp.oo.tinyweb.stubs.DummyController;
import com.mblinn.mbfpp.oo.tinyweb.stubs.DummyView;
import com.mblinn.mbfpp.oo.tinyweb.stubs.ExceptionalController;
import com.mblinn.mbfpp.oo.tinyweb.stubs.ExceptionalView;
import com.mblin.oo.tinyweb.HttpRequest;
import com.mblin.oo.tinyweb.HttpResponse;

public class TemplateControllerTest {

	DummyController dummyController;
	ExceptionalController exceptionalController;
	DummyController exceptionalViewController;
	DummyView dummyView;
	ExceptionalView exceptionalView;
	HttpRequest httpRequest;
	
	@Before
	public void setup(){
		dummyView = new DummyView();
		exceptionalView = new ExceptionalView();
		
		dummyController = new DummyController(dummyView);
		exceptionalController = new ExceptionalController(dummyView);
		exceptionalViewController = new DummyController(exceptionalView);
		httpRequest = HttpRequest.Builder.newBuilder().build();
	}
	
	@Test
	public void whenRenderIsCalled_viewIsRendered(){
		HttpResponse response = dummyController.handleRequest(httpRequest);
		assertEquals("dummyModelValue", response.getBody());
		assertEquals(Integer.valueOf(200), response.getResponseCode());
	}
	
	@Test
	public void whenControllerThrowsException_itIsHandled(){
		HttpResponse response = exceptionalController.handleRequest(httpRequest);
		assertEquals("", response.getBody());
		assertEquals(Integer.valueOf(500), response.getResponseCode());
	}
	
	@Test
	public void whenViewRenderingThrowsException_itIsHandled(){
		HttpResponse response = exceptionalViewController.handleRequest(httpRequest);
		assertEquals("Exception while rendering.", response.getBody());
		assertEquals(Integer.valueOf(500), response.getResponseCode());	
	}
}
