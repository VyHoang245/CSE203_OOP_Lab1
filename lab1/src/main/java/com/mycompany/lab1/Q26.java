/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class Q26 {
    public static boolean palindrome(String a){
        for (int i = 0; i<a.length();i++){
            char first = a.charAt(i);
            char last = a.charAt(a.length()-i-1);
            if(first!=last){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("The length of the string is: "+length);
        String[] word = str.split("\\s");
        System.out.println("The number of words in string: " + word.length);
        String string2 = sc.nextLine();
        String concat = str.concat(string2);
        System.out.println("Concatenate one string's contents to another: "+concat);
        System.out.println(palindrome(str));
    }
}
