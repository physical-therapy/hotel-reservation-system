package org.physicaltherapy.hotelservice.domain;

public record Hotel(String name, String address, String city, String state, String zip, String country, String phone,
                    String email, String webSite, String contact, String contactPhone, String contactEmail,
                    String notes, String status, String createdBy, String createdDate, String modifiedBy,
                    String modifiedDate, String id) {
}
