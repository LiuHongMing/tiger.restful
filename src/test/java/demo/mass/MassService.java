package demo.mass;

import com.tiger.restful.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

public class MassService {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-mvc.xml", "spring-dao.xml", "spring-app.xml");
        final UserService userService = cxt.getBean(UserService.class);
        final CountDownLatch doStart = new CountDownLatch(1);
        Runnable run = new Runnable() {
            @Override
            public void run() {
                String status = null;
                try {
                    doStart.await();
//                    User user = new User();
//                    user.setMobile("13691104030");
//                    user.setNick("测测测测测测");
//                    user.setPasswd("123456");
//                    user.setAddress("公测地址");
//                    status = userService.registerUser(user);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("---" + Thread.currentThread().getName() + ", status=" + status);
            }
        };
        for (int i = 0; i < 100; i++) {
            new Thread(run).start();
        }
        doStart.countDown();

        synchronized (MassService.class) {
            while (true) {
                MassService.class.wait();
            }
        }
    }

}
