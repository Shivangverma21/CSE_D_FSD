interface Playable {
    void play();
}
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the guitar");
    }
}
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}
public class ins {
    public static void main(String[] args) {
        Playable[] instruments = { new Guitar(), new Piano() };
        
        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}



