/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariomaya;

/**
 *
 * @author Administrador
 */

import java.util.Scanner;

public class CalendarioMaya {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        String meses_HAAB[] = {"pop", "no", "zip", "zotz", "tzec", "xul", "yoxkin", "mol", "chen", "yax", "zac", "ceh", "mac", "kankin", "muan", "pax", "koyab", "cumhu","uayet"};
        String  dias_TZOLKIN[] = {"imix", "ik", "akbal", "kan", "chicchan", "cimi", "manik", "lamat", "muluk", "ok", "chuen", "eb", "ben", "ix", "mem", "cib", "caban", "eznab", "canac", "ahau"};
        
        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.println("Ingrese la fecha HAAB ");
        String fecha = sc.nextLine();
        
        String[] parte_fecha = fecha.split(" ");
        String dia = parte_fecha[0].substring(0,parte_fecha[0].length() - 1);
        int numdia = Integer.parseInt(dia);
        String mes = parte_fecha[1].trim();
        String año = parte_fecha[2].trim();
        int numAño = Integer.parseInt(año);
        int limite;
        System.out.println("HAAB: " + fecha);
        
        boolean br = false;
        int count = 0;
        
        
        // CALENDARIO HAAAB
        for(int i=0;i<numdia;i++){
            for(int j=0;j<19;j++){
                if(j==18){
                    limite = 5;
                }else{
                    limite=20;
                }
                for(int k=0;k<limite;k++){
                    if(k == numdia && (meses_HAAB[j] == null ? mes == null : meses_HAAB[j].equals(mes)) && i == numAño){
                        br = true;
                        break;
                    }
                    count++;
                }
                if(br){
                    break;
                }
            }
            if(br){
                break;
            }
            
        }
        
        
        int max = 5000;
        int tz_count = 0;
        int tz_day = 1;
        
        // CALENDARIO TZOLKIN
        for(int i=0;i<=max;i++){
            for(int j=1;j<=13;j++){
                for (int k=0;k<20;k++) {
                    if(tz_day >=14){
                        tz_day = 1;
                    }
                    if (tz_count == count) {
                        System.out.println("Tzolkin" +  " " + tz_day++ +" " + dias_TZOLKIN[k] + " " + i);
                        br = true;
                        break;
                    }
                    tz_count++;
                    tz_day++;
                }
                if(br){
                    break;
                }  
            }
            if(br){
                break;
            }
        }
        
        
        
        
        
    }
       
        
    
    
}
