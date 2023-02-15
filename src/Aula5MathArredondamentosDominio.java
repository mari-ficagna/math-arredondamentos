/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula5MathArredondamentosDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nr = -5.75f;
        System.out.println("Absoluto: " + Math.abs(nr) 
                + "\nInteiro mais baixo: " + Math.ceil(nr) 
                + "\nInteiro mais alto: " + Math.floor(nr) 
                + "\nDouble mais próximo: " + Math.rint(nr) 
                + "\nArredondamento: " + Math.round(nr));
    }
    
}
