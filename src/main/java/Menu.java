
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.*;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class Menu extends javax.swing.JFrame {
    Logger log = Logger.getLogger(Pass.class.getName());

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jDialog1 = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();


        jDialog1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDialog1FocusGained(evt);
            }
        });

        jButton2.setText("ДА");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Нет");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Вы хотитете выйти????");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(63, 63, 63))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                .addContainerGap(60, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Выход");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "Тип ТС", "Рабочие", "Свободные"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "Маршут", "Тип маршута", "Время работы маршута", "Длительность пути", "Итервал*", "Кол-во ТС*"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton4.setText("Загрузить");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Сохранить");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Помощь");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Расчет");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                )
                                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jDialog1.setSize(270, 160);
        log.info("Пользователь задумал уйти");
        jDialog1.setVisible(true);

    }

    private void jDialog1FocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jDialog1.setVisible(false);  // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);        // TODO add your handling code here:
        int column = 0;
        int row = 0;
        String value = jTable2.getModel().getValueAt(row, column).toString();
        System.out.print(value);
    }

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {

        // TODO add your handling code here:

    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        String buf;
        int AV, TR, TRAM;
        buf = jTable1.getModel().getValueAt(0, 1).toString();
        AV = Integer.parseInt(buf);
        buf = jTable1.getModel().getValueAt(1, 1).toString();
        TR = Integer.parseInt(buf);
        buf = jTable1.getModel().getValueAt(2, 1).toString();
        TRAM = Integer.parseInt(buf);

        int i;
        int dl;

        for (i = 0; i < 13; i++) {
            int TS = 0;
            String pr = "-", AVT = "AVT", TRO = "TRO", TRA = "TRA";
            buf = jTable2.getModel().getValueAt(i, 0).toString();
            if (pr.equals(buf)) i = 13;
            else {
                buf = jTable2.getModel().getValueAt(i, 3).toString();
                dl = Integer.parseInt(buf);
                buf = jTable2.getModel().getValueAt(i, 4).toString();
                int inter = Integer.parseInt(buf);
                TS = TS(dl, inter);
                buf = jTable2.getModel().getValueAt(i, 1).toString();
                if (AVT.equals(buf)) {
                    AV = kol(AV, TS);
                }
                if (TRO.equals(buf)) TR = kol(TR, TS);
                if (TRA.equals(buf)) TRAM = kol(TRAM, TS);
                jTable2.setValueAt(TS, i, 5);
            }
            jTable1.setValueAt(AV, 0, 2);
            jTable1.setValueAt(TR, 1, 2);
            jTable1.setValueAt(TRAM, 2, 2);

        }
        log.info("Расчеты произведены");
    }

    int kol(int a, int b) {
        a -= b;
        return a;
    }

    int TS(int dl, int t) {

        dl = dl * 2 / t;

        return dl;
    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        String[] subStr;
        String delimeter = " ";
        String s = "";
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                jTable1.setValueAt("-", i, j);
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 6; j++)
                jTable2.setValueAt("-", i, j);
        s = fin("D://TS.txt");
        subStr = s.split(delimeter);
        int y, j, i;
        for (y = 0, j = 0, i = 0; y < subStr.length; y++, j++) {
            jTable1.setValueAt(subStr[y], i, j);
            if (j == 2) {
                j = -1;
                i++;
            }
        }
        s = fin("D://MS.txt");
        subStr = s.split(delimeter);
        for (y = 0, j = 0, i = 0; y < subStr.length; y++, j++) {
            jTable2.setValueAt(subStr[y], i, j);
            if (j == 5) {
                j = -1;
                i++;
            }
        }
        log.info("Таблица загружена");
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        String s = "";
        int i = 0, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                String value = jTable1.getModel().getValueAt(i, j).toString();
                s += value;

                s += " ";

            }
            System.out.print(s);
            fou("D://TS.txt", s);
        }
        s = "";

        for (i = 0; i < 13; i++)
            for (j = 0; j < 6; j++) {
                String value = jTable2.getModel().getValueAt(i, j).toString();
                s += value;
                s += " ";
            }
        fou("D://MS.txt", s);
        log.info("Таблица сохранена");
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        String polomochka;
        int AV, AV2, TR, TRAM;
        String buf;

        buf = jTable1.getModel().getValueAt(0, 2).toString();
        AV = Integer.parseInt(buf);
        buf = jTable1.getModel().getValueAt(1, 2).toString();
        TR = Integer.parseInt(buf);
        buf = jTable1.getModel().getValueAt(2, 2).toString();
        TRAM = Integer.parseInt(buf);


        int i = jTable2.getSelectedRow();
        buf = jTable2.getModel().getValueAt(i, 1).toString();
        System.out.println(buf);
        if (buf.equals("AVT")) {
            if (AV > 0) {
                AV--;
                String buf2 = jTable1.getModel().getValueAt(0, 1).toString();
                AV2 = Integer.parseInt(buf2);
                AV2--;
                jTable1.setValueAt(AV2, 0, 1);
                jTable1.setValueAt(AV, 0, 2);
                log.info("Заменен автобус");
            }
        }
        if (AV == 0) {
            int dl, av;
            String buf2 = jTable2.getModel().getValueAt(i, 3).toString();
            dl = Integer.parseInt(buf2);
            System.out.println(dl);
            buf2 = jTable2.getModel().getValueAt(i, 5).toString();
            av = Integer.parseInt(buf2);
            System.out.println(av);
            av--;
            dl = dl * 2 / av;
            jTable2.setValueAt(dl, i, 4);
            jTable2.setValueAt(av, i, 5);
            buf2 = jTable1.getModel().getValueAt(0, 1).toString();
            av = Integer.parseInt(buf2);
            av--;
            jTable1.setValueAt(av, 0, 1);
            log.info("На маршуте увеличен интервал");
        }
        if (buf.equals("TRO")) {
            if (TR > 0) {
                TR--;
                String buf2 = jTable1.getModel().getValueAt(1, 1).toString();
                AV2 = Integer.parseInt(buf2);
                AV2--;
                jTable1.setValueAt(AV2, 1, 1);
                jTable1.setValueAt(TR, 1, 2);
                log.info("Заменен троллейбус");
            }
            if (TR == 0) {
                int dl, av;
                String buf2 = jTable2.getModel().getValueAt(i, 3).toString();
                dl = Integer.parseInt(buf2);
                System.out.println(dl);
                buf2 = jTable2.getModel().getValueAt(i, 5).toString();
                av = Integer.parseInt(buf2);
                System.out.println(av);
                av--;
                dl = dl * 2 / av;
                jTable2.setValueAt(dl, i, 4);
                jTable2.setValueAt(av, i, 5);
                buf2 = jTable1.getModel().getValueAt(1, 1).toString();
                av = Integer.parseInt(buf2);
                av--;
                jTable1.setValueAt(av, 1, 1);
                log.info("На маршуте увеличен интервал");
            }

        }
        if (buf.equals("TRA")) {
            if (TRAM > 0) {
                {
                    TRAM--;
                    String buf2 = jTable1.getModel().getValueAt(2, 1).toString();
                    AV2 = Integer.parseInt(buf2);
                    AV2--;
                    jTable1.setValueAt(AV2, 2, 1);
                    jTable1.setValueAt(TRAM, 2, 2);
                    log.info("Заменен трамвай");
                }
                if (TRAM == 0) {
                    int dl, av;
                    String buf2 = jTable2.getModel().getValueAt(i, 3).toString();
                    dl = Integer.parseInt(buf2);
                    System.out.println(dl);
                    buf2 = jTable2.getModel().getValueAt(i, 5).toString();
                    av = Integer.parseInt(buf2);
                    System.out.println(av);
                    av--;
                    dl = dl * 2 / av;
                    jTable2.setValueAt(dl, i, 4);
                    jTable2.setValueAt(av, i, 5);
                    buf2 = jTable1.getModel().getValueAt(2, 1).toString();
                    av = Integer.parseInt(buf2);
                    av--;
                    jTable1.setValueAt(av, 2, 1);
                    log.info("На маршуте увеличен интервал");
                }
            }
        }


    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        log.info("Пользователь на что-то надеется)))");
        new Help().setVisible(true);        // TODO add your handling code here:
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            TableModel model = jTable2.getModel();
            FileWriter csv = new FileWriter(new File("D://MS.csv"));

            for (int i = 0; i < model.getColumnCount(); i++) {
                csv.write(model.getColumnName(i) + ",");
            }

            csv.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    csv.write(model.getValueAt(i, j).toString() + ",");
                }
                csv.write("\n");
            }

            csv.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fou(String put, String s) {

        try (FileWriter writer = new FileWriter(put, false)) {
            writer.write(s);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public String fin(String s) {
        File f = new File(s);
        s = "";
        int b;

        int count = 0;
        try {
            FileInputStream is = new FileInputStream(f);
            while ((b = is.read()) != -1) {
                //c = (char)b;
                s += (char) b;
                count++;
            }
            is.close();
        } catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }


        return s;
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;

}
