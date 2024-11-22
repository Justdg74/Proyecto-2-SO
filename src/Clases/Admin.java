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
import Interfaz.GVariables;
import Interfaz.InterfazMain;
import java.util.concurrent.Semaphore;
import javax.swing.JTextArea;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Admin extends Thread {
    private int ciclo; //cada 2 ciclos se revisa la probabilidad de que se cree uno nuevo
    public AI ai; //la IA con el que el Admin va a estar trabajando
    private Semaphore mutex1; //Semaforo de ST
    private Semaphore mutex2; //Semaforo de  SW
    private int IdCh=0;
    public InterfazMain interfaz;
    
    
    public Admin(AI ai){
        this.ciclo = 0;
        this.ai = ai;
        this.mutex1 = new Semaphore(1);
        this.mutex2 = new Semaphore(1);
        
        
        
    }
    
    
    @Override
    public void run(){
        while(true){
            try{
                checkEmpty();
                mutex1.acquire(); //Wait del semáforo de Star Trek para conseguir el personaje
                if(GVariables.getSStarTrek().getPrioridad1().getSize() > 0){                                 //Si hay algo en la cola de prioridad 1 desencola
                    this.ai.setP1(GVariables.getSStarTrek().getPrioridad1().desencolar().getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarTrek().getPrioridad1().imprimir());
                    interfaz.getPrioridad1_ST().setViewportView(text);
                }else if(GVariables.getSStarTrek().getPrioridad2().getSize() > 0){                            //Si hay algo en la cola de prioridad 2 desencola
                    this.ai.setP1(GVariables.getSStarTrek().getPrioridad2().desencolar().getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarTrek().getPrioridad2().imprimir());
                    interfaz.getPrioridad2_ST().setViewportView(text);
                }else if(GVariables.getSStarTrek().getPrioridad3().getSize() > 0){                            //Si hay algo en la cola de prioridad 3 desencola
                    this.ai.setP1(GVariables.getSStarTrek().getPrioridad3().desencolar().getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarTrek().getPrioridad3().imprimir());
                    interfaz.getPrioridad3_ST().setViewportView(text);
                }
                System.out.println("Se escogio uno de ST");
                mutex1.release(); //Se cierra la zona crítica de Start Trek
                
                changeStatsST(); //Se cambian las Stats al personaje actual de Star Trek

                mutex2.acquire(); //Wait del Semáforo de Star Wars para conseguir el personaje y se repite el procedimiento por colas

                if(GVariables.getSStarWars().getPrioridad1().getSize() > 0){                                 //Si hay algo en la cola de prioridad 1 desencola
                    this.ai.setP2(GVariables.getSStarWars().getPrioridad1().desencolar().getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarWars().getPrioridad1().imprimir());
                    interfaz.getPrioridad1_SW().setViewportView(text);
                }else if(GVariables.getSStarWars().getPrioridad2().getSize() > 0){                            //Si hay algo en la cola de prioridad 2 desencola
                    this.ai.setP2(GVariables.getSStarWars().getPrioridad2().desencolar().getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarWars().getPrioridad2().imprimir());
                    interfaz.getPrioridad2_SW().setViewportView(text);
                }else if(GVariables.getSStarWars().getPrioridad3().getSize() > 0){                            //Si hay algo en la cola de prioridad 3 desencola
                    this.ai.setP2(GVariables.getSStarWars().getPrioridad3().desencolar().getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarWars().getPrioridad3().imprimir());
                    interfaz.getPrioridad3_SW().setViewportView(text);
                }
                System.out.println("Se escogio uno de Wars");
                mutex2.release(); //Se cierra la zona crítica de Star wars
                
                changeStatsSW(); //Se cambian las Stats al personaje actual de SW
            
            changeIcons();    
                
            this.ai.run();
            
            clearStats();
            this.ciclo++;
            //hora de ver como se actualizan las colas
            Actualizar_colas();
            
             if(GVariables.getSStarTrek().getRefuerzo().getSize()>0){
                int chance= (int) (Math.random()*100);
                mutex1.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de ST salió de la cola de refuerzos");
                    Nodo character = GVariables.getSStarTrek().getRefuerzo().desencolar();
                    GVariables.getSStarTrek().getPrioridad1().encolar(character.getElement());
                    JTextArea text1 = new JTextArea(49,49);
                    JTextArea text2 = new JTextArea(49,49);
                    text1.setText(GVariables.getSStarTrek().getRefuerzo().imprimir());
                    text2.setText(GVariables.getSStarTrek().getPrioridad1().imprimir());
                    interfaz.getRefuerzos_ST().setViewportView(text1);
                    interfaz.getPrioridad1_ST().setViewportView(text2);
                    
                }else{
                    System.out.println("Un personaje de ST se mandó al final de la cola de refuerzos");
                    Nodo character = GVariables.getSStarTrek().getRefuerzo().desencolar();
                    GVariables.getSStarTrek().getRefuerzo().encolar(character.getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarTrek().getRefuerzo().imprimir());
                    interfaz.getRefuerzos_ST().setViewportView(text);
                }
                mutex1.release();
            }
            //Para Star Wars
            if(GVariables.getSStarWars().getRefuerzo().getSize()>0){
                int chance= (int) (Math.random()*100);
                mutex2.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de SW salió de la cola de refuerzos");
                    Nodo character = GVariables.getSStarWars().getRefuerzo().desencolar();
                    GVariables.getSStarWars().getPrioridad1().encolar(character.getElement());
                    JTextArea text1 = new JTextArea(49,49);
                    JTextArea text2 = new JTextArea(49,49);
                    text1.setText(GVariables.getSStarWars().getRefuerzo().imprimir());
                    text2.setText(GVariables.getSStarWars().getPrioridad1().imprimir());
                    interfaz.getRefuerzos_SW().setViewportView(text1);
                    interfaz.getPrioridad1_SW().setViewportView(text2);
                }else{
                    System.out.println("Un personaje de SW se mandó al final de la cola de refuerzos");
                    Nodo character = GVariables.getSStarWars().getRefuerzo().desencolar();
                    GVariables.getSStarWars().getRefuerzo().encolar(character.getElement());
                    JTextArea text = new JTextArea(49,49);
                    text.setText(GVariables.getSStarWars().getRefuerzo().imprimir());
                    interfaz.getRefuerzos_SW().setViewportView(text);
                }
                mutex2.release();
            }
            //Verificar si se crea un personaje o no 
            if(this.ciclo==2) {//se revisa si ya pasaron 2 ciclos
                int crear=(int) (Math.random()*100);
                
                if(crear>=0 && crear<80) {//entro en la probabilidad de crear
                    //System.out.println("se crea personaje");
                    AgregarPersonaje();
                }
                //si entra o no al final el contador de ciclo se reinicia a 0
                this.ciclo=0;
            }
            
                
            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void AgregarPersonaje(){        
        //crear un personaje de star trek
        int numP=(int) (Math.random()*19);
        int numO=(int) (Math.random()*9);
        GVariables.getSStarTrek().GenerateCharacter(GVariables.getStarTrek()[numP], GVariables.getObjetos()[numO],IdCh);
        IdCh++;
        
        //crear un personaje de star wars
        numP=(int) (Math.random()*19);
        numO=(int) (Math.random()*9);
        GVariables.getSStarWars().GenerateCharacter(GVariables.getStarWars()[numP], GVariables.getObjetos()[numO],IdCh);
        IdCh++;
        
    }
    
    public void Actualizar_colas() {
           // System.out.println("contador 2 de star trek");
            GVariables.getSStarTrek().getPrioridad2().subir_contador();
           // System.out.println("contador 3 de start trek");
            GVariables.getSStarTrek().getPrioridad3().subir_contador();
            
           // System.out.println("contador 2 de star wars");
            GVariables.getSStarWars().getPrioridad2().subir_contador();
           // System.out.println("contador 3 de star wars");
            GVariables.getSStarWars().getPrioridad3().subir_contador();
            
            //ahora veo como encolo y desencolo las que tienen 8 como contador
            Nodo borrado;
            //para prioridad 2 de SW
                System.out.println("personajes en cola de prioridad 2 de SW en admin");
            for (Nodo aux=GVariables.getSStarWars().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=GVariables.getSStarWars().getPrioridad2().Buscar(aux);//indice del nodo a borrar
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        borrado=GVariables.getSStarWars().getPrioridad2().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        borrado=GVariables.getSStarWars().getPrioridad2().borrar(indice);//lo quito de la cola
                    //System.out.println("nodo borrado "+borrado.getElement().getId());
                    }
                    GVariables.getSStarWars().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1
//                
                }
        
            }
            
            JTextArea text1 = new JTextArea(49,49);
            JTextArea text2 = new JTextArea(49,49);
            text1.setText(GVariables.getSStarWars().getPrioridad1().imprimir());
            text2.setText(GVariables.getSStarWars().getPrioridad2().imprimir());
            interfaz.getPrioridad1_SW().setViewportView(text1);
            interfaz.getPrioridad2_SW().setViewportView(text2);
                    
            
            //para prioridad 3 de star wars
            for (Nodo aux=GVariables.getSStarWars().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=GVariables.getSStarWars().getPrioridad3().Buscar(aux);//indice del nodo a borrar
                    System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        borrado=GVariables.getSStarWars().getPrioridad3().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        borrado=GVariables.getSStarWars().getPrioridad3().borrar(indice);//lo quito de la cola
                    //System.out.println("nodo borrado "+borrado.getElement().getId());
                    }
                    GVariables.getSStarWars().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1
//                );
                }
        
            }
            
            JTextArea text3 = new JTextArea(49,49);
            JTextArea text4 = new JTextArea(49,49);
            text3.setText(GVariables.getSStarWars().getPrioridad2().imprimir());
            text4.setText(GVariables.getSStarWars().getPrioridad3().imprimir());
            interfaz.getPrioridad2_SW().setViewportView(text3);
            interfaz.getPrioridad3_SW().setViewportView(text4);
                        
            //para prioridad 2 de ST
                System.out.println("personajes en cola de prioridad 2 de  ST");
            for (Nodo aux=GVariables.getSStarTrek().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                    System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=GVariables.getSStarTrek().getPrioridad2().Buscar(aux);//indice del nodo a borrar
                    System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        borrado=GVariables.getSStarTrek().getPrioridad2().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        borrado=GVariables.getSStarTrek().getPrioridad2().borrar(indice);//lo quito de la cola
                    //System.out.println("nodo borrado "+borrado.getElement().getId());
                    }
                    GVariables.getSStarTrek().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1
//                
                }
        
            }
            
            JTextArea text5 = new JTextArea(49,49);
            JTextArea text6 = new JTextArea(49,49);
            text3.setText(GVariables.getSStarTrek().getPrioridad1().imprimir());
            text4.setText(GVariables.getSStarTrek().getPrioridad2().imprimir());
            interfaz.getPrioridad1_ST().setViewportView(text5);
            interfaz.getPrioridad2_ST().setViewportView(text6);
            
            //para prioridad 3 de ST
            for (Nodo aux=GVariables.getSStarTrek().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=GVariables.getSStarTrek().getPrioridad3().Buscar(aux);//indice del nodo a borrar
                   
                    if(indice==0) {
                        
                        borrado=GVariables.getSStarTrek().getPrioridad3().desencolar();
                        
                        
                    }
                    else {
                        borrado=GVariables.getSStarTrek().getPrioridad3().borrar(indice);//lo quito de la cola
                    
                    }
                    GVariables.getSStarTrek().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1                   
                }
        
            }
            
            JTextArea text7 = new JTextArea(49,49);
            JTextArea text8 = new JTextArea(49,49);
            text7.setText(GVariables.getSStarTrek().getPrioridad1().imprimir());
            text8.setText(GVariables.getSStarTrek().getPrioridad2().imprimir());
            interfaz.getPrioridad1_ST().setViewportView(text7);
            interfaz.getPrioridad2_ST().setViewportView(text8);
    
    
    
    
    
    }

    public InterfazMain getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(InterfazMain interfaz) {
        this.interfaz = interfaz;
    }
    
    

    public int getIdCh() {
        return IdCh;
    }

    public void setIdCh(int IdCh) {
        this.IdCh = IdCh;
    }
    
    public void changeIcons(){
        interfaz.getCharacter_ST().setIcon(new ImageIcon(getClass().getResource("/ImagesStarTrek/"+this.ai.getP1().getName()+".png")));
        interfaz.getCharacter_SW().setIcon(new ImageIcon(getClass().getResource("/ImagesStarWars/"+this.ai.getP2().getName()+".png")));
        System.out.println("/Images.StarTrek/"+this.ai.getP1().getName()+".png");
        System.out.println("/Images.StarWars/"+this.ai.getP2().getName()+".png");
    }
    
    public void changeStatsST(){
        interfaz.getObjeto_ST().setText(this.ai.getP1().getObject()); 
        interfaz.getHabilidad_ST().setText(Integer.toString(this.ai.getP1().getHabilidad()));
        interfaz.getFuerza_ST().setText(Integer.toString(this.ai.getP1().getFuerza()));
        interfaz.getHp_ST().setText(Integer.toString(this.ai.getP1().getHp()));
        interfaz.getAgilidad_ST().setText(Integer.toString(this.ai.getP1().getAgilidad()));
    }
    
    public void changeStatsSW(){
        interfaz.getObjeto_SW().setText(this.ai.getP2().getObject());
        interfaz.getHabilidad_SW().setText(Integer.toString(this.ai.getP2().getHabilidad()));
        interfaz.getFuerza_SW().setText(Integer.toString(this.ai.getP2().getFuerza()));
        interfaz.getHp_SW().setText(Integer.toString(this.ai.getP2().getHp()));
        interfaz.getAgilidad_SW().setText(Integer.toString(this.ai.getP2().getAgilidad()));
    }
    
    public void clearStats(){
        interfaz.getObjeto_ST().setText("-");
        interfaz.getHabilidad_ST().setText("-");
        interfaz.getFuerza_ST().setText("-");
        interfaz.getHp_ST().setText("-");
        interfaz.getAgilidad_ST().setText("-");
        
        interfaz.getObjeto_SW().setText("-");
        interfaz.getHabilidad_SW().setText("-");
        interfaz.getFuerza_SW().setText("-");
        interfaz.getHp_SW().setText("-");
        interfaz.getAgilidad_SW().setText("-");
    }
    
    public void clearIcons(){
        interfaz.getCharacter_ST().setIcon(new ImageIcon(getClass().getResource("/ImagesAux/Cargando.png")));
        interfaz.getCharacter_SW().setIcon(new ImageIcon(getClass().getResource("/ImagesAux/Cargando.png")));
    }
    
    public void checkEmpty(){
        if(GVariables.getSStarTrek().getPrioridad1().getSize() == 0 && GVariables.getSStarTrek().getPrioridad2().getSize() == 0 && GVariables.getSStarTrek().getPrioridad3().getSize() == 0){
            int numP=(int) (Math.random()*19);
            int numO=(int) (Math.random()*9);
            GVariables.getSStarTrek().GenerateCharacter(GVariables.getStarTrek()[numP], GVariables.getObjetos()[numO],IdCh);
            IdCh++;            
        }
        
       if(GVariables.getSStarWars().getPrioridad1().getSize() == 0 && GVariables.getSStarWars().getPrioridad2().getSize() == 0 && GVariables.getSStarWars().getPrioridad3().getSize() == 0){
            int numP=(int) (Math.random()*19);
            int numO=(int) (Math.random()*9);
            GVariables.getSStarWars().GenerateCharacter(GVariables.getStarWars()[numP], GVariables.getObjetos()[numO],IdCh);
            IdCh++;    
        }
    }
    
    
    
}
