package desafio.backend.springboot_itau.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponse {
    private long count;
    private double sum;
    private double avg;
    private double max;
    private double min;

    public StatisticsResponse(DoubleSummaryStatistics stats){
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.max = stats.getMax();
        this.min = stats.getMin();
    }

    public double getAvg() {
        return avg;
    }

    public long getCount() {
        return count;
    }

    public double getMax() {
        return max;
    }

    public double getSum() {
        return sum;
    }

    public double getMin() {
        return min;
    }

}
