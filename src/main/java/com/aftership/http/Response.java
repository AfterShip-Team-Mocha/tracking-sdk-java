/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.http;

import org.apache.http.Header;

public class Response {
  private final int statusCode;
  private final String content;
  private final boolean isTimeout;
  private final Header[] headers;

  public Response() {
    this.statusCode = 0;
    this.content = "";
    this.isTimeout = true;
    this.headers = null;
  }

  public Response(String content, int statusCode, boolean isTimeout, Header[] headers) {
    this.content = content;
    this.statusCode = statusCode;
    this.isTimeout = isTimeout;
    this.headers = headers;
  }

  public String getContent() {
    return content;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public boolean isTimeout() {
    return isTimeout;
  }

  public Header[] getHeaders() {
    return headers;
  }
}
