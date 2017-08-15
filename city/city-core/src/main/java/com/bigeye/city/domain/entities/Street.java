package com.bigeye.city.domain.entities;

import com.bigeye.city.domain.enums.TypeStreet;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.io.Serializable;
import java.util.UUID;

@RelationshipEntity(type = "street")
public class Street implements Serializable {

    @GraphId
    private Long graphId;
    private UUID id;
    private String name;
    private TypeStreet type;

    @StartNode
    private Intersection star;

    @EndNode
    private Intersection end;

    public Long getGraphId() {
        return graphId;
    }

    public void setGraphId(Long graphId) {
        this.graphId = graphId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeStreet getType() {
        return type;
    }

    public void setType(TypeStreet type) {
        this.type = type;
    }

    public Intersection getStar() {
        return star;
    }

    public void setStar(Intersection star) {
        this.star = star;
    }

    public Intersection getEnd() {
        return end;
    }

    public void setEnd(Intersection end) {
        this.end = end;
    }
}
