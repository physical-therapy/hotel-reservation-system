package org.physicaltherapy.paymentservice.domain.financial;

import org.physicaltherapy.paymentservice.domain.AggregateRating;
import org.physicaltherapy.paymentservice.domain.order.Offer;

/**
 * 조직에서 제공하는 서비스(예: 배달 서비스, 인쇄 서비스 등)
 *
 *
 * @see <a href="https://schema.org/Service">Service</a>
 */
public interface Service {

    /**
     *
     * @return AggregateRating 리뷰 또는 평점 모음을 기반으로 하는 항목의 전체 평점
     */
    AggregateRating getAggregateRating();

    String getAreaServed();

    ServiceChannel getAvailableChannel();

    String getAward();

    String getBrand();

    String getBroker();

    String getCategory();

    String getLogo();

    Offer getOffers();

    String getServiceOutput();

    String getServiceType();

    String getSlogan();

    String getTermsOfService();

}
