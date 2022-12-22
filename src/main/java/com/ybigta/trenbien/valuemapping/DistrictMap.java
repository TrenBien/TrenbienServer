package com.ybigta.trenbien.valuemapping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DistrictMap {
    public static final Map<String, Integer> DistrictHashMap = initMap();

    private static Map<String, Integer> initMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("서울특별시 강남구", 0);
        map.put("서울특별시 강동구", 1);
        map.put("서울특별시 강북구", 2);
        map.put("서울특별시 강서구", 3);
        map.put("서울특별시 관악구", 4);
        map.put("서울특별시 광진구", 5);
        map.put("서울특별시 구로구", 6);
        map.put("서울특별시 금천구", 7);
        map.put("서울특별시 노원구", 8);
        map.put("서울특별시 도봉구", 9);
        map.put("서울특별시 동대문구", 10);
        map.put("서울특별시 동작구", 11);
        map.put("서울특별시 마포구", 12);
        map.put("서울특별시 서대문구", 13);
        map.put("서울특별시 서초구", 14);
        map.put("서울특별시 성동구", 15);
        map.put("서울특별시 성북구", 16);
        map.put("서울특별시 송파구", 17);
        map.put("서울특별시 양천구", 18);
        map.put("서울특별시 영등포구", 19);
        map.put("서울특별시 용산구", 20);
        map.put("서울특별시 은평구", 21);
        map.put("서울특별시 종로구", 22);
        map.put("서울특별시 중구", 23);
        map.put("서울특별시 중랑구", 24);
        return Collections.unmodifiableMap(map);
    }
}
