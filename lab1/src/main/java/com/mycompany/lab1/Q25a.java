/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class Q25a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<n;i++){
            list.add(sc.nextInt());
        }
        int specific = sc.nextInt();
        if(list.get(0)==specific){
            list.remove(2);
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
                
    }
}
