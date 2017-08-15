package com.bigeye.city.repositories;

import com.bigeye.city.domain.entities.Intersection;
import com.bigeye.city.domain.interfaces.IIntersectionRepository;
import com.bigeye.neo4j.repositories.AbstractNeo4jRepository;
import org.neo4j.ogm.session.Session;

public class IntersectionRepository extends AbstractNeo4jRepository<Intersection> implements IIntersectionRepository {

    public IntersectionRepository(Session session) {
        super(Intersection.class, session);
    }
}
