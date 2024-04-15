package org.physicaltherapy.hotelservice.domain.room;

import org.physicaltherapy.hotelservice.domain.Place;
import org.physicaltherapy.hotelservice.domain.business.LocationFeatureSpecification;

/**
 * 숙박시설은 사람이 머물 수 있는 장소로서 호텔방, 캠핑장, 회의실 등을 포함한다.
 * @see <a href="https://schema.org/Accommodation">Accommodation</a>
 */
public interface Accommodation extends Place {

    /**
     * 숙소의 편의시설 특징(예: 특성 또는 서비스)이다.<p>
     * 이 일반 숙박 시설은 해당 기능이 주요 숙박 시설 제안에 포함되어 있는지 또는 추가 비용으로 제공되는지 여부에 대해 명시하지 않는다.
     */
    LocationFeatureSpecification getAmenityFeature();

    /**
     * 다층 건물에 있는 숙박 시설의 층계.
     * 계산 시스템은 <a href="https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations">국제적으로 다양하므로</a> 가능한 경우 현지 시스템을 사용해야 한다.
     */
    String getFloorLevel();

    /**
     * 숙박 시설의 크기(예: 평방 미터 또는 평방 피트).
     */
    String getFloorSize();

    /**
     * 숙소의 욕실 수.
     */
    Integer getNumberOfBathroomsTotal();

    /**
     * 숙소의 침실 수.
     */
    Integer getNumberOfBedrooms();

    /**
     * 숙소의 침실 수
     */
    Integer getNumberOfRooms();

    /**
     * 숙소의 최대 수용 인원 수.
     */
    Integer getOccupancy();

    /**
     * 숙박시설 또는 숙박업소에 반려동물의 출입이 허용되는지 여부
     */
    boolean isPetsAllowed();

    /**
     * 숙박 시설의 건축 연도.
     */
    Integer getYearBuilt();
}
