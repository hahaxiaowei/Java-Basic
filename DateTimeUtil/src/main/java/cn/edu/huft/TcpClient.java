package cn.edu.huft;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by bobwang on 5/14/18.
 */
public class TcpClient {

    private String address;
    private int port;
    private int connectTO;
    private Socket client;
    private InputStream reader;
    private OutputStream writer;


    public TcpClient(String remoteAddr, int remotePort, int timeout) {
        address = remoteAddr;
        port = remotePort;
        connectTO = timeout;
    }

    public void connect() throws Exception {
        boolean bFailed = true;
        try {
            client = new Socket();
            client.connect(new InetSocketAddress(address, port), connectTO);

            reader = client.getInputStream();
            writer = client.getOutputStream();
            bFailed = false;
        } catch (Exception exp) {
            throw new RuntimeException(exp);
        } finally {
            if (bFailed) {
                shutdown();
            }
        }
    }

    public void shutdown() {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (Exception exp) {
        }

        try {
            if (writer != null) {
                writer.close();
            }
        } catch (Exception exp) {
        }

        reader = null;
        writer = null;

        try {
            if (client != null) {
                client.shutdownInput();
            }
        } catch (Exception exp) {
        }
        try {
            if (client != null) {
                client.shutdownOutput();
            }
        } catch (Exception exp) {
        }
        try {
            if (client != null) {
                client.close();
            }
        } catch (Exception exp) {
        }
        client = null;
    }

    public int post(byte[] request, byte[] resp) throws Exception {
        try {
            writer.write(request);
            return reader.read(resp);
        } catch (IOException exp) {
            throw new Exception(exp);
        }
    }

    public int get(byte[] response) throws Exception {
        try {
            return reader.read(response);
        } catch (IOException exp) {
            throw new Exception(exp);
        }
    }

}