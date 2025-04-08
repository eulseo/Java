package lang.nested.nested.ex1;

public class Network {

    public void SendMessage(String txt) {
        NetworkMessage networkMessage = new NetworkMessage(txt);
        networkMessage.print();
    }
}
