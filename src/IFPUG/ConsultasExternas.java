/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IFPUG;

/**
 *
 * @author Ignacio Andreu
 */
public final class ConsultasExternas {

    private final SalidasExternas salidasExternas;
    private final EntradasExternas entradasExternas;
    private int resultInt;
    private final String resultString;

    public ConsultasExternas(SalidasExternas salidasExternas, EntradasExternas entradasExternas) {
        this.salidasExternas = salidasExternas;
        this.entradasExternas = entradasExternas;

        resultString = getResultStr();
        resultInt = getResultInteger();
    }

    private String getResultStr() {
        if (salidasExternas.getResultInt() >= entradasExternas.getResultInt()) {
            return salidasExternas.getResultString();
        } else {
            return entradasExternas.getResultString();
        }
    }

    private int getResultInteger() {
        if (salidasExternas.getResultInt() >= entradasExternas.getResultInt()) {
            return salidasExternas.getResultInt();
        } else {
            return entradasExternas.getResultInt();
        }
    }

    public String getResultString() {
        return this.resultString;
    }

    public int getResultInt() {
        return this.resultInt;
    }
}
