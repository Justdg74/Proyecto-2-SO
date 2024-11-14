/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author alexi
 */


import EDD.Nodo;
import Interfaz.InterfazMain;
import Interfaz.GVariables;       
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class AI extends Thread {
    private Character p1; //Personaje de ST
    private Character p2; //Personaje de SW
    private int StWins;
    private int SwWins;
    private String state;
    private int WaitingTime;
    private InterfazMain interfaz;
    
     public AI() {
        this.p1 = null;
        this.p2 = null;
        this.StWins = 0;
        this.SwWins = 0;
        this.state = "Esperando...";
        this.WaitingTime = 10000;
       
    }

    public InterfazMain getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(InterfazMain interfaz) {
        this.interfaz = interfaz;
    }
 
     
    public Character getP1() {
        return p1;
    }

    public void setP1(Character p1) {
        this.p1 = p1;
    }

    public Character getP2() {
        return p2;
    }

    public void setP2(Character p2) {
        this.p2 = p2;
    }    

    public int getWaitingTime() {
        return WaitingTime;
    }

    public void setWaitingTime(int WaitingTime) {
        this.WaitingTime = WaitingTime;
    }
    
    
     
    @Override
    
    public void run(){                    
        try {
//          
            int resultadonum= (int) (Math.random()*100) ; // se escoge el resultado de la batalla
            this.state = "Decidiendo";
            interfaz.getIA_Status().setText(this.state);
            sleep(this.WaitingTime); //duerme 10 segundos en los que "piensa"
            //ahora el resultado
            this.state = "Anunciando resultados";
            interfaz.getIA_Status().setText(this.state);
            
            Character ganador;
            System.out.println("decision: "+resultadonum);
            if(resultadonum<40) { //hay un ganador
                System.out.println("Hay un ganador, combatientes: "+p1.getName()+" "+p2.getName());
                System.out.println("personaje 1, id: "+p1.getId()+" nombre "+p1.getName()+" stats:\nAgilidad: "+p1.getAgilidad()+"\nFuerza: "+p1.getFuerza()+"\nHabilidad: "+p1.getHabilidad()+"\nHP: "+p1.getHp());
                System.out.println("personaje 2, id: "+p2.getId()+" nombre "+p2.getName()+" stats:\nAgilidad: "+p2.getAgilidad()+"\nFuerza: "+p2.getFuerza()+"\nHabilidad: "+p2.getHabilidad()+"\nHP: "+p2.getHp());
                interfaz.getResultado_Combate().setText("Hubo un ganador!");
                
                ganador=Ganador();
                GVariables.getGanadores().insertBegin(ganador);
                
            }
                

            else if(resultadonum>=40 && resultadonum<67){ //hay empate
                System.out.println("Hubo empate");
                interfaz.getResultado_Combate().setText("Hubo un empate!");
                GVariables.getSStarTrek().getPrioridad1().encolar(p1);
                GVariables.getSStarWars().getPrioridad1().encolar(p2);
            }
            else if (resultadonum>=67 && resultadonum<100){//no sucede el combate
                System.out.println("Alquien tuvo una luxación y el combate no se puede hacer");
               // Interfaz.getResultado_Combate().setText("Suspendido!");
                GVariables.getSStarTrek().getRefuerzo().encolar(p1);
                GVariables.getSStarWars().getRefuerzo().encolar(p2); 
               // interfaz.getRefuerzo_SW().setText(Global.getCN().getRefuerzo().imprimir());
               // interfaz.getRefuerzoNick().setText(Global.getNick().getRefuerzo().imprimir());
            }            

            sleep(3000); //Duerme 3 segundos para que el resultado se pueda ver reflejado en la interfaz, propenso a cambio
            
            this.state = "Esperando...";
            interfaz.getIA_Status().setText(this.state);
            interfaz.getResultado_Combate().setText("Esperando...");
        } catch (InterruptedException ex) {
            Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
   
    public Character Ganador(){ //determinar cual de los dos personajes gano 
        int ventaja_p1=0;
        int ventaja_p2=0;
                
        if(p1.getAgilidad()>p2.getAgilidad()){
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
                
        if(p1.getFuerza()>=p2.getFuerza()){
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
                
        if(p1.getHabilidad()>p2.getHabilidad()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        if(p1.getHp()>=p2.getHp()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        
        
        if(ventaja_p1>ventaja_p2){
            System.out.println(p1.getName()+" es el ganador");
            interfaz.getWinners_Table().append("ST-"+p1.getId()+"-"+p1.getName()+'\n');
            interfaz.getCharacter_ST().setIcon(new ImageIcon(getClass().getResource("/ImagesAux/Cargando.png"))); // Se quita la foto del perdedor
            this.StWins ++;
            interfaz.getST_Wins_Count().setText(Integer.toString(this.StWins));
            
            return p1;
        }else{
            System.out.println(p2.getName()+" es el ganador");
            interfaz.getWinners_Table().append("SW-"+p2.getId()+"-"+p1.getName()+'\n');
            interfaz.getCharacter_SW().setIcon(new ImageIcon(getClass().getResource("/ImagesAux/Cargando.png"))); // Se quita la foto del Perdedor
            this.SwWins ++;
            interfaz.getSW_Wins_Count().setText(Integer.toString(this.SwWins));
            
            return p2;
        }
       
    }
    
    
    
}
