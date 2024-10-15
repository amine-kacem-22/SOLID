package com.directi.training.ocp.exercise;

public class SpaceSlot implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot() {
        // Logic to find a free space slot
        return 2; // example value
    }

    private void markSpaceSlotBusy(int resourceId) {
        // Logic to mark space slot busy
    }

    private void markSpaceSlotFree(int resourceId) {
        // Logic to mark space slot free
    }
}

