/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author s.lucas
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat("0.00");
        double gasosa = 5.84, alcu = 4.90, litros, entre, resu;
        int item;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite \"1\" para Gasolina e \"2\" para Álcool.");
        item = ler.nextInt();
        if(item==1 && item > 0){
            System.out.println("Quantos litros gasolina deseja colocar?");
            litros = ler.nextDouble();
            if(litros<=25 && litros>0){
                entre = litros*gasosa;
                resu = entre*0.02;
                resu = entre-resu;
                System.out.println("Terá de ser pago R$"+form.format(resu));
            }else{
                entre = litros*gasosa;
                resu = entre*0.04;
                resu = entre-resu;
                System.out.println("Terá de ser pago R$"+form.format(resu));
                
                
            }
        }else{
    System.out.println("Quantos litros Álcool deseja colocar?");
            litros = ler.nextDouble();
            if(litros<=25 && litros>0){
                entre = litros*alcu;
                resu = entre*0.03;
                resu = entre-resu;
                System.out.println("Terá de ser pago R$"+form.format(resu));
            }else{
                entre = litros*alcu;
                resu = entre*0.05;
                resu = entre-resu;
                System.out.println("Terá de ser pago R$"+form.format(resu));
            }
    
}
    }   
}
