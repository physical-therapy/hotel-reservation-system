package org.physicaltherapy.paymentservice.domain;

import java.time.LocalDateTime;

/**
 * 가격 또는 가격 범위를 나타내는 구조화된 값
 *
 * @param eligibleQuantity          제안 또는 가격 사양이 유효한 주문 수량의 측정 간격 및 단위이다. 이를 통해 특정 운임이 특정 수량에 대해서만 유효하도록 지정할 수 있다.
 * @param eligibleTransactionVolume 제안 또는 가격 사양이 유효한 화폐 단위의 거래량(예: 최소 구매량 표시, 특정 주문량 이상 무료 배송 표시 또는 특정 주문량에 대한 구매에 대한 신용 카드 승인 제한) 최소한의 금액.
 * @param maxPrice                  가격이 범위인 경우 가장 높은 가격
 * @param minPrice                  가격이 범위인 경우 가장 낮은 가격
 * @param price                     PriceSpecification 및 해당 하위 유형에 첨부된 경우 제품 또는 가격 구성 요소의 제안 가격
 * @param priceCurrency             가격의 통화 또는 PriceSpecification 및 해당 하위 유형에 연결된 경우 가격 구성 요소
 * @param validFrom                 항목이 유효해지는 날짜
 * @param validThrough              항목이 유효하지 않는 날짜 이후. (예: 제안 종료, 급여 기간 또는 영업 시간 기간)
 * @param valueAddedTaxIncluded     가격 명세서에 해당 VAT(부가가치세)가 포함되는지 여부를 지정
 * @see <a href="https://schema.org/PriceSpecification">PriceSpecification</a>
 */
public record PriceSpecification(
        QuantitativeValue eligibleQuantity,
        PriceSpecification eligibleTransactionVolume,
        Integer maxPrice,
        Integer minPrice,
        Integer price,
        String priceCurrency,
        LocalDateTime validFrom,
        LocalDateTime validThrough,
        boolean valueAddedTaxIncluded
) {
}
