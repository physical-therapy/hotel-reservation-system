package org.physicaltherapy.hotelservice.domain;

import org.physicaltherapy.hotelservice.domain.rating.AggregateRating;

/**
 * 단체
 *
 * @see <a href="https://schema.org/Organization">Organization</a>
 */
public interface Organization {

    /**
     * 주소
     */
    String getAddress();

    /**
     * 평균 평점
     */
    AggregateRating getAggregateRating();

    /**
     * 수상 내역
     */
    String getAward();

    /**
     * 브랜드
     */
    String getBrand();

    /**
     * 이메일
     */
    String getEmail();

    /**
     * 경영자
     */
    String getEmployee();

}
