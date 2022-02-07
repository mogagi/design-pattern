
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import java.util.List;
import java.util.Map;

import com.mblin.oo.tinyweb.RenderingException;
import com.mblin.oo.tinyweb.View;

public class ExceptionalView implements View {

	@Override
  public String render(Map<String, List<String>> model) {
		throw new RenderingException(new RuntimeException());
  }

}
