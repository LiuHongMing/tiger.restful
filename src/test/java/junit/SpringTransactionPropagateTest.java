package junit;

import com.tiger.restful.service.BookService;
import com.tiger.restful.service.ServiceFacade;
import com.tiger.restful.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/root-context.xml"})
public class SpringTransactionPropagateTest {

    @Autowired
    UserService userService;

    @Autowired
    BookService bookService;

    @Autowired
    ServiceFacade serviceFacade;

    @Test
    public void testAddUser() throws Exception {
        userService.addUser();
    }

    @Test
    public void testAddBook() throws Exception {
        bookService.addBook();
    }

    @Test
    public void testAddBookSpringPropagateMandatory() throws Exception {
        bookService.addBookSpringPropagateMandatory();
    }

    @Test
    public void testAddBookSpringPropagateSupports() throws Exception {
        bookService.addBookSpringPropagateSupports();
    }

    @Test
    public void testAddUserBook() throws Exception {
        serviceFacade.addUserBook();
    }

}
