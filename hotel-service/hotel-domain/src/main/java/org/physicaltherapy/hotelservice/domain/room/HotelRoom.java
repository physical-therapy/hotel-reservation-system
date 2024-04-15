package org.physicaltherapy.hotelservice.domain.room;

import org.physicaltherapy.hotelservice.domain.OpeningHoursSpecification;
import org.physicaltherapy.hotelservice.domain.business.LocationFeatureSpecification;
import org.physicaltherapy.hotelservice.domain.rating.AggregateRating;

public record HotelRoom(
        String id,
        String hotelId,
        String roomNumber,
        String name,
        BedDetails bedDetails,
        LocationFeatureSpecification amenityFeature,
        String floorLevel,
        String floorSize,
        Integer numberOfBathroomsTotal,
        Integer numberOfBedrooms,
        Integer numberOfRooms,
        Integer occupancy,
        boolean isPetsAllowed,
        Integer yearBuilt,
        String address,
        AggregateRating aggregateRating,
        String logo,
        String latitude,
        String longitude,
        String maximumAttendeeCapacity,
        OpeningHoursSpecification openingHoursSpecification,
        String photo,
        String slogan,
        boolean isSmokingAllowed
) implements Accommodation {

    @Override
    public LocationFeatureSpecification getAmenityFeature() {
        return amenityFeature;
    }

    @Override
    public String getFloorLevel() {
        return floorLevel;
    }

    @Override
    public String getFloorSize() {
        return floorSize;
    }

    @Override
    public Integer getNumberOfBathroomsTotal() {
        return numberOfBathroomsTotal;
    }

    @Override
    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    @Override
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public Integer getOccupancy() {
        return occupancy;
    }

    @Override
    public boolean isPetsAllowed() {
        return isPetsAllowed;
    }

    @Override
    public Integer getYearBuilt() {
        return yearBuilt;
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
        return isSmokingAllowed;
    }

    public record BedDetails(
            Integer numberOfBeds,
            String typeOfBed
    ) {
    }
}
