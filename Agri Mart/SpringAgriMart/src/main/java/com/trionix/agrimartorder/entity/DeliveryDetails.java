package com.trionix.agrimartorder.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("DeliveryDetails")
public class DeliveryDetails {
    @Id
    private String orderId;
    private String customerId;
    private String sellerId;
    private String shippingAddress;
    private String totalAmount;
    private String paymentType;
    private String dateOfOrder;
    private String estimatedDeTime;
    private String deliveryStatus;

    public DeliveryDetails () {
    }

    public DeliveryDetails(String orderId, String customerId,
                           String sellerId, String shippingAddress,
                           String totalAmount, String paymentType,
                           String dateOfOrder, String estimatedDeTime, String deliveryStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.sellerId = sellerId;
        this.shippingAddress = shippingAddress;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
        this.dateOfOrder = dateOfOrder;
        this.estimatedDeTime = estimatedDeTime;
        this.deliveryStatus = deliveryStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(String dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getEstimatedDeTime() {
        return estimatedDeTime;
    }

    public void setEstimatedDeTime(String estimatedDeTime) {
        this.estimatedDeTime = estimatedDeTime;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
