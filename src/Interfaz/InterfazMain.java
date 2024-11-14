/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author digio
 */

import Clases.Admin;
import Clases.Saga;
import Clases.AI;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;



public class InterfazMain extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMain
     */
    
    Saga starTrek = new Saga("Star Trek");
    Saga starWars = new Saga("Star Wars");
    AI ai = new AI();
    Admin admin = new Admin(ai);
    boolean iniciado = false;
    
    
    public InterfazMain() {
        initComponents();
         //this.g=new Global();
         GVariables.setSStarTrek(starTrek);
         GVariables.setSStarWars(starWars);
         admin.setInterfaz(this);
         ai.setInterfaz(this);
         this.setLocationRelativeTo(null); 
    }
    
    
    
    
    

    public JLabel getAgilidad_ST() {
        return Agilidad_ST;
    }

    public void setAgilidad_ST(JLabel Agilidad_ST) {
        this.Agilidad_ST = Agilidad_ST;
    }

    public JLabel getAgilidad_SW() {
        return Agilidad_SW;
    }

    public void setAgilidad_SW(JLabel Agilidad_SW) {
        this.Agilidad_SW = Agilidad_SW;
    }

    public JLabel getCargando_ST() {
        return Cargando_ST;
    }

    public void setCargando_ST(JLabel Cargando_ST) {
        this.Cargando_ST = Cargando_ST;
    }

    public JLabel getCharacter_SW() {
        return Character_SW;
    }

    public void setCharacter_SW(JLabel Character_SW) {
        this.Character_SW = Character_SW;
    }

    public JLabel getFuerza_ST() {
        return Fuerza_ST;
    }

    public void setFuerza_ST(JLabel Fuerza_ST) {
        this.Fuerza_ST = Fuerza_ST;
    }

    public JLabel getFuerza_SW() {
        return Fuerza_SW;
    }

    public void setFuerza_SW(JLabel Fuerza_SW) {
        this.Fuerza_SW = Fuerza_SW;
    }

    public JScrollPane getGanadores_Tabla() {
        return Ganadores_Tabla;
    }

    public void setGanadores_Tabla(JScrollPane Ganadores_Tabla) {
        this.Ganadores_Tabla = Ganadores_Tabla;
    }

    public JLabel getHabilidad_ST() {
        return Habilidad_ST;
    }

    public void setHabilidad_ST(JLabel Habilidad_ST) {
        this.Habilidad_ST = Habilidad_ST;
    }

    public JLabel getHabilidad_SW() {
        return Habilidad_SW;
    }

    public void setHabilidad_SW(JLabel Habilidad_SW) {
        this.Habilidad_SW = Habilidad_SW;
    }

    public JPanel getHp_ST() {
        return Hp_ST;
    }

    public void setHp_ST(JPanel Hp_ST) {
        this.Hp_ST = Hp_ST;
    }

    public JLabel getHp_SW() {
        return Hp_SW;
    }

    public void setHp_SW(JLabel Hp_SW) {
        this.Hp_SW = Hp_SW;
    }

    public JLabel getIA_Status() {
        return IA_Status;
    }

    public void setIA_Status(JLabel IA_Status) {
        this.IA_Status = IA_Status;
    }

    public JPanel getIS_Status() {
        return IS_Status;
    }

    public void setIS_Status(JPanel IS_Status) {
        this.IS_Status = IS_Status;
    }

    public JLabel getObjeto_ST() {
        return Objeto_ST;
    }

    public void setObjeto_ST(JLabel Objeto_ST) {
        this.Objeto_ST = Objeto_ST;
    }

    public JLabel getObjeto_SW() {
        return Objeto_SW;
    }

    public  void setObjeto_SW(JLabel Objeto_SW) {
        this.Objeto_SW = Objeto_SW;
    }

    public JScrollPane getPrioridad1_ST() {
        return Prioridad1_ST;
    }

    public void setPrioridad1_ST(JScrollPane Prioridad1_ST) {
        this.Prioridad1_ST = Prioridad1_ST;
    }

    public JScrollPane getPrioridad1_SW() {
        return Prioridad1_SW;
    }

    public void setPrioridad1_SW(JScrollPane Prioridad1_SW) {
        this.Prioridad1_SW = Prioridad1_SW;
    }

    public JScrollPane getPrioridad2_ST() {
        return Prioridad2_ST;
    }

    public void setPrioridad2_ST(JScrollPane Prioridad2_ST) {
        this.Prioridad2_ST = Prioridad2_ST;
    }

    public JScrollPane getPrioridad2_SW() {
        return Prioridad2_SW;
    }

    public void setPrioridad2_SW(JScrollPane Prioridad2_SW) {
        this.Prioridad2_SW = Prioridad2_SW;
    }

    public JScrollPane getPrioridad3_ST() {
        return Prioridad3_ST;
    }

    public void setPrioridad3_ST(JScrollPane Prioridad3_ST) {
        this.Prioridad3_ST = Prioridad3_ST;
    }

    public JScrollPane getPrioridad3_SW() {
        return Prioridad3_SW;
    }

    public void setPrioridad3_SW(JScrollPane Prioridad3_SW) {
        this.Prioridad3_SW = Prioridad3_SW;
    }

    public JScrollPane getRefuerzos_ST() {
        return Refuerzos_ST;
    }

    public void setRefuerzos_ST(JScrollPane Refuerzos_ST) {
        this.Refuerzos_ST = Refuerzos_ST;
    }

    public JScrollPane getRefuerzos_SW() {
        return Refuerzos_SW;
    }

    public void setRefuerzos_SW(JScrollPane Refuerzos_SW) {
        this.Refuerzos_SW = Refuerzos_SW;
    }

    public JLabel getResultado_Combate() {
        return Resultado_Combate;
    }

    public void setResultado_Combate(JLabel Resultado_Combate) {
        this.Resultado_Combate = Resultado_Combate;
    }

    public JPanel getST_Wins_Count() {
        return ST_Wins_Count;
    }

    public void setST_Wins_Count(JPanel ST_Wins_Count) {
        this.ST_Wins_Count = ST_Wins_Count;
    }

    public JLabel getSW_Wins_Count() {
        return SW_Wins_Count;
    }

    public void setSW_Wins_Count(JLabel SW_Wins_Count) {
        this.SW_Wins_Count = SW_Wins_Count;
    }

    public JSlider getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(JSlider Velocidad) {
        this.Velocidad = Velocidad;
    }

    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Prioridad1_SW = new javax.swing.JScrollPane();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Prioridad2_SW = new javax.swing.JScrollPane();
        jLabel21 = new javax.swing.JLabel();
        IS_Status = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        IA_Status = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Prioridad3_SW = new javax.swing.JScrollPane();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Refuerzos_SW = new javax.swing.JScrollPane();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Resultado_Combate = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Ganadores_Tabla = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Velocidad = new javax.swing.JSlider();
        ST_Wins_Count = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SW_Wins_Count = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Prioridad2_ST = new javax.swing.JScrollPane();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Prioridad3_ST = new javax.swing.JScrollPane();
        jLabel24 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Prioridad1_ST = new javax.swing.JScrollPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        Refuerzos_ST = new javax.swing.JScrollPane();
        jLabel25 = new javax.swing.JLabel();
        Hp_ST = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Objeto_ST = new javax.swing.JLabel();
        Habilidad_ST = new javax.swing.JLabel();
        Fuerza_ST = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Agilidad_ST = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Objeto_SW = new javax.swing.JLabel();
        Habilidad_SW = new javax.swing.JLabel();
        Fuerza_SW = new javax.swing.JLabel();
        Hp_SW = new javax.swing.JLabel();
        Agilidad_SW = new javax.swing.JLabel();
        Character_SW = new javax.swing.JLabel();
        Cargando_ST = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        FondoInterfaz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 780));
        setMinimumSize(new java.awt.Dimension(1200, 780));
        setPreferredSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("PRIORIDAD 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prioridad1_SW)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(3, 3, 3)
                .addComponent(Prioridad1_SW, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 350, 390, 80);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PRIORIDAD 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prioridad2_SW)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(2, 2, 2)
                .addComponent(Prioridad2_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 450, 390, 80);

        IS_Status.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IA STATUS");

        IA_Status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IA_Status.setForeground(new java.awt.Color(255, 255, 255));
        IA_Status.setText("Trabajando......");

        javax.swing.GroupLayout IS_StatusLayout = new javax.swing.GroupLayout(IS_Status);
        IS_Status.setLayout(IS_StatusLayout);
        IS_StatusLayout.setHorizontalGroup(
            IS_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IS_StatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(1212, 1212, 1212)
                .addComponent(IA_Status))
        );
        IS_StatusLayout.setVerticalGroup(
            IS_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IS_StatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IA_Status)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(IS_Status);
        IS_Status.setBounds(480, 630, 230, 80);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PRIORIDAD 3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prioridad3_SW)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Prioridad3_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(40, 550, 390, 80);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("REFUERZOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Refuerzos_SW)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(5, 5, 5)
                .addComponent(Refuerzos_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(40, 650, 390, 80);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RESULTADO:");

        Resultado_Combate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Resultado_Combate.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_Combate.setText("..................");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addComponent(Resultado_Combate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Resultado_Combate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(460, 100, 300, 50);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("GANADORES");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ganadores_Tabla)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ganadores_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(530, 300, 150, 210);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AJUSTE DE VELOCIDAD");

        Velocidad.setMajorTickSpacing(9);
        Velocidad.setMaximum(20);
        Velocidad.setMinimum(1);
        Velocidad.setMinorTickSpacing(1);
        Velocidad.setPaintLabels(true);
        Velocidad.setPaintTicks(true);
        Velocidad.setValue(10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(480, 540, 230, 80);

        ST_Wins_Count.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VICTORIAS");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("0");

        javax.swing.GroupLayout ST_Wins_CountLayout = new javax.swing.GroupLayout(ST_Wins_Count);
        ST_Wins_Count.setLayout(ST_Wins_CountLayout);
        ST_Wins_CountLayout.setHorizontalGroup(
            ST_Wins_CountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ST_Wins_CountLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );
        ST_Wins_CountLayout.setVerticalGroup(
            ST_Wins_CountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ST_Wins_CountLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(ST_Wins_CountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(ST_Wins_Count);
        ST_Wins_Count.setBounds(620, 30, 180, 40);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VICTORIAS");

        SW_Wins_Count.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SW_Wins_Count.setForeground(new java.awt.Color(255, 255, 255));
        SW_Wins_Count.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(SW_Wins_Count)
                .addGap(26, 26, 26))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(SW_Wins_Count, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(410, 30, 180, 40);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRIORIDAD 2");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prioridad2_ST)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(160, 160, 160))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prioridad2_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(760, 450, 410, 80);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("PRIORIDAD 3");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prioridad3_ST)
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel24)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prioridad3_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(760, 550, 410, 80);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRIORIDAD 1");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prioridad1_ST)
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel6)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(Prioridad1_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13);
        jPanel13.setBounds(760, 350, 410, 80);

        jPanel14.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("REFUERZOS");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Refuerzos_ST)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel25)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Refuerzos_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel14);
        jPanel14.setBounds(760, 650, 410, 80);

        Hp_ST.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Objeto:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Habilidad:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fuerza:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Hp:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Agilidad:");

        Objeto_ST.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Objeto_ST.setForeground(new java.awt.Color(255, 255, 255));
        Objeto_ST.setText("-");

        Habilidad_ST.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Habilidad_ST.setForeground(new java.awt.Color(255, 255, 255));
        Habilidad_ST.setText("-");

        Fuerza_ST.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Fuerza_ST.setForeground(new java.awt.Color(255, 255, 255));
        Fuerza_ST.setText("-");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("-");

        Agilidad_ST.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Agilidad_ST.setForeground(new java.awt.Color(255, 255, 255));
        Agilidad_ST.setText("-");

        javax.swing.GroupLayout Hp_STLayout = new javax.swing.GroupLayout(Hp_ST);
        Hp_ST.setLayout(Hp_STLayout);
        Hp_STLayout.setHorizontalGroup(
            Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Hp_STLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Hp_STLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Hp_STLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Objeto_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Hp_STLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(Habilidad_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Hp_STLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fuerza_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Hp_STLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Agilidad_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        Hp_STLayout.setVerticalGroup(
            Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Hp_STLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Objeto_ST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Habilidad_ST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Fuerza_ST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(Hp_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Agilidad_ST))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(Hp_ST);
        Hp_ST.setBounds(790, 140, 170, 200);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0, 95));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Objeto:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Habilidad:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fuerza:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hp:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Agilidad:");

        Objeto_SW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Objeto_SW.setForeground(new java.awt.Color(255, 255, 255));
        Objeto_SW.setText("-");

        Habilidad_SW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Habilidad_SW.setForeground(new java.awt.Color(255, 255, 255));
        Habilidad_SW.setText("-");

        Fuerza_SW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Fuerza_SW.setForeground(new java.awt.Color(255, 255, 255));
        Fuerza_SW.setText("-");

        Hp_SW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hp_SW.setForeground(new java.awt.Color(255, 255, 255));
        Hp_SW.setText("-");

        Agilidad_SW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Agilidad_SW.setForeground(new java.awt.Color(255, 255, 255));
        Agilidad_SW.setText("-");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Habilidad_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Agilidad_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(Objeto_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fuerza_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hp_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Objeto_SW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Habilidad_SW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Fuerza_SW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Hp_SW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Agilidad_SW))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel16);
        jPanel16.setBounds(240, 160, 180, 180);

        Character_SW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAux/Cargando.png"))); // NOI18N
        getContentPane().add(Character_SW);
        Character_SW.setBounds(60, 130, 160, 180);

        Cargando_ST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAux/Cargando.png"))); // NOI18N
        getContentPane().add(Cargando_ST);
        Cargando_ST.setBounds(1010, 160, 149, 149);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 720, 75, 23);

        FondoInterfaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAux/FondoInterfaz.gif"))); // NOI18N
        getContentPane().add(FondoInterfaz);
        FondoInterfaz.setBounds(0, 0, 1200, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(iniciado == false){
            iniciado = true;
            
            for (int i = 0; i < 20; i++) {
            int random=(int)(Math.random()*9);
            GVariables.getSStarTrek().GenerateCharacter(GVariables.getStarTrek()[i], GVariables.getObjetos()[random],admin.getIdCh());
            admin.setIdCh(admin.getIdCh()+1);
            random=(int)(Math.random()*9);
            GVariables.getSStarWars().GenerateCharacter(GVariables.getStarWars()[i], GVariables.getObjetos()[random],admin.getIdCh());
            admin.setIdCh(admin.getIdCh()+1);
            }
            JTextArea text1 = new JTextArea(49,49);
            JTextArea text2 = new JTextArea(49,49);
            JTextArea text3 = new JTextArea(49,49);
            JTextArea text4 = new JTextArea(49,49);
            text1.setText(GVariables.getSStarTrek().getPrioridad1().imprimir());
            text2.setText(GVariables.getSStarTrek().getPrioridad2().imprimir());
            text3.setText(GVariables.getSStarTrek().getPrioridad3().imprimir());
            text4.setText(GVariables.getSStarTrek().getRefuerzo().imprimir());
            getPrioridad1_ST().setViewportView(text1);
            getPrioridad2_ST().setViewportView(text2);
            getPrioridad3_ST().setViewportView(text3);
            getRefuerzos_ST().setViewportView(text4);
            
            JTextArea text5 = new JTextArea(49,49);
            JTextArea text6 = new JTextArea(49,49);
            JTextArea text7 = new JTextArea(49,49);
            JTextArea text8 = new JTextArea(49,49);
            text5.setText(GVariables.getSStarWars().getPrioridad1().imprimir());
            text6.setText(GVariables.getSStarWars().getPrioridad2().imprimir());
            text7.setText(GVariables.getSStarWars().getPrioridad3().imprimir());
            text8.setText(GVariables.getSStarWars().getRefuerzo().imprimir());
            getPrioridad1_SW().setViewportView(text5);
            getPrioridad2_SW().setViewportView(text6);
            getPrioridad3_SW().setViewportView(text7);
            getRefuerzos_SW().setViewportView(text8);
            
            

        
//            System.out.println("Prioridad 1 Cartoon");
//            Global.getCN().getPrioridad1().imprimir();
//
//            System.out.println("Prioridad 2 Cartoon");
//            Global.getCN().getPrioridad2().imprimir();
//
//            System.out.println("Prioridad 3 Cartoon");
//            Global.getCN().getPrioridad3().imprimir();
//
//            System.out.println("Prioridad 1 Nick");
//            Global.getNick().getPrioridad1().imprimir();
//
//            System.out.println("Prioridad 2 Nick");
//            Global.getNick().getPrioridad2().imprimir();
//
//            System.out.println("Prioridad 3 Nick");
//            Global.getNick().getPrioridad3().imprimir();
            
            this.Velocidad.setValue(10);
            admin.ai.setWaitingTime(((int)this.Velocidad.getValue())*1000);
            admin.start();
            //ia.start();
        }else{
            JOptionPane.showMessageDialog(null, "Ya la simulación empezó!");
        }      
               
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agilidad_ST;
    private javax.swing.JLabel Agilidad_SW;
    private javax.swing.JLabel Cargando_ST;
    private javax.swing.JLabel Character_SW;
    private javax.swing.JLabel FondoInterfaz;
    private javax.swing.JLabel Fuerza_ST;
    private javax.swing.JLabel Fuerza_SW;
    private javax.swing.JScrollPane Ganadores_Tabla;
    private javax.swing.JLabel Habilidad_ST;
    private javax.swing.JLabel Habilidad_SW;
    private javax.swing.JPanel Hp_ST;
    private javax.swing.JLabel Hp_SW;
    private javax.swing.JLabel IA_Status;
    private javax.swing.JPanel IS_Status;
    private javax.swing.JLabel Objeto_ST;
    private javax.swing.JLabel Objeto_SW;
    private javax.swing.JScrollPane Prioridad1_ST;
    private javax.swing.JScrollPane Prioridad1_SW;
    private javax.swing.JScrollPane Prioridad2_ST;
    private javax.swing.JScrollPane Prioridad2_SW;
    private javax.swing.JScrollPane Prioridad3_ST;
    private javax.swing.JScrollPane Prioridad3_SW;
    private javax.swing.JScrollPane Refuerzos_ST;
    private javax.swing.JScrollPane Refuerzos_SW;
    private javax.swing.JLabel Resultado_Combate;
    private javax.swing.JPanel ST_Wins_Count;
    private javax.swing.JLabel SW_Wins_Count;
    private javax.swing.JSlider Velocidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
