import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat beenCat = (Cat) applicationContext.getBean("cat");
        Cat beenCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Hello Words equal - " + (bean == bean2));
        System.out.println("Cats equal - " + (beenCat == beenCat2));

    }
}