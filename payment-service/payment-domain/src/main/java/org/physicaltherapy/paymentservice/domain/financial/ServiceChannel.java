package org.physicaltherapy.paymentservice.domain.financial;

import java.time.Duration;

/**
 * 서비스에 접근하기 위한 수단(예: 관공서 위치, 웹사이트, 전화번호).
 *
 * @param availableLanguage    누군가가 품목, 서비스 또는 장소에서 사용할 수 있는 언어이다.
 * @param processingTime       이 채널을 사용하는 서비스의 예상 처리 시간
 * @param providesServiceId    이 채널에서 제공하는 서비스의 ID
 * @param serviceLocationId    개인이 서비스에 액세스할 수 있는 위치
 * @param servicePhone         서비스에 접속하기 위해 사용하는 전화번호
 * @param servicePostalAddress 메일로 서비스에 접속하기 위한 주소
 * @param serviceUrl           서비스에 접속하기 위한 웹사이트
 * @see <a href="https://schema.org/ServiceChannelhttps://schema.org/ServiceChannel">ServiceChannel</a>
 */
public record ServiceChannel(
        String availableLanguage,
        Duration processingTime,
        String providesServiceId,
        String serviceLocationId,
        String servicePhone,
        String servicePostalAddress,
        String serviceUrl
) {
}
