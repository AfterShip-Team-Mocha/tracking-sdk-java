/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class EstimatedDeliveryDateResponse extends Resource {

  @SerializedName("id")
  private String id;

  @SerializedName("slug")
  private String slug;

  @SerializedName("service_type_name")
  private String serviceTypeName;

  @SerializedName("origin_address")
  private OriginAddressEstimatedDeliveryDateResponse originAddress;

  @SerializedName("destination_address")
  private DestinationAddressEstimatedDeliveryDateResponse destinationAddress;

  @SerializedName("weight")
  private WeightEstimatedDeliveryDateResponse weight;

  @SerializedName("package_count")
  private Integer packageCount;

  @SerializedName("pickup_time")
  private String pickupTime;

  @SerializedName("estimated_pickup")
  private EstimatedPickupEstimatedDeliveryDateResponse estimatedPickup;

  @SerializedName("estimated_delivery_date")
  private String estimatedDeliveryDate;

  @SerializedName("confidence_code")
  private Float confidenceCode;

  @SerializedName("estimated_delivery_date_min")
  private String estimatedDeliveryDateMin;

  @SerializedName("estimated_delivery_date_max")
  private String estimatedDeliveryDateMax;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public OriginAddressEstimatedDeliveryDateResponse getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(OriginAddressEstimatedDeliveryDateResponse originAddress) {
    this.originAddress = originAddress;
  }

  public DestinationAddressEstimatedDeliveryDateResponse getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(
      DestinationAddressEstimatedDeliveryDateResponse destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public WeightEstimatedDeliveryDateResponse getWeight() {
    return weight;
  }

  public void setWeight(WeightEstimatedDeliveryDateResponse weight) {
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

  public EstimatedPickupEstimatedDeliveryDateResponse getEstimatedPickup() {
    return estimatedPickup;
  }

  public void setEstimatedPickup(EstimatedPickupEstimatedDeliveryDateResponse estimatedPickup) {
    this.estimatedPickup = estimatedPickup;
  }

  public String getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }

  public Float getConfidenceCode() {
    return confidenceCode;
  }

  public void setConfidenceCode(Float confidenceCode) {
    this.confidenceCode = confidenceCode;
  }

  public String getEstimatedDeliveryDateMin() {
    return estimatedDeliveryDateMin;
  }

  public void setEstimatedDeliveryDateMin(String estimatedDeliveryDateMin) {
    this.estimatedDeliveryDateMin = estimatedDeliveryDateMin;
  }

  public String getEstimatedDeliveryDateMax() {
    return estimatedDeliveryDateMax;
  }

  public void setEstimatedDeliveryDateMax(String estimatedDeliveryDateMax) {
    this.estimatedDeliveryDateMax = estimatedDeliveryDateMax;
  }
}
