package org.physicaltherapy.hotelservice.domain;

import org.physicaltherapy.hotelservice.domain.business.LocationFeatureSpecification;
import org.physicaltherapy.hotelservice.domain.business.LodgingBusiness;
import org.physicaltherapy.hotelservice.domain.rating.AggregateRating;
import org.physicaltherapy.hotelservice.domain.rating.Rating;

import java.time.LocalTime;
import java.util.Collection;
import java.util.Set;

public record Hotel(String id, String name, LocationFeatureSpecification amenityFeature, Set<String> availableLanguage,
                    LocalTime checkInTime, LocalTime checkOutTime, Integer numberOfRooms, boolean petsAllowed,
                    Rating starRating, Set<String> currenciesAccepted, String openingHours, Set<String> paymentAccepted,
                    String priceRange, String award, String brand, String email, String employee, String address,
                    AggregateRating aggregateRating, String logo, String latitude, String longitude,
                    String maximumAttendeeCapacity, OpeningHoursSpecification openingHoursSpecification, String photo,
                    String slogan, boolean smokingAllowed, String city, String state, String zip, String country,
                    String webSite, String notes, String status) implements LodgingBusiness {

    @Override
    public LocationFeatureSpecification getAmenityFeature() {
        return amenityFeature;
    }

    @Override
    public Collection<String> getAvailableLanguage() {
        return availableLanguage;
    }

    @Override
    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    @Override
    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }

    @Override
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    @Override
    public Rating getStarRating() {
        return starRating;
    }

    @Override
    public Collection<String> getCurrenciesAccepted() {
        return currenciesAccepted;
    }

    @Override
    public String getOpeningHours() {
        return openingHours;
    }

    @Override
    public Collection<String> getPaymentAccepted() {
        return paymentAccepted;
    }

    @Override
    public String getPriceRange() {
        return priceRange;
    }

    @Override
    public String getAward() {
        return award;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getEmployee() {
        return employee;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public String getLatitude() {
        return latitude;
    }

    @Override
    public String getLongitude() {
        return longitude;
    }

    @Override
    public String getMaximumAttendeeCapacity() {
        return maximumAttendeeCapacity;
    }

    @Override
    public OpeningHoursSpecification getOpeningHoursSpecification() {
        return openingHoursSpecification;
    }

    @Override
    public String getPhoto() {
        return photo;
    }

    @Override
    public String getSlogan() {
        return slogan;
    }

    @Override
    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }
}

