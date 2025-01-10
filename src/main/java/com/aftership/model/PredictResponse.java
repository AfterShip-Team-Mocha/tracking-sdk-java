/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class PredictResponse extends Resource {

  @SerializedName("id")
  private String id;

  @SerializedName("slug")
  private String slug;

  @SerializedName("service_type_name")
  private String serviceTypeName;

  @SerializedName("origin_address")
  private OriginAddressPredictResponse originAddress;

  @SerializedName("destination_address")
  private DestinationAddressPredictResponse destinationAddress;

  @SerializedName("weight")
  private WeightPredictResponse weight;

  @SerializedName("package_count")
  private Integer packageCount;

  @SerializedName("pickup_time")
  private String pickupTime;

  @SerializedName("estimated_pickup")
  private EstimatedPickupPredictResponse estimatedPickup;

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

  public OriginAddressPredictResponse getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(OriginAddressPredictResponse originAddress) {
    this.originAddress = originAddress;
  }

  public DestinationAddressPredictResponse getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(DestinationAddressPredictResponse destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public WeightPredictResponse getWeight() {
    return weight;
  }

  public void setWeight(WeightPredictResponse weight) {
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

  public EstimatedPickupPredictResponse getEstimatedPickup() {
    return estimatedPickup;
  }

  public void setEstimatedPickup(EstimatedPickupPredictResponse estimatedPickup) {
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
