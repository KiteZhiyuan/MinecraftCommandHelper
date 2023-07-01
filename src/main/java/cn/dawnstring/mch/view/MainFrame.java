package cn.dawnstring.mch.view;

import cn.dawnstring.mch.i18n.LangReader;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainFrame extends JFrame
{
    private final int height = 500;
    private final int width = 800;
    public MainFrame() throws IOException
    {
        setTitle(LangReader.getLang("mainFrame.title"));

        Image icon=Toolkit.getDefaultToolkit().createImage(MainFrame.class.getResource("img.png"));

        setIconImage(icon);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(54, 54, 54));
        setSize(width, height);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        Container c = getContentPane();


    }
}
