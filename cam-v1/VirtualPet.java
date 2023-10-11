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
    
    public void astonishment(){
        face.setImage("astonished");
    }
    public void sad(){
        face.setMessage("I hate you, you're no fun");
        face.setImage("verysad");
    }
    public void houseFront(){
        face.setMessage("Wowee! Scary! Gee willakers! I can't wait to explore!");
        face.setImage("hauntedhouse");
    }
    public void death(){
        face.setMessage("You are Dead");
        face.setImage("skeleton");
    }
    public void basementEnding(){
        face.setMessage("Wow! So SCARY!!!!!! AAAA!!!!");
        face.setImage("basement");
        }
        public void livingroom(){
            face.setMessage("Yonkers! What a very creepy scary living room! Oh look, a very suspucious closet!");
            face.setImage("shocked");
        }
}
 // end Virtual Pet
