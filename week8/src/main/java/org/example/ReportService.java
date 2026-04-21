package org.example;
import java.util.*;

public class ReportService {
    public void exportAsGenericReport(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ReportService reportService = new ReportService();

        List<String> customerName = List.of("Alice", "Bob", "Charlie");
        List<Double> dailyRevenues = List.of(1250.75, 980.25, 1430.60);
        List<Integer> productRatings = List.of(5, 4, 3, 5);

        reportService.exportAsGenericReport(customerName);
        reportService.exportAsGenericReport(dailyRevenues);
        reportService.exportAsGenericReport(productRatings);
    }
}
