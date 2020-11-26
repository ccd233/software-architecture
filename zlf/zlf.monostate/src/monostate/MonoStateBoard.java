package monostate;

public class MonoStateBoard {
    private static String MessageBoard;

    public MonoStateBoard(){
        MessageBoard="";
    }

    public String GetMessage() {
        return MessageBoard;
    }

    public void SetMessage(String message) {
        MonoStateBoard.MessageBoard = message;
    }
}
