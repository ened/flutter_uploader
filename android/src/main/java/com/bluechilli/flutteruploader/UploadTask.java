package com.bluechilli.flutteruploader;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadTask {

  private String _url;
  private String _method;
  private Map<String, String> _headers = new HashMap<>();
  private Map<String, String> _data = new HashMap<>();
  private List<FileItem> _files = new ArrayList<>();
  private int _requestTimeoutInSeconds = 3600;
  private String _tag;

  public UploadTask(
      String url,
      String method,
      List<FileItem> files,
      Map<String, String> headers,
      Map<String, String> data,
      int requestTimeoutInSeconds,
      String tag) {
    _url = url;
    _method = method;
    _files = files;
    _headers = headers;
    _data = data;
    _requestTimeoutInSeconds = requestTimeoutInSeconds;
    _tag = tag;
  }

  public String getURL() {
    return _url;
  }

  public Uri getUri() {
    return Uri.parse(_url);
  }

  public String getMethod() {
    return _method;
  }

  public List<FileItem> getFiles() {
    return _files;
  }

  public Map<String, String> getHeaders() {
    return _headers;
  }

  public Map<String, String> getParameters() {
    return _data;
  }

  public int getTimeout() {
    return _requestTimeoutInSeconds;
  }

  public String getTag() {
    return _tag;
  }
}
