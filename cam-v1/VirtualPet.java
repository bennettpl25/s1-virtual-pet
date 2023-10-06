/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    private int hunger = 0;   // how hungry the pet is.
    private int tiredness = 0;
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
        hungerStarve();
    }
    
    public void exercise() {
        hunger = hunger + 5;
        tiredness = tiredness + 2;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
        if(tiredness < 4){
            face.setMessage("That was great!");
            face.setImage("ecstatic");
        }
        hungerStarve();
    }
    
    public void sleep() {
        hunger = hunger + 1;
        tiredness = 0;
        face.setImage("asleep");
        hungerStarve();
    }
    public void hungerStarve(){
        if (hunger > 20){
            if (hunger > 30){
                face.setMessage("I'm really hungry");
                face.setImage("starving");
            }
            else{
                face.setMessage("I'm hungry");
                face.setImage("hungry");
            }
    }

}
} // end Virtual Pet
