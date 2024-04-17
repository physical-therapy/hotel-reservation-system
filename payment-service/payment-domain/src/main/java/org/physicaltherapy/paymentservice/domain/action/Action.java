package org.physicaltherapy.paymentservice.domain.action;


import java.time.LocalDateTime;

/**
 * 직접 객체에 대해 직접 대리인과 간접 참가자가 수행하는 작업이다.<p>
 * 선택적으로 무생물의 도움을 받아 특정 위치에서 발생한다.<p>
 * 작업을 실행하면 결과가 나올 수 있다.<p>
 * 특정 작업 하위 유형 문서는 각 인수/역할의 정확한 기대치를 지정한다.
 *
 * @see <a href="https://schema.org/Action">Action</a>
 */
public sealed class Action permits TradeAction {

    /**
     * 작업의 현재 처리를 나타낸다.
     */
    private String actionStatus;

    /**
     * 행동의 직접적인 수행자 또는 주도자(생물 또는 무생물).
     */
    private String agentId;

    /**
     * 시작 시간
     */
    private LocalDateTime startTime;

    /**
     * 종료 시간. 예약된 이벤트 또는 서비스의 경우 종료될 것으로 예상되는 시간이다.
     */
    private LocalDateTime endTime;

    /**
     * 실패한 작업의 경우 실패 원인에 대한 추가 정보
     */
    private String error;

    /**
     * 에이전트가 작업을 수행하는 데 도움이 된 개체이다.
     */
    private String instrument;

    /**
     * 이벤트가 발생하는 위치
     */
    private String location;

    /**
     * 작업이 수행되는 개체로, 상태가 그대로 유지되거나 변경된다.<p>
     * 의미론적 역할 환자, 영향을 받은 사람, 환자(상태를 변경함) 또는 테마(상태를 변경하지 않음)라고도 한다.
     */
    private String object;

    /**
     * 해당 조치에 간접적으로 참여한 다른 공동 대리인
     */
    private String participantId;

    /**
     * 서비스 제공자, 서비스 운영자 또는 서비스 수행자 상품 생산자.<p>
     * 다른 당사자(판매자)는 공급자를 대신하여 해당 서비스나 상품을 제공할 수 있다. 공급자가 판매자 역할을 할 수도 있다.
     */
    private String providerId;

    /**
     * 작업에서 생성된 결과
     */
    private String result;

    /**
     * 작업에 대한 대상 EntryPoint 또는 URL
     */
    private String target;

}
