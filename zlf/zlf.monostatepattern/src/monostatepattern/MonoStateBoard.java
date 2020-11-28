package monostatepattern;

public class MonoStateBoard {
    private static String MessageBoard;

    //Constructor
    public MonoStateBoard(){
        MessageBoard="";
    }

    //Message Getter
    public String GetMessage() {
        return MessageBoard;
    }

    //Message Setter
    public void SetMessage(String message) {
        MonoStateBoard.MessageBoard = message;
    }
}
