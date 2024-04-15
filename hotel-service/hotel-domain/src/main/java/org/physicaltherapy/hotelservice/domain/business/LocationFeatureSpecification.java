package org.physicaltherapy.hotelservice.domain.business;

import org.physicaltherapy.hotelservice.domain.OpeningHoursSpecification;

import java.time.LocalDateTime;

/**
 * 장소의 특정 기능을 설명하는 구조화된 값이다.
 *
 * @param hoursAvailable 해당 기능이 사용 가능한 시간<p>
 *                       Ex) 레스토랑 또는 미용실의 영업 시간<p>
 *                       이 속성은 일반적으로 OpeningHoursSpecification 유형을 사용하여 제공된다.
 *                       그러나 이 속성은 단일 값이어야 하며, 여러 시간 범위를 지정하는 데 사용할 수 없다.
 * @param name           특정 기능의 이름<p>
 *                       Ex) 무료 Wi-Fi, 무료 주차, 수영장, 피트니스 센터 등
 * @param validFrom    항목이 유효해지는 날짜
 * @param validThrough 항목이 유효하지 않은 날짜 이후<p>
 *                     Ex) 제안 종료, 급여 기간 또는 영업 시간 기간
 * @see <a href="https://schema.org/LocationFeatureSpecification">LocationFeatureSpecification</a>
 */
public record LocationFeatureSpecification(OpeningHoursSpecification hoursAvailable, String name, LocalDateTime validFrom,
                                           LocalDateTime validThrough) {
}
