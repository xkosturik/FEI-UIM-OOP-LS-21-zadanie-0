package sk.stuba.fei.uim.oop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void helloWorld() {
        Zadanie0.main(new String[0]);
        assert out.toString().startsWith("Hello world");
    }

    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
    }

}
