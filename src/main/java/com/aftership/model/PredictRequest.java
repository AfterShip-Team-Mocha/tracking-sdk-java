/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class PredictRequest extends Resource {

  @SerializedName("slug")
  private String slug;

  @SerializedName("service_type_name")
  private String serviceTypeName;

  @SerializedName("origin_address")
  private OriginAddressPredictRequest originAddress;

  @SerializedName("destination_address")
  private DestinationAddressPredictRequest destinationAddress;

  @SerializedName("weight")
  private WeightPredictRequest weight;

  @SerializedName("package_count")
  private Integer packageCount;

  @SerializedName("pickup_time")
  private String pickupTime;

  @SerializedName("estimated_pickup")
  private EstimatedPickupPredictRequest estimatedPickup;

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getServiceTypeName() {
    return serviceTypeName;
  }

  public void setServiceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }

  public OriginAddressPredictRequest getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(OriginAddressPredictRequest originAddress) {
    this.originAddress = originAddress;
  }

  public DestinationAddressPredictRequest getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(DestinationAddressPredictRequest destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public WeightPredictRequest getWeight() {
    return weight;
  }

  public void setWeight(WeightPredictRequest weight) {
    this.weight = weight;
  }

  public Integer getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(Integer packageCount) {
    this.packageCount = packageCount;
  }

  public String getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(String pickupTime) {
    this.pickupTime = pickupTime;
  }

  public EstimatedPickupPredictRequest getEstimatedPickup() {
    return estimatedPickup;
  }

  public void setEstimatedPickup(EstimatedPickupPredictRequest estimatedPickup) {
    this.estimatedPickup = estimatedPickup;
  }
}