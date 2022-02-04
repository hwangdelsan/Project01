import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//
public class Hello {
    private static final String CONSTANT = "String";
    private static final String TEST = "TEST";
    private static Scanner myScanner;
    private Object o;

    public Hello() {

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        // 這是單行註釋
        //region Description
        helloIdea();
        ArrayList list = new ArrayList();
        //endregion

        list.add(0,123);

        Demo demo = new Demo(list);

        Date date = new Date();

        System.out.println("list = "+ list);

    }

    private static void helloIdea() {
        System.out.println("hello, idea, 您好1");
        System.out.println("hello, idea, 您好2");
        System.out.println("hello, idea, 您好3");
        Date date = new Date();
    }

}

class Demo {
    private static final String CONSTANT = "String";
    private Object o;

    /**
     * Creates a new demo.
     *
     * @param o The object to demonstrate.
     */
    public Demo(Object o) {
        this.o = o;
        String s = CONSTANT + "Other";
        int i = 123;
        int um = 10;
    }

    public void fly(){
        String str = "FLY";
    }
}