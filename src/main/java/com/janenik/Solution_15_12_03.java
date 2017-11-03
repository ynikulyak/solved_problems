package com.janenik;

import java.math.BigDecimal;

/**
 * Created by jane on 9/7/16.
 */
public class Solution_15_12_03 {

    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object (задание 2)
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number (Задание 3)
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String (Задание 4)
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }


    public static class Tree {
        public static int globalNumber;
        public int number;

        public Tree() {
            this.number = ++globalNumber;
        }

        public void info(Object s) {
            System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
        }

        public void info(Number s){
            System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName()));
        }

        public void info(String s){
            System.out.println(String.format("Дерево %d , метод String, параметр String", number));
        }
    }

}
