package test;

public class RoundRobin extends AbstractScheduler implements Scheduler {

    private int timeQuantum;
    public RoundRobin(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        super.setCurrentTime(0);
    }

    @Override
    public void schedule(ProcessClass[] processes) {
        System.out.println("Round Robin scheduling algorithm");

    }
}

