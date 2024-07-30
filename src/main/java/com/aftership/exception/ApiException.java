/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.exception;

public class ApiException extends Exception {

    private Integer metaCode;
    private String message;
    private Integer code;
    private Integer statusCode;
    private String responseBody;

    public ApiException(final int code, final String message) {
        this.metaCode = 0;
        this.message = message;
        this.statusCode = 0;
        this.code = code;
        this.responseBody = "";
    }

    public ApiException(final int metaCode, final String message, final int code, final int statusCode,
                        final String responseBody) {
        this.metaCode = metaCode;
        this.message = message;
        this.code = code;
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }

    public Integer getMetaCode() {
        return metaCode;
    }

    public void setMetaCode(Integer metaCode) {
        this.metaCode = metaCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "metaCode=" + metaCode +
                ", message='" + message + '\'' +
                ", code=" + code +
                ", statusCode=" + statusCode +
                ", responseBody='" + responseBody + '\'' +
                '}';
    }
}
