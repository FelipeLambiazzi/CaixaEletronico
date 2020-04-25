/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;
import java.util.Scanner;
/**
 *
 * @author Felipe Lambiazzi
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String CPF;
        char menu=01;
        int senha = 0;
        double saldo = 1000, deposito=0,saque=0;
        //Menu
        System.out.println("-----------------------------------------------");
        System.out.println("-      Bem Vindo ao banco do Felipe!          -");
        System.out.println("-----------------------------------------------");
        System.out.println("-          Favor digitar seu CPF              -");
        System.out.println("-----------------------------------------------");
        System.out.println("-           Exemplo: XXX.XXX.XXX-XX           -");
        System.out.println("-----------------------------------------------");
        
        CPF = "123.456.789-00";
       
        
        //CPF = ler.next();
        if ("123.456.789-00".equals(CPF)){
            System.out.println("-       Favor digitar sua senha           -");
            senha = 01020304;
            //senha = ler.nextInt();
            if (senha == 01020304){
            while (menu != 0){
            System.out.println("------MENU------");
            System.out.println("1-SALDO");
            System.out.println("2-DEPÓSITO");
            System.out.println("3-SAQUE");
            System.out.println("0-SAIR");
            menu = ler.next().charAt(0);
            
            switch (menu){
                //------------------------------
                //Saldo
             case '1': 
                 System.out.println("Seu saldo em conta é de R$"+saldo);
                 break;
                 //------------------------------
                 // Deposito
             case '2': 
                 System.out.println("Favor digitar o valor do deposito R$:");
                 deposito = ler.nextDouble();
                 saldo = saldo+deposito;
                 System.out.println("Saldo Atual R$:"+saldo);
                 
                 break;
                 //------------------------------
                 // Saque
             case '3': 
                 System.out.println("Favor Digitar o valor do saque R$:");
                 saque = ler.nextDouble();
                 if (saque >saldo){
                     System.out.println("Translação negada! Saldo insuficiente");
                 }
                 if (saque < saldo){
                     saldo = saldo-saque;
                      System.out.println("Parabens! Retire seu dinheiro abaixo");
                      System.out.println("Seu saldo ficou um total de R$"+saldo);
                 }
                 
                 break;
                 //------------------------------
                 // Sair
          
                }
            }
            //------------------------------
            //senha errada
            if (senha != 01020304){
                 System.out.println("Senha incorreta");    
                }
        }
            //------------------------------
            //caso o CPF não Exista
            if(CPF != "123.456.789-00") {
               System.out.println("CPF digitado não existe");     
               
          }
            else {
            System.out.println("Valor Digitado é inadequado e inexistente");
            }
        }
    }
    
}

    
    
       

