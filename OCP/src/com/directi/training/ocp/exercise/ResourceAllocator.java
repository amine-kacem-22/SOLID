package com.directi.training.ocp.exercise;

public class ResourceAllocator {
    public int allocateResource(Resource resource) {
        return resource.allocate();
    }

    public void freeResource(Resource resource, int resourceId) {
        resource.free(resourceId);
    }
}
