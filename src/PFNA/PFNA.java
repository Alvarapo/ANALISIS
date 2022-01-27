/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFNA;

import IFPUG.ConsultasExternas;
import IFPUG.EntradasExternas;
import IFPUG.GrupoLogicoDatosInterfaz;
import IFPUG.GrupoLogicoDatosInternos;
import IFPUG.SalidasExternas;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PFNA {
    ArrayList<GrupoLogicoDatosInterfaz> grupoLogicoDatosInterfazList;
    ArrayList<GrupoLogicoDatosInternos> grupoLogicoDatosInternosList;
    ArrayList<EntradasExternas> entradasExternasList;
    ArrayList<SalidasExternas> salidasExternasList;
    ArrayList<ConsultasExternas> consultasExternasList;
    
    private int total = -1;
    private int totalPFEntradasExternas = 0;
    private int totalPFSalidasExternas = 0;
    private int totalPFDatosInternos = 0;
    private int totalPFDatosInterfaz = 0;
    private int totalPFConsultasExternas = 0;    
    
    public PFNA(ArrayList<GrupoLogicoDatosInterfaz> grupoLogicoDatosInterfazList,
            ArrayList<GrupoLogicoDatosInternos> grupoLogicoDatosInternosList,
            ArrayList<EntradasExternas> entradasExternasList,
            ArrayList<SalidasExternas> salidasExternasList,
            ArrayList<ConsultasExternas> consultasExternasList) {

        this.grupoLogicoDatosInterfazList = grupoLogicoDatosInterfazList;
        this.grupoLogicoDatosInternosList = grupoLogicoDatosInternosList;
        this.entradasExternasList = entradasExternasList;
        this.salidasExternasList = salidasExternasList;
        this.consultasExternasList = consultasExternasList;
    }
       
    public int [] getDatosGrupoLogicoDatosInterfazList(){
        int datos[] = new int[3];
        for (int i = 0; i < 3; i++) {
            datos[i] = 0;
        }
        
        for (int i = 0; i < grupoLogicoDatosInterfazList.size(); i++) {
            datos[grupoLogicoDatosInterfazList.get(i).getResultInt()-1]++;
        }
        
        return datos;
    }
    
    public int [] getDatosGrupoLogicoDatosInternosList(){
        int datos[] = new int[3];
        for (int i = 0; i < 3; i++) {
            datos[i] = 0;
        }
        
        for (int i = 0; i < grupoLogicoDatosInternosList.size(); i++) {
            datos[grupoLogicoDatosInternosList.get(i).getResultInt()-1]++;
        }
        
        return datos;
    }
    
    public int [] getDatosEntradasExternasList(){
        int datos[] = new int[3];
        for (int i = 0; i < 3; i++) {
            datos[i] = 0;
        }
        
        for (int i = 0; i < entradasExternasList.size(); i++) {
            datos[entradasExternasList.get(i).getResultInt()-1]++;
        }
        
        return datos;
    }
    
    public int [] getDatosSalidasExternasList(){
        int datos[] = new int[3];
        for (int i = 0; i < 3; i++) {
            datos[i] = 0;
        }
        
        for (int i = 0; i < salidasExternasList.size(); i++) {
            datos[salidasExternasList.get(i).getResultInt()-1]++;
        }
        
        return datos;
    }
    
    public int [] getDatosConsultasExternasList(){
        int datos[] = new int[3];
        for (int i = 0; i < 3; i++) {
            datos[i] = 0;
        }
        
        for (int i = 0; i < consultasExternasList.size(); i++) {
            datos[consultasExternasList.get(i).getResultInt()-1]++;
        }
        
        return datos;
    }
    
    public int getTotalPFEntradasExternas(){
        int datos[];
        
        datos = getDatosEntradasExternasList();
        totalPFEntradasExternas = 3*datos[0] + 4*datos[1] + 6*datos[2];
        return totalPFEntradasExternas;
    }
    
    public int getTotalPFSalidasExternas(){
        int datos[];
        
        datos = getDatosSalidasExternasList();
        totalPFSalidasExternas = 4*datos[0] + 5*datos[1] + 7*datos[2];
        return totalPFSalidasExternas;
    }
    
    public int getTotalPFDatosInternos(){
        int datos[];
        
        datos = getDatosGrupoLogicoDatosInternosList();
        totalPFDatosInternos = 7*datos[0] + 10*datos[1] + 15*datos[2];
        return totalPFDatosInternos;
    }
    
    public int getTotalPFDatosInterfaz(){
        int datos[];
        
        datos = getDatosGrupoLogicoDatosInterfazList();
        totalPFDatosInterfaz = 5*datos[0] + 7*datos[1] + 10*datos[2];
        return totalPFDatosInterfaz;
    }
    
    public int getTotalPFConsultasExternas(){
        int datos[];
        
        datos = getDatosConsultasExternasList();
        totalPFConsultasExternas = 3*datos[0] + 4*datos[1] + 6*datos[2];
        return totalPFConsultasExternas;
    }
    
    public int getTotal(){
        this.total = getTotalPFEntradasExternas() + getTotalPFSalidasExternas() + getTotalPFDatosInternos() + getTotalPFDatosInterfaz() + getTotalPFConsultasExternas();
        return this.total;
    }
}
