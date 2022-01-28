/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IFPUG;

import puntofuncioncmepps.TablaMedicion;

/**
 *
 * @author Ignacio Andreu
 */
public class EntradasExternas extends TablaMedicion {

    private final int resultInt;
    private final String resultString;

    public EntradasExternas(int tipoRegistro, int tipoDato) throws Exception {
        int ficherosReferenciados = -1;
        int tipoDatoFinal = -1;

        if (tipoRegistro == 1 || tipoRegistro == 0) {
            ficherosReferenciados = 0;
        } else if (tipoRegistro == 2) {
            ficherosReferenciados = 1;
        } else if (tipoRegistro >= 3) {
            ficherosReferenciados = 2;
        } else {
            throw new Exception("El valor de tipo de registro introducido no es válido");
        }

        if (tipoDato >= 1 && tipoDato <= 4) {
            tipoDatoFinal = 0;
        } else if (tipoDato >= 5 && tipoDato <= 15) {
            tipoDatoFinal = 1;
        } else if (tipoDato >= 16) {
            tipoDatoFinal = 2;
        } else {
            throw new Exception("El valor de tipo de dato introducido no es válido");
        }

        resultString = getDatoToString(ficherosReferenciados, tipoDatoFinal);
        resultInt = getDato(ficherosReferenciados, tipoDatoFinal);
    }

    public String getResultString() {
        return this.resultString;
    }

    public int getResultInt() {
        return this.resultInt;
    }

}
