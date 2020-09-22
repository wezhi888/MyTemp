package top.lwzp.test.main;

import org.apache.commons.lang.StringUtils;

import java.io.IOException;

public class RunAsMain {
    public static void main(String[] args) throws IOException {
        testJackson();
    }

    private static void testJackson() throws IOException {
        String str = "";
        System.out.println(StringUtils.length(str));
    }
}
