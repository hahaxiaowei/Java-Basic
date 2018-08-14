package cn.hfut.edu.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by SunWei
 * Date: 2018-08-14
 * time: 22:50
 */
public class Client {

    private Socket clientSocket;

    private String address;

    private int port;

    private int timeOut;

    private InputStream reader;

    private OutputStream writer;

    public Client(String address, int port, int timeOut) {
        this.address = address;
        this.port = port;
        this.timeOut = timeOut;
    }

    public void connect() {

        boolean failed = false;
        try {
            clientSocket = new Socket(address, port);

            clientSocket.setSoTimeout(timeOut);

            reader = clientSocket.getInputStream();

            writer = clientSocket.getOutputStream();

            failed = true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (!failed) {
                shutDown();
            }
        }
    }

    public void shutDown() {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            if (writer != null) {
                writer.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        reader = null;
        writer = null;

        try {
            clientSocket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getData(byte[] data) {
        try {
            return reader.read(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
