package org.physicaltherapy.hotelservice.bootstrap.adapter.axon;

import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
@NoArgsConstructor
public class HotelAggregate {

    @AggregateIdentifier
    private String hotelId;

}
