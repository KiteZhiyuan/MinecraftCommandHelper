package cn.dawnstring.mch.i18n;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LangReader
{
    public static String getLang(String key) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("./MCH/lang/zh_cn.lang")));
        Properties properties = new Properties();
        properties.load(bufferedReader);
        String value = properties.getProperty(key);
        return value;
    }
}
