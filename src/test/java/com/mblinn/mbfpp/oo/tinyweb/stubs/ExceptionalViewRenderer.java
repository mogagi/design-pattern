
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import java.util.List;
import java.util.Map;

import com.mblin.oo.tinyweb.RenderingStrategy;

public class ExceptionalViewRenderer implements RenderingStrategy {

	@Override
  public String renderView(Map<String, List<String>> model) {
		throw new RuntimeException();
  }

}
