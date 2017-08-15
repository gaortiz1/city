package com.bigeye.city.repositories;

import com.bigeye.city.domain.entities.Intersection;
import com.bigeye.city.domain.entities.Street;
import com.bigeye.city.domain.enums.TypeStreet;
import com.bigeye.neo4j.context.Neo4jContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Stream;

@Ignore
public class TestIntersectionRepository {

    private IntersectionRepository intersectionRepository;

    @Before
    public void setUp() {
        this.intersectionRepository = new IntersectionRepository(new Neo4jContext().getSession());
    }

    @Test
    public void shouldSave() {

        final Intersection bolivarAndVenezuela = new Intersection();
        bolivarAndVenezuela.setId(UUID.randomUUID());
        bolivarAndVenezuela.setName("bolivar y venezuela");
        bolivarAndVenezuela.setIncomingStreets(new ArrayList<>());
        bolivarAndVenezuela.setOutgoingStreets(new ArrayList<>());

        final Intersection garciaMorenoAndBolivar = new Intersection();
        garciaMorenoAndBolivar.setIncomingStreets(new ArrayList<>());
        garciaMorenoAndBolivar.setOutgoingStreets(new ArrayList<>());
        garciaMorenoAndBolivar.setId(UUID.randomUUID());
        garciaMorenoAndBolivar.setName("bolivar y garcia moreno");

        final Intersection rocafuerteAndVenezuela = new Intersection();
        rocafuerteAndVenezuela.setIncomingStreets(new ArrayList<>());
        rocafuerteAndVenezuela.setOutgoingStreets(new ArrayList<>());
        rocafuerteAndVenezuela.setId(UUID.randomUUID());
        rocafuerteAndVenezuela.setName("rocafuerte y Venezuela");


        Street simonBolivar = new Street();
        simonBolivar.setType(TypeStreet.STREET);
        simonBolivar.setStar(garciaMorenoAndBolivar);
        simonBolivar.setEnd(bolivarAndVenezuela);
        simonBolivar.setId(UUID.randomUUID());
        simonBolivar.setName("Simon Bolivar");


        Street venezuela = new Street();
        venezuela.setType(TypeStreet.STREET);
        venezuela.setStar(rocafuerteAndVenezuela);
        venezuela.setEnd(bolivarAndVenezuela);
        venezuela.setId(UUID.randomUUID());
        venezuela.setName("venezuela");

//        Street garciaMoreno = new Street();
//        garciaMoreno.setStar(rocafuerteAndVenezuela);
//        garciaMoreno.setId(UUID.randomUUID());
//        garciaMoreno.setName("venezuela");

        bolivarAndVenezuela.getIncomingStreets().add(simonBolivar);
        bolivarAndVenezuela.getIncomingStreets().add(venezuela);

//        rocafuerteAndVenezuela.getOutgoingStreets().add(simonBolivar);
//        rocafuerteAndVenezuela.getOutgoingStreets().add(garciaMoreno);
        this.intersectionRepository.create(bolivarAndVenezuela, 3);
    }

}
