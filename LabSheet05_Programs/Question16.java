/* Standalone Java solution for Question 16: Smartphone Interfaces */
public class Question16 {
    interface Camera16 { void takePhoto(); }
    interface MusicPlayer16 { void playMusic(); }
    static class Smartphone16 implements Camera16, MusicPlayer16 {
            @Override public void takePhoto() { System.out.println("Photo taken."); }
            @Override public void playMusic() { System.out.println("Playing music."); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 16: Smartphone Interfaces ===");
                Smartphone16 phone = new Smartphone16(); phone.takePhoto(); phone.playMusic();
            
    }
}
