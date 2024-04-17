package org.physicaltherapy.paymentservice.domain.business;


import org.physicaltherapy.paymentservice.domain.AggregateRating;

/**
 * 다소 고정된 물리적 확장을 갖는 개체이다.
 * @see <a href="https://schema.org/Place">Place</a>
 */
public interface Place {

    /**
     * 실제 주소
     */
    String getAddress();

    /**
     * 리뷰 또는 평점 모음을 기반으로하는 항목의 전체 평점
     */
    AggregateRating getAggregateRating();

    /**
     * 관련 로고
     */
    String getLogo();

    /**
     * 위치의 위도
     */
    String getLatitude();

    /**
     * 위치의 경도
     */
    String getLongitude();

    /**
     * 최대 수용 인원
     */
    String getMaximumAttendeeCapacity();

    /**
     * 특정 장소의 영업 시간
     */
    OpeningHoursSpecification getOpeningHoursSpecification();

    /**
     * 장소의 사진
     */
    String getPhoto();

    /**
     * 아이템과 관련된 슬로건이나 모티브
     */
    String getSlogan();

    /**
     * 흡연 허용 여부
     */
    boolean isSmokingAllowed();

}
