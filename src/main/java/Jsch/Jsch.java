package Jsch;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.InputStream;

public class Jsch {
    public  static void connectAndExecute() {

        try {

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();

            Session session = jsch.getSession("cloudera", "192.168.81.128", 22);
            session.setPassword("cloudera");
            session.setConfig(config);
            session.connect();
            // System.out.println("Connected");

            Channel channel = session.openChannel("exec");
            ((ChannelExec) channel).setCommand("firefox --display:192.168.81.128:1");
            channel.setInputStream(null);
            ((ChannelExec) channel).setErrStream(System.err);

            InputStream in = channel.getInputStream();

            channel.connect();
            System.out.println("Connection sucessful");

            channel.disconnect();
            session.disconnect();
            // System.out.println("DONE");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void main(String args[]){
        //System.out.println(Jsch.connectAndExecute());
        Jsch.connectAndExecute();
    }
}
