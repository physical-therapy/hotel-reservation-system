package org.physicaltherapy.paymentservice.domain.business;

import org.physicaltherapy.paymentservice.domain.AggregateRating;

import java.util.Collection;
import java.util.Set;

/**
 * {@inheritDoc}
 */
public final class BankOrCreditUnion implements FinancialService {

    private String feesAndCommissionsSpecification;
    private Set<String> currenciesAccepted;
    private String openingHours;
    private Set<String> paymentAccepted;
    private String priceRange;
    private String award;
    private String brand;
    private String email;
    private String employee;
    private String address;
    private AggregateRating aggregateRating;
    private String logo;
    private String latitude;
    private String longitude;
    private String maximumAttendeeCapacity;
    private OpeningHoursSpecification openingHoursSpecification;
    private String photo;
    private String slogan;

    @Override
    public String feesAndCommissionsSpecification() {
        return feesAndCommissionsSpecification;
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
        return false;
    }
}
