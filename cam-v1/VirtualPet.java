/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    private boolean money;
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
        face.setMessage("You Died");
        face.setImage("skeleton");
    }
    public void basementEnding(){
        face.setMessage("Wow! So SCARY!!!!!! AAAA!!!!");
        face.setImage("basement");
        }
        public void livingroom(){
            face.setMessage("Yonkers! What a very creepy scary living room! Oh look, a very suspucious closet!");
            face.setImage("livingroom");
        }
        public void closetHole(){
            face.setMessage("wow, a cool hole in the floor? I wanna jump in!");
            face.setImage("closet");
        }
        public void closetJump(){
            face.setMessage("AAAAAAAAAAAAAAAHHH");
            face.setImage("shocked");
        }
        public void closetDontJump(){
            face.setMessage("I probably shouldn't jump. I'll just turn around...");
            face.setImage("happy");
        }
        public void closetMonster(){
            face.setImage("cl_monster");
        }
        public void livingMonster(){
            face.setImage("lrmonster");
        }
        public void nothing(){
            face.setMessage("Wow, there's absolutely nothing in this room");
            face.setImage("sad");
        }
        public void bedroom(){
            face.setMessage("Wowzers, pretty normal bedroom. I'm really tired, I think I want to sleep");
            face.setImage("bedroom");
        }
        public void tired(){
            face.setImage("tired");
            face.setMessage("YAWN");
        }
        public void money(){
            face.setImage("ecstatic");
            face.setMessage("I feel something... OH! It's a ton of CASH!");
        }
        public void moneyUp(){
            money = true;
        }
        public void leave(){
            face.setMessage("Well, I guess there's nothing else to see. Time to leave.");
            face.setImage("normal");
        }
        public void irs(){
            face.setMessage("Oh NO! A monster!!!!!!!");
            face.setImage("astonished");
        }
        public void irsconfront(){
            face.setMessage("You're behind on your taxes, bucko...");
            face.setImage("deviousirs");
        }
        public void irsdie(){
            if (money == false){
                face.setMessage("You Died");
                face.setImage("skeleton");
            }
            if (money == true){
                face.setMessage("Oh man... I just lost all the money I just found...");
                face.setImage("verysad");
            }
        }
        public void winloss(){
            if (money == true){
                face.setMessage("You Survived!");
                face.setImage("trophy");
            }
        }

}
 // end Virtual Pet
