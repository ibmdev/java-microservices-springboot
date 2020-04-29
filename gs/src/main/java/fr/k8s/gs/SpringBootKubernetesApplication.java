package fr.k8s.gs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"fr.k8s.gs","fr.k8s.utils"})
public class SpringBootKubernetesApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  SpringApplication.run(SpringBootKubernetesApplication.class, args);
		/*for (String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}

}
