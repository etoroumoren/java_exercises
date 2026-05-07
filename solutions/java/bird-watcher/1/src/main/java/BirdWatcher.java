
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds: this.birdsPerDay) {
            if(birds <= 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays < birdsPerDay.length) {
            for(int i = 0; i < numberOfDays; i++) {
                sum += birdsPerDay[i];
            }
        } else {
            for(int i = 0; i < birdsPerDay.length; i++) {
                sum += birdsPerDay[i];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int sum = 0;

        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5) {
                sum++;
            }
        }
        return sum;
    }
}
