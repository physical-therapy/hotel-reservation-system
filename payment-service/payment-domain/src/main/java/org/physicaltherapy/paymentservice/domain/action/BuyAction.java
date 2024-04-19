package org.physicaltherapy.paymentservice.domain.action;

/**
 * 제공된 상품이나 서비스에 대한 대가로 판매자에게 금전을 제공하는 행위. 에이전트는 판매자로부터 물건, 제품 또는 서비스를 가격으로 구매한다.
 *
 * @see <a href="https://schema.org/BuyAction">BuyAction</a>
 */
public final class BuyAction extends TradeAction {

    /**
     * 서비스/상품을 제공(판매/임대/대여/대출)하는 법인입니다. 판매자는 공급자일 수도 있습니다.
     */
    private String sellerId;

}
