import java.util.ArrayList;

public class JprofilerTest {

    byte[] bytes = new byte[1024*1024*10];

    public static void main(String[] args) {
        System.out.println("test");
        ArrayList<Object> list = new ArrayList<Object>();
        while (true) {
            list.add(new JprofilerTest());
        }
    }
}
