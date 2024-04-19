package org.physicaltherapy.paymentservice.domain.action;

/**
 * 에이전트는 참가자에게 가격을 지불한다.
 *
 * @see <a href="https://schema.org/PayAction">PayAction</a>
 */
public final class PayAction extends TradeAction {

    /**
     * 참가자의 하위 속성이다. 작업을 수신하는 참가자이다.
     */
    private String recipientId;
    
}
