
package com.mblinn.mbfpp.oo.tinyweb;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.mblinn.mbfpp.oo.tinyweb.stubs.AddDummyHeaderFilter;
import com.mblinn.mbfpp.oo.tinyweb.stubs.DummyController;
import com.mblinn.mbfpp.oo.tinyweb.stubs.DummyViewRenderer;
import com.mblin.oo.tinyweb.StrategyView;
import com.mblin.oo.tinyweb.Controller;
import com.mblin.oo.tinyweb.Filter;
import com.mblin.oo.tinyweb.HttpRequest;
import com.mblin.oo.tinyweb.HttpResponse;
import com.mblin.oo.tinyweb.TinyWeb;

public class ITestTinyweb {

	TinyWeb tinyWeb;
	
	@Before
	public void setup(){
		DummyViewRenderer viewRenderer = new DummyViewRenderer();
		StrategyView greetingView = new StrategyView(viewRenderer);
		DummyController dummyController = new DummyController(greetingView);
		
		Map<String, Controller> controllers = new HashMap<String, Controller>();
		controllers.put("dummy/", dummyController);
		
		List<Filter> filters = new ArrayList<Filter>();
		filters.add(new AddDummyHeaderFilter());
		
		tinyWeb = new TinyWeb(controllers, filters);
	}
	
	@Test
	public void endToEnd(){
		HttpRequest request = HttpRequest.Builder.newBuilder().path("dummy/").build();
		HttpResponse response = tinyWeb.handleRequest(request);
		assertEquals(Integer.valueOf(200), response.getResponseCode());
		assertEquals("dummyModelValue", response.getBody());
	}
}
