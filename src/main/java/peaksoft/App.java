package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        System.out.println();

        Cat catOne = applicationContext.getBean("catBean", Cat.class);
        System.out.println("Name : " + catOne.getName());
        System.out.println("Color : " + catOne.getColor());

        System.out.println();

        Cat catTwo = applicationContext.getBean("catBean", Cat.class);
        System.out.println("Name : " + catTwo.getName());
        System.out.println("Color : " + catTwo.getColor());

        System.out.println();

        Boolean compare = catOne.equals(catTwo);
        System.out.println("Comparing two Cat Beans : " + compare);

        System.out.println(catOne);
        System.out.println(catTwo);

    }
}
