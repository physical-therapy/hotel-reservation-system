package org.physicaltherapy.hotelservice.domain.business;

import org.physicaltherapy.hotelservice.domain.rating.Rating;

import java.time.LocalTime;
import java.util.Collection;

/**
 * 숙박업
 * @see <a href="https://schema.org/LodgingBusiness">LodgingBusiness</a>
 */
public interface LodgingBusiness extends LocalBusiness {

    /**
     * 숙소의 편의시설 특징(예: 특성 또는 서비스)이다.<p>
     * 이 일반 숙박 시설은 해당 기능이 주요 숙박 시설 제안에 포함되어 있는지 또는 추가 비용으로 제공되는지 여부에 대해 명시하지 않는다.
     */
    LocationFeatureSpecification getAmenityFeature();

    /**
     * 누군가가 품목, 서비스 또는 장소에서 사용할 수 있는 언어이다.
     */
    Collection<String> getAvailableLanguage();

    /**
     * 숙박업소의 체크인 시간
     */
    LocalTime getCheckInTime();

    /**
     * 숙박업소의 체크아웃 시간
     */
    LocalTime getCheckOutTime();

    /**
     * 숙박업소의 객실 수
     */
    Integer getNumberOfRooms();

    /**
     * 숙박시설 또는 숙박업소에 반려동물의 출입이 허용되는지 여부
     */
    boolean isPetsAllowed();

    /**
     * 숙박업이나 요식업에 대한 공식 등급(예: 국가 협회 또는 표준 기관).<p>
     * 작성자 속성을 사용하여 평가 조직(예: HOTREC, DEHOGA, WHR 또는 Hotelstars)과 같은 이름을 가진 조직을 나타낸다.
     */
    Rating getStarRating();

}
