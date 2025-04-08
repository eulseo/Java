package lang.nested.nested.ex2;

public class Network {

    public void SendMessage(String txt) {
        NetworkMessage networkMessage = new NetworkMessage(txt);
        networkMessage.print();
    }


    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

}
