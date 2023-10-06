import javax.swing.*;
public class Runner{
    public Runner(){
        VirtualPet p = new VirtualPet();
        p.exercise();
        takeBreak(1000);
        String ans = getResponse("How was your day?");
        System.out.println(ans);
        p.exercise();
        p.exercise();
        p.exercise();
        takeBreak(1000);
        p.sleep();

    }
    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            q,
            "Get a Response",
            JOptionPane.PLAIN_MESSAGE);
            return s;
    }
    public void takeBreak(int milliseconds){
         try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){}
    }
    public static void main(String[] args){
        new Runner();
    }
}