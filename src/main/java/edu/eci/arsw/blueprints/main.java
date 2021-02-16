package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.impl.InMemoryBlueprintPersistence;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main (String arg[]) throws BlueprintNotFoundException{
        ApplicationContext a= new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices b= a.getBean(BlueprintsServices.class);

        Point[] pts0=new Point[]{new Point(40, 40),new Point(15, 15),new Point(15,15),new Point(16,15),new Point(40,15),new Point(40,50)};
        Blueprint bp0=new Blueprint("Adriana", "perro",pts0);

        b.addNewBlueprint(bp0);

        Point[] pts=new Point[]{new Point(0, 0),new Point(10, 10)};
        Blueprint bp=new Blueprint("Johan", "gato",pts);

        b.addNewBlueprint(bp);

        System.out.println(b.getBlueprint("Adriana","perro").getPoints().size());
        System.out.println(b.getBlueprint("Johan","gato").getPoints().size());
    }
}
