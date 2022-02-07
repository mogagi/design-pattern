package com.mblin.oo.tinyweb;

import java.util.List;
import java.util.Map;

public interface View {
    String render(Map<String, List<String>> model);
}
