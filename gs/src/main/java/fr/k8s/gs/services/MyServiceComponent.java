package fr.k8s.gs.services;

import org.springframework.stereotype.Component;

@Component
public class MyServiceComponent {

    public MyServiceComponent() {

        System.out.println("K8S > MyServiceComponent > Constructor");
    }

}
