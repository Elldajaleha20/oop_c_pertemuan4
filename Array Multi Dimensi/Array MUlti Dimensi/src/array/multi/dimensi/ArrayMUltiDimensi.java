/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.multi.dimensi;

import java.util.Scanner;

/**
 *
 * @author Imelda Jaleha
 * TGL !2 April 2025
 */
public class ArrayMUltiDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String[3][2];
        
        meja[0][0] = "Meja Diva";
        meja[0][1] = "Meja Ellda";
        
        meja[1][0] = "Meja Mila";
        meja[1][1] = "Meja Mirul";
        
        meja[2][0] = "Meja Phond";
        meja[2][1] = "Meja Phuwin";
        
        Scanner inp = new Scanner(System.in);
        for (int brs=0; brs<3; brs++){
            System.out.printf("baris ke-%d\n", brs);
            for(int klm=0; klm<2; klm++){
                System.out.printf(">>Kolom ke-%d", klm);
                meja[brs][klm] = inp.nextLine();
                
            }
        }
    }
  
}
    
