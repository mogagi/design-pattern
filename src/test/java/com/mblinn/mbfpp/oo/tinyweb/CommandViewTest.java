
package com.mblinn.mbfpp.oo.tinyweb;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.mblinn.mbfpp.oo.tinyweb.stubs.DummyViewRenderer;
import com.mblinn.mbfpp.oo.tinyweb.stubs.ExceptionalViewRenderer;
import com.mblin.oo.tinyweb.StrategyView;
import com.mblin.oo.tinyweb.RenderingException;
import com.mblin.oo.tinyweb.RenderingStrategy;

public class CommandViewTest {

	RenderingStrategy dummyViewRenderer;
	RenderingStrategy exceptionalViewRenderer;
	StrategyView commandView;
	Map<String, List<String>> model;
	
	@Before
	public void setup(){
		dummyViewRenderer = new DummyViewRenderer();
		exceptionalViewRenderer = new ExceptionalViewRenderer();
		model = new HashMap<String, List<String>>();
		List<String> modelValues = new ArrayList<String>();
		modelValues.add("dummyModelValue");
		model.put("dummyModelKey", modelValues);
	}
	
	@Test
	public void commandView_rendersUsingViewRenderer(){
		commandView = new StrategyView(dummyViewRenderer);
		String body = commandView.render(model);
		assertEquals("dummyModelValue", body);
	}
	
	@Test(expected=RenderingException.class)
	public void commandView_catchesExceptionsAndWrapsThem(){
		commandView = new StrategyView(exceptionalViewRenderer);
		commandView.render(model);
	}
}
