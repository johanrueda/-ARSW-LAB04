package edu.eci.arsw.blueprints.filter;

import edu.eci.arsw.blueprints.model.Blueprint;

import java.util.Set;

public interface BluePrintFilter {

    Blueprint filter(Blueprint blueprint);

    Set<Blueprint> filter(Set<Blueprint> bluePrints);
}
