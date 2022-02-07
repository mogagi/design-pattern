
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import java.util.List;
import java.util.Map;

import com.mblin.oo.tinyweb.RenderingStrategy;

public class DummyViewRenderer implements RenderingStrategy {

	@Override
  public String renderView(Map<String, List<String>> model) {
		String dummyData = model.get("dummyModelKey").get(0);
		return dummyData;
  }

}
