package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan hewan kelinci kordinaat menggunakan konsep inheritance dan polymorphism
 */

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("peter", false, "grass", 4, "grey");

        System.out.println("Hello, His name is "+rabbit.getName());
        System.out.println(rabbit.getName().concat(" is Vegetarian ? ") + rabbit.isVegetarian());
        System.out.println(rabbit.getName().concat(" eats ").concat(rabbit.getEats()));
        System.out.println(rabbit.getName().concat(" color is ").concat(rabbit.getColor()));
    }
}
