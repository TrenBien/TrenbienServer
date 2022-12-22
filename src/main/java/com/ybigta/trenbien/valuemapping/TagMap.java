package com.ybigta.trenbien.valuemapping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TagMap {
    public static final Map<String, Integer> TagHashMap = initMap();

    private static Map<String, Integer> initMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("가격이 합리적이에요", 0);
        map.put("가성비가 좋아요", 1);
        map.put("단체모임 하기 좋아요", 2);
        map.put("대화하기 좋아요", 3);
        map.put("디저트가 맛있어요", 4);
        map.put("매장이 넓어요", 5);
        map.put("매장이 청결해요", 6);
        map.put("부모도 쉬기 좋아요", 7);
        map.put("뷰가 좋아요", 8);
        map.put("비싼 만큼 가치있어요", 9);
        map.put("빵이 맛있어요", 10);
        map.put("사진이 잘 나와요", 11);
        map.put("설명이 자세해요", 12);
        map.put("양이 많아요", 13);
        map.put("원데이 클래스가 알차요", 14);
        map.put("음료가 맛있어요", 15);
        map.put("음식이 맛있어요", 16);
        map.put("인테리어가 멋져요", 17);
        map.put("재료가 신선해요", 18);
        map.put("주차하기 편해요", 19);
        map.put("친절해요", 20);
        map.put("커피가 맛있어요", 21);
        map.put("특별한 날 가기 좋아요", 22);
        map.put("특별한 메뉴가 있어요", 23);
        map.put("혼밥하기 좋아요", 24);
        map.put("화장실이 깨끗해요", 25);
        map.put("바비큐 해먹기 좋아요", 26);
        map.put("선물하기 좋아요", 27);
        map.put("안전하게 관리해요", 28);
        map.put("휴게공간이 잘 되어있어요", 29);
        map.put("초보자에게도 적합해요", 30);
        map.put("수업 시간이 충분해요", 31);
        map.put("책 읽기 쾌적해요", 32);
        map.put("메뉴 구성이 알차요", 33);
        map.put("고기 질이 좋아요", 34);
        map.put("직접 잘 구워줘요", 35);
        map.put("테마가 재미있어요", 36);
        map.put("아늑해요", 37);
        map.put("건강한 맛이에요", 38);
        map.put("집중하기 좋아요", 39);
        map.put("룸이 잘 되어있어요", 40);
        map.put("컨셉이 독특해요", 41);
        map.put("맞춤 수업을 잘해줘요", 42);
        map.put("포장이 깔끔해요", 43);
        map.put("현지 맛에 가까워요", 44);
        map.put("음식이 빨리 나와요", 45);
        map.put("좌석이 편해요", 46);
        map.put("체험 프로그램이 다양해요", 47);
        map.put("반찬이 잘 나와요", 48);
        map.put("예쁜 소품이 많아요", 49);
        map.put("야외 공간이 멋져요", 50);
        map.put("상품이 다양해요", 51);
        map.put("조식이 맛있어요", 52);
        map.put("오래 머무르기 좋아요", 53);
        map.put("시설이 깔끔해요", 54);
        map.put("공간이 넓어요", 55);
        map.put("체험 프로그램이 많아요", 56);
        map.put("환기가 잘 돼요", 57);
        map.put("품질이 좋아요", 58);
        map.put("차분한 분위기에요", 59);
        map.put("조용히 쉬기 좋아요", 60);
        map.put("규모가 커요", 61);
        map.put("관리가 잘 되어있어요", 62);
        map.put("특색 있는 제품이 많아요", 63);
        map.put("프라이빗해요", 64);

        return Collections.unmodifiableMap(map);
    }
}
