package com.bigeye.city.domain.entities;

import com.bigeye.neo4j.convert.UUIDConverter;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.Convert;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@NodeEntity
public class Intersection implements Serializable {

    @GraphId
    private Long graphId;

    @Convert(UUIDConverter.class)
    @Index(unique = true)
    private UUID id;

    private String name;

    @Relationship(type = "street", direction = Relationship.INCOMING)
    private List<Street> incomingStreets;

    @Relationship(type = "street")
    private List<Street> outgoingStreets;

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

    public List<Street> getIncomingStreets() {
        return incomingStreets;
    }

    public void setIncomingStreets(List<Street> incomingStreets) {
        this.incomingStreets = incomingStreets;
    }

    public List<Street> getOutgoingStreets() {
        return outgoingStreets;
    }

    public void setOutgoingStreets(List<Street> outgoingStreets) {
        this.outgoingStreets = outgoingStreets;
    }
}
