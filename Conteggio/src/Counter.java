public class Counter extends Thread{
    private int time;
    private GUI c;
    public Counter(GUI c){
        this.c=c;
        time=0;
    }
    @Override
    public void run() {
        while(c.getStart().isEnabled()){
            time+=1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            c.setLblConta(String.valueOf(time));
        }

    }
}
