package com.akel;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

       /* String URL1="/home/akel/test";
        String command = "find "+URL1 +" -printf \"%TY-%Tm-%Td\\t%s\\t%p\\n\" \n";


        SshClient client = SshClient.setUpDefaultClient();
        client.start();

        try (ClientSession session = client.connect("akel", "ec2-18-189-1-12.us-east-2.compute.amazonaws.com", 22)
                .verify(30, TimeUnit.SECONDS).getSession()) {
            session.addPasswordIdentity("akelakel");
            session.auth().verify(30, TimeUnit.SECONDS);

            try (ByteArrayOutputStream responseStream = new ByteArrayOutputStream();
                 ClientChannel channel = session.createChannel(Channel.CHANNEL_SHELL)) {
                channel.setOut(responseStream);
                try {
                    channel.open().verify(30, TimeUnit.SECONDS);
                    try (OutputStream pipedIn = channel.getInvertedIn()) {
                        pipedIn.write(command.getBytes());
                        pipedIn.flush();
                    }

                    channel.waitFor(EnumSet.of(ClientChannelEvent.CLOSED),
                            TimeUnit.SECONDS.toMillis(30));
                    String responseString = responseStream.toString();

                    System.out.println(responseString);

                } finally {
                    channel.close(false);
                }
            }
        } finally {
            client.stop();
        }  */



        if(args[0]=="aa")
        {
            System.out.println("aa");
        }
        if(args[0]=="bb")
        {
            System.out.println("bb");
        }

    }




}
