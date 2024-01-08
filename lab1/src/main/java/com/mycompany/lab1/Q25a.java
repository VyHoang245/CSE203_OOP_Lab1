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
    public static boolean remove(ArrayList<Integer> list, int nu){
        if(list.get(0)==nu){
            list.remove(2);
            return true;
        }
        return false;
    }
    public static ArrayList<Integer> insert(ArrayList<Integer> list, int po, int ele){
        list.add(po, ele);
        return list;
    }
    public static ArrayList<Integer> duplicate(ArrayList<Integer> list){
        ArrayList<Integer> dup = new ArrayList<Integer>();
        for(int j = 0; j<list.size()-1;j++){
            for(int i = j+1; i<list.size();i++){
                if(list.get(i)==list.get(j)){
                    dup.add(list.get(i));
                    break;
                }
            }
        }
        return dup;
    }
    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
        for(int j = 0; j<list.size()-1;j++){
            for(int i = j+1; i<list.size();i++){
                if(list.get(i)==list.get(j)){
                    list.remove(i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<n;i++){
            list.add(sc.nextInt());
        }
        //int specific = sc.nextInt();
        //remove(list,specific);
        //int position = sc.nextInt();
        //int element = sc.nextInt();
        //ArrayList<Integer> dup = duplicate(list);
        //for (int e:dup){
          //  System.out.print(e+" ");
        //}
        ArrayList<Integer> notDup = removeDup(list);
        for (int e:notDup){
            System.out.print(e+" ");
        }
    }
}
