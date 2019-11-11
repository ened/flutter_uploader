package com.bluechilli.flutteruploader.json;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class HeaderParameters {
  private final String json;

  public HeaderParameters(String json) {
    this.json = json;
  }

  public Map<String, String> extract() {
    try {
      return parseJson();
    } catch (JSONException e) {
      return Collections.emptyMap();
    }
  }

  private Map<String, String> parseJson() throws JSONException {
    final JSONObject object = new JSONObject(json);
    final HashMap<String, String> map = new HashMap<>();

    for (Iterator<String> it = object.keys(); it.hasNext(); ) {
      String key = it.next();
      Object value = object.get(key);

      if (isValidHeader(key, value)) {
        map.put(key, String.valueOf(object.get(key)));
      }
    }

    return map;
  }

  private boolean isValidHeader(String key, Object value) {
    return key != null && value != null && !TextUtils.isEmpty(value.toString());
  }
}
