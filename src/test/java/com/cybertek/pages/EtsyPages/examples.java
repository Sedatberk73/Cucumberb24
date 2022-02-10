package com.cybertek.pages.EtsyPages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class examples {

    int amount;
    public examples(){
        this.amount=100;
    }






    public static void main(String[] args) {


        String[] arr={"1","2"};

        List<String > ar=new ArrayList<>(Arrays.asList(arr));
        System.out.println(ar);
        ar.add(null);

      ar.remove(null);
        System.out.println(ar);










    }
}
