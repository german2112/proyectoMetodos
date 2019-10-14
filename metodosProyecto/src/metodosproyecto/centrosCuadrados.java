/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosproyecto;
import java.lang.Math;
/**
 *
 * @author INTERN
 */
public class centrosCuadrados {
    public String semilla;
    public String n;
    
    public int centrosCuadradosRandom(String semilla,String n){
        int tamanio1 = semilla.length();
        int numero1 = Integer.parseInt(semilla);
        int numerosRandom = Integer.parseInt(n);
        for(int i = 0; i<=numerosRandom; i++){
            long numero2 = (long)Math.pow(numero1,2);
            String snumero2 = Long.toString(numero2);
            int tamanio2 = snumero2.length();
            int primerc = (tamanio2 - tamanio1)/2;
            String random = snumero2.substring(primerc, primerc+tamanio1);
            numero1 = Integer.parseInt(random);
            System.out.println(numero2 +"("+ random +")");
        }
        return 0;
    }
    public centrosCuadrados(){

}

}
