package org.physicaltherapy.hotelservice.domain.rating;

/**
 * 별 1~5개와 같은 숫자 척도에 대한 평가이다.
 *
 * @param Author            이 콘텐츠 또는 평가의 작성자
 * @param reviewAspect      평가 중심 요소<p>
 *                          (예: 서비스, 가격, 질, 위치, 청결도, 시설)
 * @param ratingExplanation 평가에 표현된 결론으로 이어지는 배경 맥락과 기타 정보를 제공하는 짧은 설명<p>
 *                          (예: 1~2개의 문장)
 * @param ratingValue       콘텐츠에 대한 평가
 * @param bestRating        최고 점수
 * @param worstRating       최저 점수
 * @see <a href="https://schema.org/Rating">Rating</a>
 */
public record Rating(Object Author, String reviewAspect, String ratingExplanation, Double ratingValue,
                     Double bestRating, Double worstRating) {

}
