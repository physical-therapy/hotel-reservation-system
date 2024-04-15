package org.physicaltherapy.hotelservice.domain.business;

import org.physicaltherapy.hotelservice.domain.Organization;
import org.physicaltherapy.hotelservice.domain.Place;

import java.util.Collection;

/**
 * 특정 실제 사업체 또는 조직의 지점이다.<p>
 * Ex) 레스토랑, 레스토랑 체인의 특정 지점, 은행 지점, 의료 기관, 클럽, 볼링장
 * @see <a href="https://schema.org/LocalBusiness">LocalBusiness</a>
 */
public interface LocalBusiness extends Place, Organization {

    /**
     * 허용되는 통화<p>
     * 표준 형식 사용: ISO 4217 통화 형식 (예: "USD") 암호화폐에 대한 티커 기호 (예: "BTC") LETS( Local Exchange Trading System ) 및 기타 통화 유형 에 대한 잘 알려진 이름 (예: "Ithaca HOUR").
     */
    Collection<String> getCurrenciesAccepted();

    /**
     * 기업의 일반적인 영업시간이다. 영업 시간은 요일부터 시작하여 하루에 시간을 지정하는 주간 시간 범위로 지정할 수 있다.<p>
     * 여러 날을 쉼표 ','로 구분하여 나열할 수 있다.<p>
     * 날짜 또는 시간 범위는 하이픈 '-'을 사용하여 지정된다.<p>
     */
    String getOpeningHours();

    /**
     * 현금, 신용카드, 암호화폐, 지역거래소거래시스템 등
     */
    Collection<String> getPaymentAccepted();

    /**
     * 비즈니스의 가격대
     */
    String getPriceRange();

}
