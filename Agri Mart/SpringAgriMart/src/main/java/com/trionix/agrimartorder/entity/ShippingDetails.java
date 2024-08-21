package com.trionix.agrimartorder.entity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ShippingDetail")
@Data
public class ShippingDetails {
//    private String shippingId;
    private String fullname;
    private String address;
    private String city;
    private String province;
    private String zipcode;
    private String phonenumber;

    public ShippingDetails(){
    }

    public ShippingDetails(String shippingId, String fName, String lName, String address, String city, String province, String zip, String phone){
//        this.shippingId = shippingId;
        this.fullname = fName;

        this.address = address;
        this.city = city;
        this.province = province;
        this.zipcode = zip;
        this.phonenumber = phone;
    }

//    public String getSID(){ return shippingId; }
//    public void setSID(String shippingId){ this.shippingId = shippingId; }

    public String getFName(){ return fullname; }
    public void setFName(String fName){ this.fullname = fName; }


    public String getAddress(){ return address; }
    public void setAddress(String address){ this.address = address; }

    public String getCity(){ return city; }
    public void setCity(String city){ this.city = city; }

    public String getProvince(){ return province; }
    public void setProvince(String province){ this.province = province; }

    public String getZip(){ return zipcode; }
    public void setZip(String zip){ this.zipcode = zip; }

    public String getPhone(){ return phonenumber; }
    public void setPhone(String phone){ this.phonenumber = phone; }
}
