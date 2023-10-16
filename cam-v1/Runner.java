import javax.swing.*;
public class Runner{
    public Runner(){
        VirtualPet p = new VirtualPet();
        takeBreak(2000);
        if (getResponse1() > 0){
            p.sad();
        }
        else{
            takeBreak(2000);
            p.houseFront();
            takeBreak(2000);
            int gr2 = getResponse2();
            if (gr2 == 0){p.basementEnding();takeBreak(2000);p.astonishment();takeBreak(2000); p.death();}
            if (gr2 == 1){p.livingroom();
                takeBreak(2000);
                int gr3 = getResponse3(); 
                if (gr3 == 0){p.closetHole(); takeBreak(2000); int gr4 = getResponse4(); 
                    if(gr4 == 0){p.closetJump(); takeBreak(2000); p.death();}
                    if(gr4 == 1){p.closetDontJump(); takeBreak(2000); p.astonishment(); takeBreak(2000); p.closetMonster(); takeBreak(2000); p.death();}
            }
            if (gr3 == 1){p.nothing(); takeBreak(2000); p.astonishment(); takeBreak(1000); p.livingMonster(); takeBreak(1000); p.death();
            }
            }
            if (gr2 == 2){p.bedroom(); takeBreak(2000); int gr5 = getResponse5();
                if (gr5 == 0){
                    takeBreak(2000); p.tired(); takeBreak(2000); p.money(); takeBreak(2000);
                    int gr6 = getResponse6();
                    if (gr6 == 0){p.moneyUp();}
                }
            p.leave(); takeBreak(2000); p.irs(); takeBreak(2000); p.irsconfront(); takeBreak(3000); p.irsdie(); takeBreak(5000); p.winloss();

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

    public int getResponse3(){
        Object[] options = {"Search Closet", "Don't Search Closet"};
    int n = JOptionPane.showOptionDialog(new JFrame(), 
    "Search Closet?",
    "Livingroom",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);

    return n;
    }
    public int getResponse4(){
        Object[] options = {"Jump in Hole", "Don't Jump in Hole"};
    int n = JOptionPane.showOptionDialog(new JFrame(), 
    "Jump in Hole?",
    "Closet",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);

    return n;
    }
    public int getResponse5(){
        Object[] options = {"Sleep in Bed", "Don't Sleep in Bed"};
    int n = JOptionPane.showOptionDialog(new JFrame(), 
    "Sleep?",
    "Bedroom",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);

    return n;
    }

    public int getResponse6(){
        Object[] options = {"Take Money", "Don't Take Money"};
    int n = JOptionPane.showOptionDialog(new JFrame(), 
    "Money?",
    "Bedroom",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);

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