package org.physicaltherapy.hotelservice.domain;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 장소의 영업 시간이나 장소 내부의 특정 서비스에 대한 정보를 제공하는 구조화된 값이다.
 *
 * @param opens        특정 요일의 장소 또는 서비스 영업 시간
 * @param closes       특정 요일의 장소 또는 서비스가 종료되는 시간
 * @param dayOfWeek    해당 영업시간이 유효한 요일
 * @param validFrom    항목이 유효해지는 날짜
 * @param validThrough 항목이 유효하지 않은 날짜 이후<p>
 *                     Ex) 제안 종료, 급여 기간 또는 영업 시간 기간
 * @see <a href="https://schema.org/OpeningHoursSpecification">OpeningHoursSpecification</a>
 */
public record OpeningHoursSpecification(LocalTime opens, LocalTime closes, String dayOfWeek, LocalDateTime validFrom,
                                        LocalDateTime validThrough) {

}
