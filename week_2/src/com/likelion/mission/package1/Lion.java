package com.likelion.mission.package1;

public class Lion {
    public String name;
    String major;
    private Long order;

    public Lion(String name, String major, Long order) {
        this.name = name;
        this.major = major;
        this.order = order;
    }

    public static boolean isValid(String name, String major, long order){
        return (!name.isEmpty() && !major.isEmpty() && order > 0);
    }
}
