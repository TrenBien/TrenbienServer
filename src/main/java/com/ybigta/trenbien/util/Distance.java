package com.ybigta.trenbien.util;

import org.springframework.stereotype.Component;

@Component
public class Distance {
    public static Integer getDistanceFromLatAndLong(Float myLatitude, Float myLongitude, Float trendLatitude, Float trendLongitude){
        if (myLatitude == null || myLongitude == null || trendLatitude == null || trendLongitude == null){
            return null;
        }
        Double dLat = Math.toRadians(myLatitude - trendLatitude);
        Double dLon = Math.toRadians(myLongitude - trendLongitude);

        double a = Math.sin(dLat/2)* Math.sin(dLat/2)+ Math.cos(Math.toRadians(myLatitude))* Math.cos(Math.toRadians(trendLatitude))* Math.sin(dLon/2)* Math.sin(dLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = 6371 * c * 1000;    // Distance in m
        return (int) Math.round(d);
    }
}
