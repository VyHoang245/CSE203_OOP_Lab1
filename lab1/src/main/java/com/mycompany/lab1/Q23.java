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
public class Q23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        while (nu!=1){
            if(nu%2==0){
                System.out.println(nu+" is even, so we take n/2: "+nu/2);
                nu /= 2;
            }
            else{
                System.out.println(nu+" is odd, so we take 3*n+1: "+(nu*3+1));
                nu = nu*3+1;
            }
    }
    }
}
