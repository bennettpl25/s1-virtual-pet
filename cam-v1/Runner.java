import javax.swing.*;
public class Runner{
    public Runner(){
        VirtualPet p = new VirtualPet();
        takeBreak(1000);
        if (getResponse1() > 0){
            p.sad();
        }
        else{
            takeBreak(1000);
            p.houseFront();
            takeBreak(2000);
            if (getResponse2() == 0){p.basementEnding();takeBreak(2000);p.astonishment();takeBreak(2000); p.death();}
            else if (getResponse2() == 1){p.livingroom();
                
            }
        }

        }

    public int getResponse1(){
        Object[] options = {"Yes", "No"};
    int n = JOptionPane.showOptionDialog(new JFrame(), 
    "Would you like to explore the haunted house?",
    "Explore?",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);

    return n;
    }
    public int getResponse2(){
        Object[] options = {"Basement", "Living Room", "Bedroom"};
    int n = JOptionPane.showOptionDialog(new JFrame(), 
    "Where to?",
    "Explore?",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[2]);

    return n;
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