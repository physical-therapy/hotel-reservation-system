package org.physicaltherapy.paymentservice.domain.action;

/**
 * 에이전트는 배송/전송할 물건/제품/서비스를 주문한다.
 *
 * @see <a href="https://schema.org/OrderAction">OrderAction</a>
 */
public final class OrderAction extends TradeAction {

    private String deliveryMethod;

}
