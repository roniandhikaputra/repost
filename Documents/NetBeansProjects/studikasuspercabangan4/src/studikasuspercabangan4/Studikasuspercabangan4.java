/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuspercabangan4;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Studikasuspercabangan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // deklarasi variabel  
    String nama; 
    int nilai; 
     
    Scanner input = new Scanner(System.in); 
     
    System.out.println("<< Nilai Siswa SMK TELKOM MALANG >>");   
    System.out.println("nama = ");     nama = input.nextLine();  
    System.out.println("nilai = ");     nilai = input.nextInt(); 
     
    // membuat struktur kondisi if     if (nilai > 90){ 
        System.out.println("grade = A"); 
    } 
    else if (nilai > 80){ 
        System.out.println("grade = B+"); 
    } 
    else if (nilai > 70) { 
        System.out.println("grade = B"); 
    } 
    else if (nilai < 70){ 
        System.out.println("grade = F"); 

    }
    
}
