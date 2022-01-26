/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntofuncioncmepps;

/**
 *
 * @author Usuario
 */
public class TablaMedicion {
    private final int [][] datos;
    
    public TablaMedicion(){
        datos = new int[3][3];
        datos[0][0] = 1;
        datos[0][1] = 1;
        datos[0][2] = 2;
        
        datos[1][0] = 1;
        datos[1][1] = 2;
        datos[1][2] = 3;
        
        datos[2][0] = 2;
        datos[2][1] = 3;
        datos[2][2] = 3;
    }
    
    public int getDato(int a, int b){
        return this.datos[a][b];
    }
    
    public String getDatoToString(int a , int b){
        String returnData;
        returnData = switch (getDato(a,b)) {
            case 1 -> "S";
            case 2 -> "M";
            case 3 -> "C";
            default -> null;
        };
        return returnData;
    }
   
}
