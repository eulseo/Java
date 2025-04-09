package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data){
        NetworkClientV4 client = new NetworkClientV4("http://example.com");
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }

    }
}
