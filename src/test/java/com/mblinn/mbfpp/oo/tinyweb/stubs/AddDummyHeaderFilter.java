
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import com.mblin.oo.tinyweb.Filter;
import com.mblin.oo.tinyweb.HttpRequest;

public class AddDummyHeaderFilter implements Filter {

	@Override
  public HttpRequest doFilter(HttpRequest request) {
		return HttpRequest.Builder.builderFrom(request).addHeader("dummyHeader", "dummyHeaderValue").build();
  }

}
