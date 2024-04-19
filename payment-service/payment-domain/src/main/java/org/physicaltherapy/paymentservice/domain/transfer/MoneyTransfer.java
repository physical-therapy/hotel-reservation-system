package org.physicaltherapy.paymentservice.domain.transfer;

import org.physicaltherapy.paymentservice.domain.action.TransferAction;
import org.physicaltherapy.paymentservice.domain.business.BankOrCreditUnion;

/**
 * 한 곳에서 다른 곳으로 돈을 이체하는 행위. 이는 전자적으로 또는 물리적으로 발생할 수 있다.
 *
 * @see <a href="https://pending.schema.org/MoneyTransfer">MoneyTransfer</a>
 */
public class MoneyTransfer extends TransferAction {

    /**
     * 금액
     */
    private Integer amount;

    /**
     * 수익자의 은행계좌를 운영하거나 수익자를 위해 자금을 풀어주는 은행이나 은행지점, 금융기관 또는 국제금융기관.
     */
    private BankOrCreditUnion beneficiaryBank;

}
