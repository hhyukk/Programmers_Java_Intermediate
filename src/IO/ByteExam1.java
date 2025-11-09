package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/날짜와_시간/TimeExam.java");
            fos = new FileOutputStream("byte.txt");

            int readData = -1;
            while ((readData = fis.read()) != -1) {
                fos.write(readData);

            }

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            fis.close();
        }
    }
}
