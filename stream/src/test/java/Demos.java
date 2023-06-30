import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**

 */
class Demos {

    /**
     * 文件输入流
     */
    @Test
    void fileInputStreamDemo() {
        File file = new File("stream-practise.txt");
        try {
            boolean b = file.createNewFile();
            if (b) {
                System.out.println(file.getName() + "文件创建成功");
            } else {
                System.out.println(file.getName() + "文件已经存在");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while (i != -1) {
                // 将int类型转化成char类型，让后逐个将字符打印到控制台
                System.out.print((char) i);
                // read()方法会自动读取下一个字节
                i = fileInputStream.read();
            }
            // 关闭流防止内存泄漏
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 操作完成后，会在控制台打印指定目录下的字符串（只限ASCII码）
    }

    /**
     * BufferedOutputStreamDemo依托于其他OutputStream
     * 将OutputStream传入BufferedOutputStream用于改善OutputStream性能
     * 暂不清楚具体BufferedInputStream如何提高性能
     * 这个demo只写了BufferedInputStream的使用方法
     */
    @Test
    void bufferedOutputStreamDemo() {
        File file = new File("stream-practise.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String content = "hello, stream :-)";
        // 查找文件
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(content.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
            bufferedOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 作用和BufferedOutputStream相同
     */
    @Test
    void bufferedInputStreamDemo() {
        File file = new File("stream-practise.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i != -1) {
                // 将int类型转化成char类型，让后逐个将字符打印到控制台
                System.out.print((char) i);
                // read()方法会自动读取下一个字节
                i = bufferedInputStream.read();
            }
            fileInputStream.close();
            bufferedInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * FileWriter
     */
    @Test
    void fileWriterDemo() {
        File file = new File("stream-practise.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String content = "通过FileWriter写入的文本";
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * FileReader
     */
    @Test
    void fileReaderDemo() {
        File file = new File("stream-practise.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileReader fileReader = new FileReader(file);
            int i = fileReader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * bufferedWriter
     */
    // TODO
    /**
     * bufferedReader
     */
    // TODO

    /**
     * InputStreamWriter
     */
    // TODO
    /**
     * OutputStreamRreader
     */
    // TODO

}
