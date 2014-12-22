package com.jtest.main;

public class jTestMain extends javax.swing.JPanel{

/**
 * 
 */
private static final long serialVersionUID = 1L;

public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
        @SuppressWarnings("deprecation")
		public void run() {
            javax.swing.JFrame frame = new javax.swing.JFrame("This is jTest1!");
            frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            //frame.getContentPane().add(new String("Hej this is jTest!"), paintingChild);
          
            frame.pack();
            frame.setVisible(true);
        }
    });
}

}
