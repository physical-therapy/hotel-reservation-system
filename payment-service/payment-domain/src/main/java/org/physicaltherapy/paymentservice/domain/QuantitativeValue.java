package org.physicaltherapy.paymentservice.domain;

/**
 * 제품 특성 및 기타 목적을 위한 포인트 값 또는 간격
 *
 * @param max      어떤 특성이나 속성의 상한값
 * @param min      어떤 특성이나 속성의 하한값
 * @param unitCode UN/CEFACT 공통 코드(3자) 또는 URL을 사용하여 제공되는 측정 단위
 * @param unitText 측정 단위를 나타내는 문자열
 * @param value    속성 값
 * @see <a href="https://schema.org/QuantitativeValue">QuantitativeValue</a>
 */
public record QuantitativeValue(
        Integer max,
        Integer min,
        String unitCode,
        String unitText,
        String value
) {
}
