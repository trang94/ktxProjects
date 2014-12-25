package GUI;


@SuppressWarnings("serial")
public class mainFrame extends javax.swing.JFrame {

    
    public mainFrame() {
        super("Quan Li KTX DHBKHN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        mPanel = new loginJpanel(mainFrame.this);
        add(mPanel);
        pack();
    }   
   
    @SuppressWarnings("unused")
	private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    private loginJpanel mPanel;
    
}
