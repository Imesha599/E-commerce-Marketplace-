package com.trionix.agrimartorder.dto;
import lombok.Data;

@Data
public class ShippingDetailsDto {

    private String fullname;
    private String address;
    private String city;
    private String province;
    private String zipcode;
    private String phonenumber;


    public ShippingDetailsDto(){
    }

    public ShippingDetailsDto(String shippingId, String fName, String lName, String address, String city, String province, String zip, String phone){
//        this.shippingId = shippingId;
        this.fullname = fullname;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
        this.phonenumber = phonenumber;
    }

//    public String getSID(){ return shippingId; }
//    public void setSID(String shippingId){ this.shippingId = shippingId; }

    public String getFName(){ return fullname; }
    public void setFName(String fullname){ this.fullname = fullname; }

    public String getAddress(){ return address; }
    public void setAddress(String address){ this.address = address; }

    public String getCity(){ return city; }
    public void setCity(String city){ this.city = city; }

    public String getProvince(){ return province; }
    public void setProvince(String province){ this.province = province; }

    public String getZip(){ return zipcode; }
    public void setZip(String zipcode){ this.zipcode = zipcode; }

    public String getPhone(){ return phonenumber; }
    public void setPhone(String phonenumber){ this.phonenumber = phonenumber; }
}