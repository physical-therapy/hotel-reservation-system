package org.physicaltherapy.paymentservice.domain.order;


import java.time.LocalDateTime;

/**
 * 주문은 거래 확인(영수증)으로, 여기에는 고객이 수락한 제안으로 표시되는 여러 품목이 포함될 수 있다.
 *
 * @param id                 고유한 식별자
 * @param offerId            제안(예: 제품, 수량 및 가격 조합)이 주문에 포함된다.
 * @param postalAddressId    주문에 대한 청구서 수신 주소
 * @param brokerId           구매자와 판매자 간의 교환을 주선하는 실체이다.<p>
 *                           대부분의 경우 브로커는 교환과 관련된 제품이나 서비스의 소유권을 획득하거나 해제하지 않는다.<p>
 *                           실체가 브로커, 판매자 또는 구매자인지 확실하지 않은 경우 후자의 두 용어가 선호된다.
 * @param confirmationNumber 지정된 주문이나 결제가 접수되었음을 확인하는 번호
 * @param customerId         주문을 하거나 송장을 지불하는 당사자
 * @param discount           적용된 할인의 액수
 * @param discountCurrency   할인하는데 사용되는 통화 코드
 * @param isGift             제안이 구매자가 아닌 다른 사람을 위한 선물로 수락되었는지 여부를 나타낸다.
 * @param orderDate          주문한 날짜
 * @param orderNumber        거래의 식별자
 * @param orderStatus        주문 상태
 * @param orderedItemId      주문한 상품
 * @param partOfInvoiceId    해당 주문은 참조 송장에 포함되어 결제된다.
 * @param paymentDueDate     지불 기한 날짜
 * @param paymentMethodId    사용된 결제 방법에 대한 식별자(예: 신용카드 마지막 4자리 숫자)
 * @param paymentUrl         결제를 보내기 위한 URL
 * @param sellerId           서비스/상품을 제공(판매/임대/대여/대출)하는 법인이다. 판매자는 공급자일 수도 있다.
 * @see <a href="https://schema.org/Order">Order</a>
 */
public record Order(
        String id,
        String offerId,
        String postalAddressId,
        String brokerId,
        String confirmationNumber,
        String customerId,
        String discount,
        String discountCurrency,
        boolean isGift,
        LocalDateTime orderDate,
        String orderNumber,
        String orderStatus,
        String orderedItemId,
        String partOfInvoiceId,
        LocalDateTime paymentDueDate,
        String paymentMethodId,
        String paymentUrl,
        String sellerId
) {
}
