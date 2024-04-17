package org.physicaltherapy.paymentservice.domain.action;

/**
 * 에이전트는 참가자에게 가격을 지불한다.
 *
 * @see <a href="https://schema.org/PayAction">PayAction</a>
 */
public final class PayAction extends TradeAction {

    private String recipientId;

}
