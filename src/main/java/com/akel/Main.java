package com.akel;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*JSch jsch = new JSch();
        Session session=jsch.getSession("Akel-Laptop", "RemoteHostName", 8080);
        session.setPassword("mindmind555");
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect();

        ChannelExec channel=(ChannelExec) session.openChannel("exec");
        BufferedReader in=new BufferedReader(new InputStreamReader(channel.getInputStream()));
        channel.setCommand("tree -f;");
        channel.connect();

        String msg=null;
        while((msg=in.readLine())!=null){
            System.out.println(msg);
        }

        channel.disconnect();
        session.disconnect();

         */
        System.out.println("Hello world!");
    }
}