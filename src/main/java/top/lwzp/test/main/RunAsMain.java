package top.lwzp.test.main;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class RunAsMain {
    public static void main(String[] args) throws IOException {
        testJackson();
    }

    private static void testJackson() throws IOException {
        File src = new File("E:\\tmp\\a");
        File dest = new File("E:\\tmp\\dest");
        System.out.println(FileUtils.byteCountToDisplaySize(1234564350));
        System.out.println(117 * 1024 * 1024);
        System.out.println(FileUtils.byteCountToDisplaySize(123456435 - 117 * 1024 * 1024));


//        List<String> list = FileUtils.readLines(new File("E:\\tmp\\a.txt"), "utf-8");
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            if (i>=4336531 && i<=4336541){
//                System.out.println("part 1");
//                FileUtils.write(new File("E:\\tmp\\1.txt"),list.get(i),"UTF-8",true);
//            } else if (i>=4336546 && i<=4336556){
//                System.out.println("part 2");
//                FileUtils.write(new File("E:\\tmp\\2.txt"),list.get(i),"UTF-8",true);
//            } else if (i>=4336561 && i<=4336571){
//                System.out.println("part 3");
//                FileUtils.write(new File("E:\\tmp\\3.txt"),list.get(i),"UTF-8",true);
//            } else if (i>=4336622 && i<=4336632){
//                System.out.println("part 4");
//                FileUtils.write(new File("E:\\tmp\\4.txt"),list.get(i),"UTF-8",true);
//            }
//        }
    }
}
