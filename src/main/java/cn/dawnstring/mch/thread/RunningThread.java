package cn.dawnstring.mch.thread;

import cn.dawnstring.mch.view.MainFrame;

import java.io.IOException;

public class RunningThread extends Thread
{
    @Override
    public void run()
    {
        try
        {
            new MainFrame();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
