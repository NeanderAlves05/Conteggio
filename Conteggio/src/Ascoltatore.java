import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ascoltatore implements ActionListener {
    GUI c;
    public Ascoltatore(GUI c){
        this.c=c;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Start":
                c.setnClicks(c.getnClicks()+1);
                c.counter=new Counter(c);
                c.setLblConta("0");
                c.counter.start();
                c.setStart("Re-start");
                break;
            case "Stop":
                c.setnClicks(c.getnClicks()+1);
                c.setStart("Start");
                c.counter.stop();
                break;
            case "Re-start":
                c.counter.stop();
                c.counter=new Counter(c);
                c.setLblConta("0");
                c.counter.start();
                break;

        }
    }
}
