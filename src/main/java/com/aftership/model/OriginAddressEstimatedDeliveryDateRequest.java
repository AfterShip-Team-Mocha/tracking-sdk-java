/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class OriginAddressEstimatedDeliveryDateRequest extends Resource {

  @SerializedName("country_region")
  private String countryRegion;

  @SerializedName("state")
  private String state;

  @SerializedName("city")
  private String city;

  @SerializedName("postal_code")
  private String postalCode;

  @SerializedName("raw_location")
  private String rawLocation;

  public String getCountryRegion() {
    return countryRegion;
  }

  public void setCountryRegion(String countryRegion) {
    this.countryRegion = countryRegion;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getRawLocation() {
    return rawLocation;
  }

  public void setRawLocation(String rawLocation) {
    this.rawLocation = rawLocation;
  }
}
