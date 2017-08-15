package com.bigeye.city.domain.interfaces;

import com.bigeye.city.domain.entities.Intersection;
import com.bigeye.neo4j.api.Neo4jRepository;

public interface IIntersectionRepository extends Neo4jRepository<Intersection, Long> {
}
