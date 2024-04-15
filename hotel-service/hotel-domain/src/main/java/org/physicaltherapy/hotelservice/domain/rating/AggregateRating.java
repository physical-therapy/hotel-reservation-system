package org.physicaltherapy.hotelservice.domain.rating;

/**
 * 여러 평점 또는 리뷰를 기반으로 한 평균 평점이다.
 *
 * @param ratingCount 평가의 총 개수
 * @param reviewCount 리뷰의 총 개수
 * @see <a href="https://schema.org/AggregateRating">AggregateRating</a>
 */
public record AggregateRating(Integer ratingCount, Integer reviewCount) {

}
