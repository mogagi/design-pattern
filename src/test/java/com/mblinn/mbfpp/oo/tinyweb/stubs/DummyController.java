
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mblin.oo.tinyweb.HttpRequest;
import com.mblin.oo.tinyweb.TemplateController;
import com.mblin.oo.tinyweb.View;

public class DummyController extends TemplateController {

	public DummyController(View view) {
	  super(view);
  }
	
	@Override
  protected Map<String, List<String>> doRequest(HttpRequest request) {
		Map<String, List<String>> dummyMap = new HashMap<String, List<String>>();
		List<String> value = new ArrayList<String>();
		value.add("dummyModelValue");
		dummyMap.put("dummyModelKey", value);
		return dummyMap;
  }

}
