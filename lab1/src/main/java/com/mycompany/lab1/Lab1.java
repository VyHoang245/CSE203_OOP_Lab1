/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int last = nu%10;
        int first = 0;
        for (int i = 10; ;i*=10){
            first = nu/i;
            if(first<10){
                break;
            }
        }
        int sum = last+first;
        System.out.print(sum);
    }
}
