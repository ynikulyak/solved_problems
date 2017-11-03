package com.janenik.interview;
import java.net.InetAddress;

/**
 * Created by jane on 9/21/17.
 */
public class IPAddress  {

    public static void main(String[] args) throws Exception{

        InetAddress myIP = InetAddress.getLocalHost();
        myIP.getHostAddress();
    }
}
