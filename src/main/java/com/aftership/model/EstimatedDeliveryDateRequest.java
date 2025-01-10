/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class EstimatedDeliveryDateRequest extends Resource {

  @SerializedName("slug")
  private String slug;

  @SerializedName("service_type_name")
  private String serviceTypeName;

  @SerializedName("origin_address")
  private OriginAddressEstimatedDeliveryDateRequest originAddress;

  @SerializedName("destination_address")
  private DestinationAddressEstimatedDeliveryDateRequest destinationAddress;

  @SerializedName("weight")
  private WeightEstimatedDeliveryDateRequest weight;

  @SerializedName("package_count")
  private Integer packageCount;

  @SerializedName("pickup_time")
  private String pickupTime;

  @SerializedName("estimated_pickup")
  private EstimatedPickupEstimatedDeliveryDateRequest estimatedPickup;

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

  public OriginAddressEstimatedDeliveryDateRequest getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(OriginAddressEstimatedDeliveryDateRequest originAddress) {
    this.originAddress = originAddress;
  }

  public DestinationAddressEstimatedDeliveryDateRequest getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(
      DestinationAddressEstimatedDeliveryDateRequest destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public WeightEstimatedDeliveryDateRequest getWeight() {
    return weight;
  }

  public void setWeight(WeightEstimatedDeliveryDateRequest weight) {
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

  public EstimatedPickupEstimatedDeliveryDateRequest getEstimatedPickup() {
    return estimatedPickup;
  }

  public void setEstimatedPickup(EstimatedPickupEstimatedDeliveryDateRequest estimatedPickup) {
    this.estimatedPickup = estimatedPickup;
  }
}
