/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntofuncioncmepps;

import IFPUG.ConsultasExternas;
import IFPUG.EntradasExternas;
import IFPUG.GrupoLogicoDatosInterfaz;
import IFPUG.GrupoLogicoDatosInternos;
import IFPUG.SalidasExternas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PuntoFuncionCMEPPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        GrupoLogicoDatosInternos grInternos = new GrupoLogicoDatosInternos(1, 22);
        System.out.println("GrupoLogicoDatosInternos----El resultado es " + grInternos.getResultString() + " en integer es " + grInternos.getResultInt());
        
        GrupoLogicoDatosInterfaz grInterfaz = new GrupoLogicoDatosInterfaz(1, 22);
        System.out.println("GrupoLogicoDatosInterfaz----El resultado es " + grInterfaz.getResultString() + " en integer es " + grInterfaz.getResultInt());
        
        SalidasExternas salext = new SalidasExternas(0, 1);
        System.out.println("SalidasExternas----El resultado es " + salext.getResultString() + " en integer es " + salext.getResultInt());
        
        EntradasExternas entext = new EntradasExternas(4, 22);
        System.out.println("EntradasExternas----El resultado es " + entext.getResultString() + " en integer es " + entext.getResultInt());
        
        ConsultasExternas consultas = new ConsultasExternas(salext, entext);
        System.out.println("ConsultasExternas----El resultado es " + consultas.getResultString() + " en integer es " + consultas.getResultInt());
        
      
     
    }
    
}
