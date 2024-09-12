package com.agriMart.demo.dto;

public class DeliveryDto {
    private String orderId;
    private String trackingNo;
    private String estimatedTime;
    private String Dstatus;


    public DeliveryDto() {
    }

    public DeliveryDto(String orderId, String trackingNo, String estimatedTime, String dStatus) {
        this.orderId = orderId;
        this.trackingNo = trackingNo;
        this.estimatedTime = estimatedTime;
        this.Dstatus = Dstatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }


    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getDstatus() {
        return Dstatus;
    }

    public void setDstatus(String dStatus) {
        this.Dstatus = Dstatus;
    }
}