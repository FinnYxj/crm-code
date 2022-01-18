package com.gaocai.test;

import java.util.UUID;

public class Test1 {
    public static void main(String[] args) {


        for(int i=0;i<20;i++){
            UUID uuid = UUID.randomUUID();
            String str = uuid.toString();
            str = str.replaceAll("-","");
            System.out.println(str);
        }
    }
}
