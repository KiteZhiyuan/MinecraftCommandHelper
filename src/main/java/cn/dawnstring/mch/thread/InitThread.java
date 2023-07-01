package cn.dawnstring.mch.thread;

import java.io.File;

public class InitThread extends Thread
{
    public void run()
    {
        File dir = new File("MCH");
        if (!dir.exists())
        {
            dir.mkdir();
        }
        this.interrupt();
    }
}
