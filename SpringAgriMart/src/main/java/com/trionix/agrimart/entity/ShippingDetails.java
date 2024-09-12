package com.trionix.agrimart.entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ShippingDetail")

public class ShippingDetails {
//    private String shippingId;
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String province;
    private String zip;
    private String phone;

    public ShippingDetails(){
    }

    public ShippingDetails(String shippingId, String fName, String lName, String address, String city, String province, String zip, String phone){
//        this.shippingId = shippingId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip = zip;
        this.phone = phone;
    }

//    public String getSID(){ return shippingId; }
//    public void setSID(String shippingId){ this.shippingId = shippingId; }

    public String getFName(){ return fName; }
    public void setFName(String fName){ this.fName = fName; }

    public String getLName(){ return lName; }
    public void setLName(String lName){ this.lName = lName; }

    public String getAddress(){ return address; }
    public void setAddress(String address){ this.address = address; }

    public String getCity(){ return city; }
    public void setCity(String city){ this.city = city; }

    public String getProvince(){ return province; }
    public void setProvince(String province){ this.province = province; }

    public String getZip(){ return zip; }
    public void setZip(String zip){ this.zip = zip; }

    public String getPhone(){ return phone; }
    public void setPhone(String phone){ this.phone = phone; }
}
