package com.mysite.sbb;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class helloLombok {

    private String hello;
    private int lombok;

    public static void main(String[] args) {
        helloLombok helloLombok = new helloLombok();
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
