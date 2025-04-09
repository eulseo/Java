package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        NetworkClientV2 client = new NetworkClientV2("http://example.com");
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
