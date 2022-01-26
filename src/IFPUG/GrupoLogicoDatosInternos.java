/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IFPUG;

import puntofuncioncmepps.TablaMedicion;

/**
 *
 * @author Usuario
 */

public final class GrupoLogicoDatosInternos extends TablaMedicion{
    int tipoRegistro; 
    int tipoDato;
    private int resultInt;
    private String resultString;
    
    public GrupoLogicoDatosInternos(int tipoRegistro , int tipoDato) throws Exception{
        this.tipoRegistro = tipoRegistro;
        this.tipoDato = tipoDato;
        getResult(tipoRegistro , tipoDato);
    }
    
    private void getResult(int tipoRegistro , int tipoDato) throws Exception{
        
        int tipoRegistroFinal = -1;
        int tipoDatoFinal = -1;
        
        if(tipoRegistro == 1) tipoRegistroFinal = 0;
        else if(tipoRegistro >= 2 && tipoRegistro <= 5) tipoRegistroFinal = 1;
        else if(tipoRegistro >= 6) tipoRegistroFinal = 2;
        else throw new Exception("El valor de tipo de registro introducido no es válido");
        
        if(tipoDato >= 1 && tipoDato <= 19) tipoDatoFinal = 0;
        else if(tipoDato >= 20 && tipoDato <= 50) tipoDatoFinal = 1;
        else if(tipoDato >= 51) tipoDatoFinal = 2;
        else throw new Exception("El valor de tipo de dato introducido no es válido");
        
        resultInt = getDato(tipoRegistroFinal,tipoDatoFinal);
        resultString = getDatoToString(tipoRegistroFinal,tipoDatoFinal);
    }
    
     
    public String getResultString(){
        return this.resultString;
    }
    
    public int getResultInt(){
        return this.resultInt;
    }
}
