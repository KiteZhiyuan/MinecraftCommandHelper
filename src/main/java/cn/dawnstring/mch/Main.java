package cn.dawnstring.mch;

import cn.dawnstring.mch.thread.InitThread;
import cn.dawnstring.mch.thread.RunningThread;

public class Main
{
    public static void main(String[] args)
    {
        new RunningThread().start();
        new InitThread().start();
    }
}
