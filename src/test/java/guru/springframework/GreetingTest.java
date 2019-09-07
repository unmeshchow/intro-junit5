package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before Class - I'm called only once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each ...");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each ...");
        greeting = null;
    }

    @Test
    void helloWorld() {
        System.out.println("Test ...");
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println("Test ...");
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterAll
    static void afterClass() {
        System.out.println("After Class - I'm also called only once!!!");
    }

}