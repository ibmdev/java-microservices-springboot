package fr.k8s.gs;

import fr.k8s.gs.services.MyServiceComponent;
import fr.k8s.utils.MyUtilityComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyMainComponent {

    private final MyServiceComponent myServiceComponent;
    private final MyUtilityComponent myUtilityComponent;

    @Autowired
    public MyMainComponent( MyServiceComponent myServiceComponent, MyUtilityComponent myUtilityComponent) {
        this.myServiceComponent = myServiceComponent;
        this.myUtilityComponent = myUtilityComponent;
        System.out.println("K8S > MyMainComponent > Constructor");

    }
}
