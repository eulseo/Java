package exception.ex3;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkServiceV3_1 {

    public void sendMessage(String data){
        NetworkClientV3 client = new NetworkClientV3("http://example.com");
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV4 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (SendExceptionV4 e) {
            System.out.println("[전송 오류] 주소 : " + e.getSendData() + ", 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
