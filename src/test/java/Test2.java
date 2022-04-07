import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test2 {

    @Test
    public void  test1(){
        System.out.println("1");
    }

    @Test
    public void test2(){
        System.out.println("2");
    }


    @Before
    public void before() {
        System.out.println("before");
    }
    @After
    public void After() {
        System.out.println("after");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    };

    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass");
    };

}
