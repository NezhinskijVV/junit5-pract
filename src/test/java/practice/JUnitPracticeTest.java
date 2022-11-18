package practice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.buttonone.model.BookOld;

@Disabled
public class JUnitPracticeTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

//    @BeforeEach
//    public void beforeEach(){
//        System.out.println("Before Each");
//    }

    @Test
    public void simpleTest(){
        System.out.println("simpleTest");
    }

    @RepeatedTest(5)
    public void repeatedTest(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }

    @ParameterizedTest
    @ValueSource(strings = {"first", "second", "third"})
    public void parameterizedTest(String str){
        System.out.println(str);
    }

    @ParameterizedTest
    @ValueSource(strings = {"The Wizard of OZ"})
    public void parameterizedBookTest(BookOld book){
        System.out.println(book.getName());
    }


//    @AfterEach
//    public void afterEach(){
//        System.out.println("After Each");
//    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }
}