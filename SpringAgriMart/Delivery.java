package com.agriMart.demo.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Delivery")
public class Delivery {


   @Id
   private String orderId;

   private String trackingNo;
   private String estimatedTime;
   private String Dstatus;

   public Delivery() {
   }

   public Delivery(String orderId, String trackingNo, String estimatedTime, String dStatus) {
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

   public void setDstatus(String Dstatus) {
      this.Dstatus = Dstatus;
   }
}
