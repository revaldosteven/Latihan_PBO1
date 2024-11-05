package tampilan;

import javax.swing.table.DefaultTableModel;
import kelas.category;
import kelas.product;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Revaldo
 */
public class FrameProduct extends javax.swing.JFrame {

    /**
     * Creates new form FrameProduct
     */
    public FrameProduct() {
        initComponents();
        loadTable();
        reset();
        comboBox();
    }
    
    void loadTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID PRODUK");
        model.addColumn("PRODUK");
        model.addColumn("DESKRIPSI");
        model.addColumn("HARGA");
        model.addColumn("KATEGORI");
        
        try {
            product pro = new product();
            ResultSet data = pro.tampilProduk();
            
            while(data.next()){
                model.addRow(new Object[]{
                data.getString("ID"),
                data.getString("Nama"),
                data.getString("Deskripsi"),
                data.getString("Harga"),
                data.getString("Kategori"),
                });
                
            }
            
        } catch (SQLException sQLException) {
            
        }
        
        tProduct.setModel(model);
    }
    
    void reset(){
        autoID();
        tID.setEditable(true);
        tDesk.setText(null);
        tHarga.setText(null);
        cKategori.setSelectedItem(null);
        tNama.setText(null);
    }
    
    void comboBox(){
        
        try {
            category cat = new category();
            ResultSet data = cat.tampilComBox();
            
            while(data.next()){
                String isi = data.getString("category_name");
                cKategori.addItem(isi);
            }
            
        } catch (SQLException ex) {
            
        }
        
    }
    
        void autoID(){
        
        try {
            product pro = new product();
            ResultSet id = pro.autoID();
            
            if(id.next()){
                int auto = id.getInt("ID") + 1;
                tID.setText(String.valueOf(auto));
            } else {
                tID.setText("1");
            }
            
            
        } catch (SQLException sQLException) {
        }        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDesk = new javax.swing.JTextArea();
        j = new javax.swing.JLabel();
        tHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cKategori = new javax.swing.JComboBox<>();
        bTambah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel4.setText("Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel3.setText("Deskripsi");

        tDesk.setColumns(20);
        tDesk.setRows(5);
        jScrollPane2.setViewportView(tDesk);

        j.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        j.setText("Harga");

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel5.setText("Kategori");

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(j)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bHapus)
                                .addGap(18, 18, 18)
                                .addComponent(bUbah))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j)
                    .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bHapus)
                    .addComponent(bUbah))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));

        tProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProduct);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        try {
            product pro = new product();
            category cat = new category();
            pro.setProduct_id(Integer.parseInt(tID.getText()));
            pro.setProduct_name(tNama.getText());
            pro.setProduct_desc(tDesk.getText());
            pro.setProduct_price(Integer.parseInt(tHarga.getText()));
            cat.setCategory_name(cKategori.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                pro.setProduct_cat_id(Integer.parseInt(isi));
            }
            pro.tambahProduk();
        } catch (SQLException sQLException) {
            System.out.println("data tidak masuk");
        }
        loadTable();
        reset();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            product pro = new product();
            pro.setProduct_id(Integer.parseInt(tID.getText()));
            pro.hapusProduk();
        } catch (SQLException sQLException) {
        }

        reset();
        loadTable();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            product pro = new product();
            category cat = new category();
            pro.setProduct_id(Integer.parseInt(tID.getText()));
            pro.setProduct_name(tNama.getText());
            pro.setProduct_desc(tDesk.getText());
            pro.setProduct_price(Integer.parseInt(tHarga.getText()));
            cat.setCategory_name(cKategori.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                pro.setProduct_cat_id(Integer.parseInt(isi));
            }
            pro.ubahProduk();
        } catch (SQLException sQLException) {
            System.out.println("data tidak masuk");
        }
        loadTable();
        reset();
    }//GEN-LAST:event_bUbahActionPerformed

    private void tProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductMouseClicked
        int baris = tProduct.rowAtPoint(evt.getPoint());
        String productID = tProduct.getValueAt(baris, 0).toString();
        String productName = tProduct.getValueAt(baris, 1).toString();
        String productDesc = tProduct.getValueAt(baris, 2).toString();
        String productPrice = tProduct.getValueAt(baris, 3).toString();
        String productCat = tProduct.getValueAt(baris, 4).toString();

        tID.setText(productID);
        tID.setEditable(false);
        tNama.setText(productName);
        tDesk.setText(productDesc);
        tHarga.setText(productPrice);
        cKategori.setSelectedItem(productCat);
    }//GEN-LAST:event_tProductMouseClicked

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
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cKategori;
    private javax.swing.JLabel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tDesk;
    private javax.swing.JTextField tHarga;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tNama;
    private javax.swing.JTable tProduct;
    // End of variables declaration//GEN-END:variables
}
