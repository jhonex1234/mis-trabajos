/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author jhone
 */
public class TestMail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  arroba=0;
        boolean punto=false;
        String mail=JOptionPane.showInputDialog("Introduce tu email");
        for(int i=0;i<mail.length();i++){
            if (mail.charAt(i)=='@') {
                arroba++;
                
            }
            if (mail.charAt(i)=='.') {
                punto=true;
            }
        }
            if (arroba==1&&punto==true) {
                System.out.println("Email correcto");
            }else{
                System.out.println("Email incorrecto");
            }   
    }
    
}
