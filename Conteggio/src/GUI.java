import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    private JFrame frame;
    private JLabel lblConta;
    private JButton start;
    private JButton stop;
    private JPanel btnPnl;
    private int nClicks=0;
    protected Counter counter;
    public GUI(){
        frame=new JFrame("CONTA");
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(600,600);
        btnPnl=new JPanel();
        btnPnl.setLayout(new FlowLayout());
        start=new JButton("Start");
        start.addActionListener(new Ascoltatore(this));
        stop=new JButton("Stop");
        stop.addActionListener(new Ascoltatore(this));
        lblConta=new JLabel("0",SwingConstants.CENTER);
        btnPnl.add(start);
        btnPnl.add(stop);
        frame.add(lblConta);
        frame.add(btnPnl);
        frame.setVisible(true);
    }
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getLblConta() {
        return lblConta;
    }

    public void setLblConta(String content) {
        lblConta.setText(content);
    }

    public JButton getStart() {
        return start;
    }

    public void setStart(String content) {
        start.setText(content);
    }

    public JButton getStop() {
        return stop;
    }

    public void setStop(JButton stop) {
        this.stop = stop;
    }

    public JPanel getBtnPnl() {
        return btnPnl;
    }

    public void setBtnPnl(JPanel btnPnl) {
        this.btnPnl = btnPnl;
    }

    public int getnClicks() {
        return nClicks;
    }

    public void setnClicks(int nClicks) {
        this.nClicks = nClicks;
    }


}
