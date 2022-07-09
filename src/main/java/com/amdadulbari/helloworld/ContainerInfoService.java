package com.amdadulbari.helloworld;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class ContainerInfoService {
    public String getContainerInfo() {
        String hostName = "";
        try {
            hostName=InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName;
    }

}
