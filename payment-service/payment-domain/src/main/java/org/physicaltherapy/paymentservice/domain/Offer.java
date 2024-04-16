package org.physicaltherapy.paymentservice.domain;


import java.time.Duration;
import java.time.LocalDateTime;


/**
 * 품목에 대한 일부 권리를 양도하거나 서비스를 제공하겠다는 제안(예: 이벤트 티켓 판매 제안, 영화 DVD 대여 제안, 인터넷을 통한 TV 프로그램 스트리밍 제안, 오토바이 수리 제안)
 *
 * @param acceptedPaymentMethodId   이 제안에 대해 판매자가 수락한 결제 방법
 * @param addOn                     기본 제공과 결합해서만 얻을 수 있는 추가 제공
 * @param advanceBookingRequirement 제안 수락과 리소스 또는 서비스의 실제 사용 사이에 필요한 시간
 * @param aggregateRating           리뷰 또는 평점 모음을 기반으로 하는 항목의 전체 평점
 * @param areaServedId              서비스 또는 제공되는 항목이 제공되는 지리적 영역
 * @param availability              이 품목의 가용성(예: 재고 있음, 품절, 선주문 등)
 * @param availabilityStarts        제안에 포함된 제품 또는 서비스의 가용성이 시작되는 시점
 * @param availabilityEnds          제안에 포함된 제품 또는 서비스의 가용성이 종료
 * @param availableAtOrFrom         제안을 받을 수 있는 장소(예: 매장 위치)
 * @param businessFunction          제안의 비즈니스 기능(예: 판매, 임대, 수리, 폐기)
 * @param category                  항목의 카테고리. 더 큰 기호나 슬래시를 사용하여 범주 계층 구조를 비공식적으로 나타낼 수 있다.
 * @param eligibleCustomerType      해당 제안이 유효한 고객 유형
 * @param eligibleDuration          해당 제안이 유효한 기간
 * @param price                     PriceSpecification 및 해당 하위 유형에 첨부된 경우 제품 또는 가격 구성 요소의 제안 가격
 * @param priceCurrency             가격의 통화 또는 PriceSpecification 및 해당 하위 유형에 연결된 경우 가격 구성 요소
 * @param priceSpecification        단가와 배송 또는 지불 비용을 나타내는 하나 이상의 세부 가격 사양
 * @param priceValidUntil           그 이후에는 가격을 더 이상 사용할 수 없는 날짜
 * @param sellerId                  서비스/상품을 제공(판매/임대/대여/대출)하는 법인이다. 판매자는 공급자일 수도 있다.
 * @param validFrom                 항목이 유효해지는 날짜
 * @param validThrough              항목이 유효하지 않는 날짜 이후. (예: 제안 종료, 급여 기간 또는 영업 시간 기간)
 * @param warrantyPromiseId         제안에 포함된 보증 약속
 * @see <a href="https://schema.org/Offer">Offer</a>
 */
public record Offer(
        String acceptedPaymentMethodId,
        Offer addOn,
        QuantitativeValue advanceBookingRequirement,
        AggregateRating aggregateRating,
        String areaServedId,
        String availability,
        LocalDateTime availabilityStarts,
        LocalDateTime availabilityEnds,
        String availableAtOrFrom,
        String businessFunction,
        String category,
        String eligibleCustomerType,
        Duration eligibleDuration,
        String price,
        String priceCurrency,
        PriceSpecification priceSpecification,
        LocalDateTime priceValidUntil,
        String sellerId,
        LocalDateTime validFrom,
        LocalDateTime validThrough,
        String warrantyPromiseId
) {
}
