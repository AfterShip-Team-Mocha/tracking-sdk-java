/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class CreateTrackingResponse extends Resource {

    @SerializedName("id")
    private String id;

    @SerializedName("legacy_id")
    private String legacyId;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("last_updated_at")
    private String lastUpdatedAt;

    @SerializedName("tracking_number")
    private String trackingNumber;

    @SerializedName("slug")
    private String slug;

    @SerializedName("active")
    private Boolean active;

    @SerializedName("custom_fields")
    private java.util.Map<String, String> customFields;

    @SerializedName("customer_name")
    private String customerName;

    @SerializedName("transit_time")
    private Integer transitTime;

    @SerializedName("origin_country_iso3")
    private String originCountryIso3;

    @SerializedName("origin_state")
    private String originState;

    @SerializedName("origin_city")
    private String originCity;

    @SerializedName("origin_postal_code")
    private String originPostalCode;

    @SerializedName("origin_raw_location")
    private String originRawLocation;

    @SerializedName("destination_country_iso3")
    private String destinationCountryIso3;

    @SerializedName("destination_state")
    private String destinationState;

    @SerializedName("destination_city")
    private String destinationCity;

    @SerializedName("destination_postal_code")
    private String destinationPostalCode;

    @SerializedName("destination_raw_location")
    private String destinationRawLocation;

    @SerializedName("courier_destination_country_iso3")
    private String courierDestinationCountryIso3;

    @SerializedName("emails")
    private java.util.List<String> emails;

    @SerializedName("expected_delivery")
    private String expectedDelivery;

    @SerializedName("note")
    private String note;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName("order_id_path")
    private String orderIdPath;

    @SerializedName("order_date")
    private String orderDate;

    @SerializedName("shipment_package_count")
    private Float shipmentPackageCount;

    @SerializedName("shipment_pickup_date")
    private String shipmentPickupDate;

    @SerializedName("shipment_delivery_date")
    private String shipmentDeliveryDate;

    @SerializedName("shipment_type")
    private String shipmentType;

    @SerializedName("shipment_weight")
    private ShipmentWeightCreateTrackingResponse shipmentWeight;

    @SerializedName("signed_by")
    private String signedBy;

    @SerializedName("smses")
    private java.util.List<String> smses;

    @SerializedName("source")
    private String source;

    @SerializedName("tag")
    private TagV1 tag;

    @SerializedName("subtag")
    private String subtag;

    @SerializedName("subtag_message")
    private String subtagMessage;

    @SerializedName("title")
    private String title;

    @SerializedName("tracked_count")
    private Float trackedCount;

    @SerializedName("last_mile_tracking_supported")
    private Boolean lastMileTrackingSupported;

    @SerializedName("language")
    private String language;

    @SerializedName("unique_token")
    private String uniqueToken;

    @SerializedName("checkpoints")
    private java.util.List<Checkpoint> checkpoints;

    @SerializedName("subscribed_smses")
    private java.util.List<String> subscribedSmses;

    @SerializedName("subscribed_emails")
    private java.util.List<String> subscribedEmails;

    @SerializedName("return_to_sender")
    private Boolean returnToSender;

    @SerializedName("order_promised_delivery_date")
    private String orderPromisedDeliveryDate;

    @SerializedName("delivery_type")
    private String deliveryType;

    @SerializedName("pickup_location")
    private String pickupLocation;

    @SerializedName("pickup_note")
    private String pickupNote;

    @SerializedName("courier_tracking_link")
    private String courierTrackingLink;

    @SerializedName("first_attempted_at")
    private String firstAttemptedAt;

    @SerializedName("courier_redirect_link")
    private String courierRedirectLink;

    @SerializedName("tracking_account_number")
    private String trackingAccountNumber;

    @SerializedName("tracking_key")
    private String trackingKey;

    @SerializedName("tracking_ship_date")
    private String trackingShipDate;

    @SerializedName("on_time_status")
    private String onTimeStatus;

    @SerializedName("on_time_difference")
    private Float onTimeDifference;

    @SerializedName("order_tags")
    private java.util.List<String> orderTags;

    @SerializedName("aftership_estimated_delivery_date")
    private AftershipEstimatedDeliveryDateCreateTrackingResponse aftershipEstimatedDeliveryDate;

    @SerializedName("custom_estimated_delivery_date")
    private CustomEstimatedDeliveryDateCreateTrackingResponse customEstimatedDeliveryDate;

    @SerializedName("order_number")
    private String orderNumber;

    @SerializedName("first_estimated_delivery")
    private FirstEstimatedDeliveryCreateTrackingResponse firstEstimatedDelivery;

    @SerializedName("latest_estimated_delivery")
    private LatestEstimatedDeliveryCreateTrackingResponse latestEstimatedDelivery;

    @SerializedName("shipment_tags")
    private java.util.List<String> shipmentTags;

    @SerializedName("courier_connection_id")
    private String courierConnectionId;

    @SerializedName("next_couriers")
    private java.util.List<NextCouriersCreateTrackingResponse> nextCouriers;

    @SerializedName("tracking_origin_country")
    private String trackingOriginCountry;

    @SerializedName("tracking_destination_country")
    private String trackingDestinationCountry;

    @SerializedName("tracking_postal_code")
    private String trackingPostalCode;

    @SerializedName("tracking_state")
    private String trackingState;

    @SerializedName("carbon_emissions")
    private CarbonEmissionsCreateTrackingResponse carbonEmissions;

    @SerializedName("location_id")
    private String locationId;

    @SerializedName("shipping_method")
    private String shippingMethod;

    @SerializedName("failed_delivery_attempts")
    private Integer failedDeliveryAttempts;

    @SerializedName("signature_requirement")
    private String signatureRequirement;

    @SerializedName("delivery_location_type")
    private String deliveryLocationType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegacyId() {
        return legacyId;
    }

    public void setLegacyId(String legacyId) {
        this.legacyId = legacyId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public java.util.Map<String, String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(java.util.Map<String, String> customFields) {
        this.customFields = customFields;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(Integer transitTime) {
        this.transitTime = transitTime;
    }

    public String getOriginCountryIso3() {
        return originCountryIso3;
    }

    public void setOriginCountryIso3(String originCountryIso3) {
        this.originCountryIso3 = originCountryIso3;
    }

    public String getOriginState() {
        return originState;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getOriginPostalCode() {
        return originPostalCode;
    }

    public void setOriginPostalCode(String originPostalCode) {
        this.originPostalCode = originPostalCode;
    }

    public String getOriginRawLocation() {
        return originRawLocation;
    }

    public void setOriginRawLocation(String originRawLocation) {
        this.originRawLocation = originRawLocation;
    }

    public String getDestinationCountryIso3() {
        return destinationCountryIso3;
    }

    public void setDestinationCountryIso3(String destinationCountryIso3) {
        this.destinationCountryIso3 = destinationCountryIso3;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    public void setDestinationPostalCode(String destinationPostalCode) {
        this.destinationPostalCode = destinationPostalCode;
    }

    public String getDestinationRawLocation() {
        return destinationRawLocation;
    }

    public void setDestinationRawLocation(String destinationRawLocation) {
        this.destinationRawLocation = destinationRawLocation;
    }

    public String getCourierDestinationCountryIso3() {
        return courierDestinationCountryIso3;
    }

    public void setCourierDestinationCountryIso3(String courierDestinationCountryIso3) {
        this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
    }

    public java.util.List<String> getEmails() {
        return emails;
    }

    public void setEmails(java.util.List<String> emails) {
        this.emails = emails;
    }

    public String getExpectedDelivery() {
        return expectedDelivery;
    }

    public void setExpectedDelivery(String expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderIdPath() {
        return orderIdPath;
    }

    public void setOrderIdPath(String orderIdPath) {
        this.orderIdPath = orderIdPath;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Float getShipmentPackageCount() {
        return shipmentPackageCount;
    }

    public void setShipmentPackageCount(Float shipmentPackageCount) {
        this.shipmentPackageCount = shipmentPackageCount;
    }

    public String getShipmentPickupDate() {
        return shipmentPickupDate;
    }

    public void setShipmentPickupDate(String shipmentPickupDate) {
        this.shipmentPickupDate = shipmentPickupDate;
    }

    public String getShipmentDeliveryDate() {
        return shipmentDeliveryDate;
    }

    public void setShipmentDeliveryDate(String shipmentDeliveryDate) {
        this.shipmentDeliveryDate = shipmentDeliveryDate;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public ShipmentWeightCreateTrackingResponse getShipmentWeight() {
        return shipmentWeight;
    }

    public void setShipmentWeight(ShipmentWeightCreateTrackingResponse shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }

    public String getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }

    public java.util.List<String> getSmses() {
        return smses;
    }

    public void setSmses(java.util.List<String> smses) {
        this.smses = smses;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public TagV1 getTag() {
        return tag;
    }

    public void setTag(TagV1 tag) {
        this.tag = tag;
    }

    public String getSubtag() {
        return subtag;
    }

    public void setSubtag(String subtag) {
        this.subtag = subtag;
    }

    public String getSubtagMessage() {
        return subtagMessage;
    }

    public void setSubtagMessage(String subtagMessage) {
        this.subtagMessage = subtagMessage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getTrackedCount() {
        return trackedCount;
    }

    public void setTrackedCount(Float trackedCount) {
        this.trackedCount = trackedCount;
    }

    public Boolean getLastMileTrackingSupported() {
        return lastMileTrackingSupported;
    }

    public void setLastMileTrackingSupported(Boolean lastMileTrackingSupported) {
        this.lastMileTrackingSupported = lastMileTrackingSupported;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUniqueToken() {
        return uniqueToken;
    }

    public void setUniqueToken(String uniqueToken) {
        this.uniqueToken = uniqueToken;
    }

    public java.util.List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(java.util.List<Checkpoint> checkpoints) {
        this.checkpoints = checkpoints;
    }

    public java.util.List<String> getSubscribedSmses() {
        return subscribedSmses;
    }

    public void setSubscribedSmses(java.util.List<String> subscribedSmses) {
        this.subscribedSmses = subscribedSmses;
    }

    public java.util.List<String> getSubscribedEmails() {
        return subscribedEmails;
    }

    public void setSubscribedEmails(java.util.List<String> subscribedEmails) {
        this.subscribedEmails = subscribedEmails;
    }

    public Boolean getReturnToSender() {
        return returnToSender;
    }

    public void setReturnToSender(Boolean returnToSender) {
        this.returnToSender = returnToSender;
    }

    public String getOrderPromisedDeliveryDate() {
        return orderPromisedDeliveryDate;
    }

    public void setOrderPromisedDeliveryDate(String orderPromisedDeliveryDate) {
        this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getPickupNote() {
        return pickupNote;
    }

    public void setPickupNote(String pickupNote) {
        this.pickupNote = pickupNote;
    }

    public String getCourierTrackingLink() {
        return courierTrackingLink;
    }

    public void setCourierTrackingLink(String courierTrackingLink) {
        this.courierTrackingLink = courierTrackingLink;
    }

    public String getFirstAttemptedAt() {
        return firstAttemptedAt;
    }

    public void setFirstAttemptedAt(String firstAttemptedAt) {
        this.firstAttemptedAt = firstAttemptedAt;
    }

    public String getCourierRedirectLink() {
        return courierRedirectLink;
    }

    public void setCourierRedirectLink(String courierRedirectLink) {
        this.courierRedirectLink = courierRedirectLink;
    }

    public String getTrackingAccountNumber() {
        return trackingAccountNumber;
    }

    public void setTrackingAccountNumber(String trackingAccountNumber) {
        this.trackingAccountNumber = trackingAccountNumber;
    }

    public String getTrackingKey() {
        return trackingKey;
    }

    public void setTrackingKey(String trackingKey) {
        this.trackingKey = trackingKey;
    }

    public String getTrackingShipDate() {
        return trackingShipDate;
    }

    public void setTrackingShipDate(String trackingShipDate) {
        this.trackingShipDate = trackingShipDate;
    }

    public String getOnTimeStatus() {
        return onTimeStatus;
    }

    public void setOnTimeStatus(String onTimeStatus) {
        this.onTimeStatus = onTimeStatus;
    }

    public Float getOnTimeDifference() {
        return onTimeDifference;
    }

    public void setOnTimeDifference(Float onTimeDifference) {
        this.onTimeDifference = onTimeDifference;
    }

    public java.util.List<String> getOrderTags() {
        return orderTags;
    }

    public void setOrderTags(java.util.List<String> orderTags) {
        this.orderTags = orderTags;
    }

    public AftershipEstimatedDeliveryDateCreateTrackingResponse getAftershipEstimatedDeliveryDate() {
        return aftershipEstimatedDeliveryDate;
    }

    public void setAftershipEstimatedDeliveryDate(AftershipEstimatedDeliveryDateCreateTrackingResponse aftershipEstimatedDeliveryDate) {
        this.aftershipEstimatedDeliveryDate = aftershipEstimatedDeliveryDate;
    }

    public CustomEstimatedDeliveryDateCreateTrackingResponse getCustomEstimatedDeliveryDate() {
        return customEstimatedDeliveryDate;
    }

    public void setCustomEstimatedDeliveryDate(CustomEstimatedDeliveryDateCreateTrackingResponse customEstimatedDeliveryDate) {
        this.customEstimatedDeliveryDate = customEstimatedDeliveryDate;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public FirstEstimatedDeliveryCreateTrackingResponse getFirstEstimatedDelivery() {
        return firstEstimatedDelivery;
    }

    public void setFirstEstimatedDelivery(FirstEstimatedDeliveryCreateTrackingResponse firstEstimatedDelivery) {
        this.firstEstimatedDelivery = firstEstimatedDelivery;
    }

    public LatestEstimatedDeliveryCreateTrackingResponse getLatestEstimatedDelivery() {
        return latestEstimatedDelivery;
    }

    public void setLatestEstimatedDelivery(LatestEstimatedDeliveryCreateTrackingResponse latestEstimatedDelivery) {
        this.latestEstimatedDelivery = latestEstimatedDelivery;
    }

    public java.util.List<String> getShipmentTags() {
        return shipmentTags;
    }

    public void setShipmentTags(java.util.List<String> shipmentTags) {
        this.shipmentTags = shipmentTags;
    }

    public String getCourierConnectionId() {
        return courierConnectionId;
    }

    public void setCourierConnectionId(String courierConnectionId) {
        this.courierConnectionId = courierConnectionId;
    }

    public java.util.List<NextCouriersCreateTrackingResponse> getNextCouriers() {
        return nextCouriers;
    }

    public void setNextCouriers(java.util.List<NextCouriersCreateTrackingResponse> nextCouriers) {
        this.nextCouriers = nextCouriers;
    }

    public String getTrackingOriginCountry() {
        return trackingOriginCountry;
    }

    public void setTrackingOriginCountry(String trackingOriginCountry) {
        this.trackingOriginCountry = trackingOriginCountry;
    }

    public String getTrackingDestinationCountry() {
        return trackingDestinationCountry;
    }

    public void setTrackingDestinationCountry(String trackingDestinationCountry) {
        this.trackingDestinationCountry = trackingDestinationCountry;
    }

    public String getTrackingPostalCode() {
        return trackingPostalCode;
    }

    public void setTrackingPostalCode(String trackingPostalCode) {
        this.trackingPostalCode = trackingPostalCode;
    }

    public String getTrackingState() {
        return trackingState;
    }

    public void setTrackingState(String trackingState) {
        this.trackingState = trackingState;
    }

    public CarbonEmissionsCreateTrackingResponse getCarbonEmissions() {
        return carbonEmissions;
    }

    public void setCarbonEmissions(CarbonEmissionsCreateTrackingResponse carbonEmissions) {
        this.carbonEmissions = carbonEmissions;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Integer getFailedDeliveryAttempts() {
        return failedDeliveryAttempts;
    }

    public void setFailedDeliveryAttempts(Integer failedDeliveryAttempts) {
        this.failedDeliveryAttempts = failedDeliveryAttempts;
    }

    public String getSignatureRequirement() {
        return signatureRequirement;
    }

    public void setSignatureRequirement(String signatureRequirement) {
        this.signatureRequirement = signatureRequirement;
    }

    public String getDeliveryLocationType() {
        return deliveryLocationType;
    }

    public void setDeliveryLocationType(String deliveryLocationType) {
        this.deliveryLocationType = deliveryLocationType;
    }

}
