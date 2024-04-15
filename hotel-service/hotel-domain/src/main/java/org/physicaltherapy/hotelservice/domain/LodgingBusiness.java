package org.physicaltherapy.hotelservice.domain;

import java.time.LocalTime;
import java.util.Collection;

/**
 * 숙박업
 */
public interface LodgingBusiness extends LocalBusiness {

    Collection<String> getAvailableLanguage();

    LocalTime getCheckInTime();

    LocalTime getCheckOutTime();

    Integer getNumberOfRooms();

    boolean isPetsAllowed();

}
