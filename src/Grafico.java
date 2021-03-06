
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guillermo
 */
public class Grafico extends javax.swing.JFrame{
    CustomPlayer g=new CustomPlayer();
    MetaDatos datos=new MetaDatos();
    
    
    
     //   MetaDatos m=new MetaDatos('/mnt/hgfs/Ubunto/03 Obsesionario en LA Mayor.mp3');
    
    private boolean sonar=false;
    private boolean sonando=true;
    private boolean terminar=false;
    /**
     * Creates new form Grafico
     */
    public Grafico() {
     //MetaDatos m=new MetaDatos();
     //this.m = new MetaDatos();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MegaRe = new javax.swing.JLabel();
        lDuracion = new javax.swing.JLabel();
        anno = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Album = new javax.swing.JLabel();
        Lsonar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Progreso = new javax.swing.JProgressBar();
        Foto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel1.setText("jLabel1");

        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mega Reproductor");
        setBackground(java.awt.Color.pink);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 255, 25));

        MegaRe.setBackground(new java.awt.Color(102, 102, 255));
        MegaRe.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        MegaRe.setText("Mega Reproductor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(MegaRe)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(MegaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lDuracion.setFont(new java.awt.Font("Abyssinica SIL", 0, 14)); // NOI18N
        lDuracion.setText("Duracion:");

        anno.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        anno.setText("Año:");

        Titulo.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        Titulo.setText("Titulo:");

        Album.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        Album.setText("Album:");

        Lsonar.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        Lsonar.setText("Artista:");

        jButton1.setText("Sonar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pausar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Progreso.setToolTipText("");
        Progreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Progreso.setName(""); // NOI18N

        Foto.setText("  ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Imagen del Album");

        jButton3.setText("Terminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Album, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButton1)
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Lsonar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(37, 37, 37)
                        .addComponent(Lsonar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Album, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(anno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (sonar && sonando==false){
            //Lsonar.setText("detenido");
            sonar=false;
            sonando=true;
            jButton2.setText("Reanudar");
            //            anno.setText(Boolean.toString(g.getPosition()));
            g.pause();
        }
        else{
            sonar=true;
            //Lsonar.setText(datos.getArtista());
            jButton2.setText("Pausar");
            g.resume();
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFileChooser seleccionar=new JFileChooser();
        FileNameExtensionFilter filtromp3=new FileNameExtensionFilter("Solo MP3","mp3");
        seleccionar.setFileFilter(filtromp3);
        String ruta;
        terminar=false;
        int seleccionado =seleccionar.showOpenDialog(null);
        try{
            File archivo = seleccionar.getSelectedFile();

            ruta = archivo.getAbsolutePath();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de mp3");
            return ;
        }
        g.setPath(ruta);
        if(sonando){
            datos.meta(ruta);
            sonando=false;
            sonar=true;
            g.play(-1);
        }else{

            JOptionPane.showMessageDialog(null, "la cancion esta sonando");

        }
        
        
        try{datos.guardarImagen();}
        catch(Exception e){
        
        }
        System.out.println(datos.getImagen());
        try{
            
            Lsonar.setText("Artista: "+datos.getArtista());
        }catch(Exception e){}
        try{
            Titulo.setText("Titulo: "+datos.getTitulo());
        }catch(Exception e){}
        try{
            Album.setText("Album: "+datos.getAlbum());
        }catch(Exception e){}
        try{
            anno.setText("Año: "+datos.getyear());
        }catch(Exception e){}
        try{
            
            lDuracion.setText("Duracion: "+Double.toString(datos.getduracion()/60)+" min");
        }catch(Exception e){}
        try{     
            if (datos.getImagen()!=null){
        
       ImageIcon icon =new ImageIcon(datos.getImagen());        
        Foto.setIcon(icon);
        icon=null;
        
            }
            else{
            Foto.setIcon(null);
            }
        }catch(Exception e){
        }
        new Thread(
            new Runnable(){
                @SuppressWarnings({"empty-statement", "SleepWhileInLoop"})
                @Override
                public void run(){
                    try{
                        double i=0;
                        int b=0;
                        int segundos=datos.getduracion();
                        //Progreso.setValue(0);
                        while(true){
                            /*if (terminar){
                                 Progreso.setValue(0);
                                break;}*/
                            while(sonar==true){
                                Progreso.setValue((int)i);

                                i= ((b*100)/segundos);//los 252 son segundos cuando logre
                                b++;//sacar la duracion del track en minotos se miltiplica por 60
                                //System.out.println(Progreso.getValue());
                                Thread.sleep(1000);
                                if (terminar){
                                 Progreso.setValue(0);
                                return;
                                //break;
                                 //Progreso.setValue(0);
                                 //Progreso.setValue(0);
                                 // return;
                                 } 
                                 
                                
                                if(Progreso.getValue()==100){
                                    Progreso.setValue(0);
                                    sonar = false;
                                    sonando=true;
                                    //Thread.interrupted();
                                    break;
                                }
                                if(sonar==false) {
                                    break;
                                 
                                }
                            }
                           Progreso.setValue((int)i);
                           if (i==100){
                           Progreso.setValue(0);
                           }
                        }

                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Ocurrio un error");
                    }

                }
            }
        ).start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try{
        sonando=true;
        sonar=false;
        Progreso.setValue(0);
        terminar=true;
        g.terminar();}
        catch(Exception e){}
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Album;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Lsonar;
    private javax.swing.JLabel MegaRe;
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JTextField Texto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel anno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDuracion;
    private javax.swing.JList lista;
    // End of variables declaration//GEN-END:variables
}
