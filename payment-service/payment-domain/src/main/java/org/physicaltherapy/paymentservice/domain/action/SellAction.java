package org.physicaltherapy.paymentservice.domain.action;

/**
 * 제공된 상품이나 서비스에 대한 대가로 구매자로부터 돈을 받는 행위이다. 에이전트는 구매자에게 가격을 받고 물건, 제품 또는 서비스를 판매한다.
 *
 * @see <a href="https://schema.org/SellAction">SellAction</a>
 */
public final class SellAction extends TradeAction {

    private String buyerId;

}
