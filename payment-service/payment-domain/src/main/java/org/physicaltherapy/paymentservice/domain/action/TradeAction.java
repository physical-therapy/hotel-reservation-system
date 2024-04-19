package org.physicaltherapy.paymentservice.domain.action;

import org.physicaltherapy.paymentservice.domain.PriceSpecification;

/**
 * 금전적 보상을 위해 상품 및 서비스 교환에 참여하는 행위. 에이전트는 일회성 또는 정기적인 지불을 대가로 참가자와 물건, 제품 또는 서비스를 거래한다.
 *
 * @see <a href="https://schema.org/TradeAction">TradeAction</a>
 */
public non-sealed class TradeAction extends Action {

    private String price;
    private String priceCurrency;
    private PriceSpecification priceSpecification;

}
