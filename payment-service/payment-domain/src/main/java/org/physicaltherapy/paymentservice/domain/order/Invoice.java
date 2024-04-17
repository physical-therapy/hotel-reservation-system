package org.physicaltherapy.paymentservice.domain.order;

import org.physicaltherapy.paymentservice.domain.PriceSpecification;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 상품 또는 서비스 대금 명세서 청구서
 *
 * @param accountId            결제가 적용될 계좌의 식별자
 * @param billingPeriod        송장을 계산하는 데 사용되는 시간 간격
 * @param brokerId             구매자와 판매자 간의 교환을 주선하는 실체.<p>
 *                             대부분의 경우 브로커는 교환과 관련된 제품이나 서비스의 소유권을 획득하거나 해제하지 않는다.
 * @param categoryId           항목의 카테고리.
 * @param confirmationNumber   지정된 주문이나 결제가 접수되었음을 확인하는 번호
 * @param customerId           주문을 하거나 송장을 지불하는 당사자
 * @param minimumPaymentDue    현재 필요한 최소 결제 금액
 * @param paymentDueDate       지불 기한 날짜
 * @param paymentMethod        주문에 대한 신용카드 이름 또는 기타 결제 방법
 * @param paymentMethodId      사용된 결제 방법에 대한 식별자(예: 신용카드 마지막 4자리 숫자)
 * @param providerId           서비스 제공자, 서비스 운영자 또는 서비스 수행자 상품 생산자.<p>
 *                             다른 당사자(판매자)는 공급자를 대신하여 해당 서비스나 상품을 제공할 수 있다.<p>
 *                             공급자가 판매자 역할을 할 수도 있다.
 * @param referenceOrderId     이 송장과 관련된 주문. 하나 이상의 주문을 하나의 송장으로 통합할 수 있다.
 * @param scheduledPaymentDate 송장 지급이 예정된 날짜
 * @param totalPaymentDue      총 결제 금액
 * @see <a href="https://schema.org/Invoice">Invoice</a>
 */
public record Invoice(
        String accountId,
        Duration billingPeriod,
        String brokerId,
        String categoryId,
        String confirmationNumber,
        String customerId,
        PriceSpecification minimumPaymentDue,
        LocalDateTime paymentDueDate,
        String paymentMethod,
        String paymentMethodId,
        String providerId,
        String referenceOrderId,
        LocalDateTime scheduledPaymentDate,
        PriceSpecification totalPaymentDue
) {
}
