package org.physicaltherapy.paymentservice.domain.business;

/**
 * 금융 서비스 사업.
 *
 * @see <a href="https://pending.schema.org/FinancialService">FinancialService</a>
 */
public sealed interface FinancialService extends LocalBusiness permits BankOrCreditUnion {

    /**
     * 금융 상품 클래스 또는 금융 서비스 조직에 적용되는 수수료, 커미션 및 기타 조건에 대한 설명이다.
     */
    String feesAndCommissionsSpecification();

}
