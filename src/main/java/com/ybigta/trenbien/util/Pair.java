package com.ybigta.trenbien.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pair implements Comparable<Pair> {

    private Float key;
    private String value;

    public Pair(Float key, String value){
        this.key = key;
        this.value = value;
    }
    @Override
    public int compareTo(Pair o) {
        return (int) (o.key - key);
    }
}
