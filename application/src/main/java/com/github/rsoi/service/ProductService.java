package com.github.rsoi.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Mark> listOfMarksMethod(int amountOfOrders) {
        List<Mark> listOfMarks = new ArrayList<>();
        for (int i = 0; i < amountOfOrders; i++) {
            Mark newMark = new Mark();
            listOfMarks.add(newMark);
        }
        return listOfMarks;
    }

    public double newListOfMarks(int amountOfOrders, List<Mark> listOfMarks2) {
        int length = amountOfOrders;
        if (amountOfOrders > 100) {
            LocalDate date1 = LocalDate.of(2021, 12, 31);
            for (int i = 0; i < length; i++) {
                if (listOfMarks2.isEmpty()) {
                    break;
                }
                if (date1.isAfter(listOfMarks2.get(i).certainDate)) {
                    listOfMarks2.remove(i);
                    length--;
                    i--;
                }
            }
        } else {
            LocalDate date2 = LocalDate.of(2022, 8, 1);
            for (int i = 0; i < length; i++) {
                if (listOfMarks2.isEmpty()) {
                    break;
                }
                if (date2.isAfter(listOfMarks2.get(i).certainDate)) {
                    listOfMarks2.remove(i);
                    length--;
                    i--;
                }
            }
        }

        int averageMark = 0;
        for (int i = 0; i < length; i++) {
            averageMark += listOfMarks2.get(i).mark;
        }
        double avgMark = (double) averageMark / length;

        return avgMark;
    }
}
