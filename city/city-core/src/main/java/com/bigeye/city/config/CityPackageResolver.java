package com.bigeye.city.config;

import com.bigeye.neo4j.classloader.PackageResolver;

import java.util.Collections;
import java.util.Set;

public class CityPackageResolver implements PackageResolver {

    @Override
    public Set<String> getPackages() {
        return Collections.singleton("com.bigeye.city.domain.entities");
    }
}
