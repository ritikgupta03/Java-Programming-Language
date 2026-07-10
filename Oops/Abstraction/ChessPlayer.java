// This file should be named ChessPlayer.java

// Interface declaration
interface ChessPlayer {
    void play();        // abstract method
    void practice();    // abstract method
}

// Class that implements ChessPlayer
class Grandmaster implements ChessPlayer {
    public void play() {
        System.out.println("Grandmaster plays chess at top level!");
    }

    public void practice() {
        System.out.println("Grandmaster practices tactics daily.");
    }
}

class Amateur implements ChessPlayer {
    public void play() {
        System.out.println("Amateur plays chess for fun.");
    }

    public void practice() {
        System.out.println("Amateur practices occasionally.");
    }
}

// Main classl
public class ChessPlayer {
    public static void main(String[] args) {
        ChessPlayer player1 = new Grandmaster();
        ChessPlayer player2 = new Amateur();

        player1.play();
        player1.practice();

        player2.play();
        player2.practice();
    }
}
