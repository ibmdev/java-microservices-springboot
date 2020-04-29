package fr.k8s.utils;

import org.springframework.stereotype.Component;

@Component
public class MyUtilityComponent {

    public MyUtilityComponent() {

        System.out.println("K8S > MyUtilityComponent > Constructor");
    }
}
