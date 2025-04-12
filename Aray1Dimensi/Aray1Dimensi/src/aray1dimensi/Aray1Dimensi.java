/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aray1dimensi;

import java.util.Scanner;

/**
 *
 * @author imelda jaleha
 * TGL 12 April 2025
 */
public class Aray1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] NMA = new String[5];
        NMA [0]= "Diva";
        NMA [1]= "Phond";
        NMA [2]= "Phuwin";
        NMA [3]= "NI-ki";
        NMA [4]= "Santa";
      
        Scanner inp = new Scanner (System. in);
        System.out.println("~~~~~Input Data Ke Array~~~");
        for (int id=0; id<5; id++){
            System.out.printf("Data Nama Pengunjung ke-%d: ", id);
            NMA[id] = inp.nextLine();
           
        }
        System.out.println("~~~~~Output Data Ke Array~~~~~");
        for (int idx=0; idx<5; idx++){
            System.out.println("Data Nama Pengunjung ke-"+(idx+1)+": "+NMA[idx]);
        }
        System.out.println("~~~~~Output2 data Ke Array~~~~~");
        int no=1;
        for (String isi : NMA){
            System.out.println(no+". "+isi);
            no++;
        }
       }
}
    

