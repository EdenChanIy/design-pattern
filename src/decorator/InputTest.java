package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/5 10:38
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("C:\\Users\\EdenChanIy\\Documents\\Workplace\\Idea\\design_pattern\\src\\decorator\\test.txt")));
            while((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
