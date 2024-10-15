package com.directi.training.ocp.exercise;

public class TimeSlot implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot() {
        // Logic to find a free time slot
        return 1; // example value
    }

    private void markTimeSlotBusy(int resourceId) {
        // Logic to mark time slot busy
    }

    private void markTimeSlotFree(int resourceId) {
        // Logic to mark time slot free
    }
}

