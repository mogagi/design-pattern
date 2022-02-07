
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import java.util.List;
import java.util.Map;

import com.mblin.oo.tinyweb.View;

public class DummyView implements View {

	@Override
  public String render(Map<String, List<String>> model) {
		return model.get("dummyModelKey").get(0);
  }

}
