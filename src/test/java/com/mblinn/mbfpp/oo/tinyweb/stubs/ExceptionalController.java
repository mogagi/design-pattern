
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import java.util.List;
import java.util.Map;

import com.mblin.oo.tinyweb.HttpRequest;
import com.mblin.oo.tinyweb.TemplateController;
import com.mblin.oo.tinyweb.View;

public class ExceptionalController extends TemplateController {

	public ExceptionalController(View view) {
	  super(view);
  }

	@Override
  protected Map<String, List<String>> doRequest(HttpRequest request) {
		throw new RuntimeException();
  }

}
