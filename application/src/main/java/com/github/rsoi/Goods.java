package com.github.rsoi;

import com.github.rsoi.service.Mark;

import java.util.ArrayList;
import java.util.Date;

public class Goods {
    private int IDProduct;
    private String nameProduct;
    private int amountOfOrders;
    private double avgMrk;


    public Goods(int IDProduct, String nameProduct, int amountOfOrders) {
        this.IDProduct = IDProduct;
        this.nameProduct = nameProduct;
        this.amountOfOrders = amountOfOrders;
        this.avgMrk = newListOfMarks();
    }


    public ArrayList<Mark> listOfMarksMethod() {
        ArrayList<Mark> listOfMarks = new ArrayList();
        for (int i = 0; i <= amountOfOrders; i++) {
            Mark newMark = new Mark();
            listOfMarks.add(newMark);
        }

        return listOfMarks;
    }

    public double newListOfMarks(){

        int length = amountOfOrders;
        ArrayList<Mark> listOfMarks2 = listOfMarksMethod();
        if (amountOfOrders > 100){
            Date date1 = new Date (121, 11, 31);
            for (int i = 0; i <= length; i++){
                if(date1.after (listOfMarks2.get(i).certainDate)){
                    listOfMarks2.remove(i);
                    length--;
                }
            }

        } else
        {
            Date date2 = new Date (122, 8, 1);
            for (int i = 0; i <= length; i++){
                if(date2.after (listOfMarks2.get(i).certainDate)) {
                    listOfMarks2.remove(i);
                    length--;
                }
            }
        }

        int averageMark = 0;
        for (int i = 0; i < length; i++)
            averageMark += listOfMarks2.get(i).mark;
        double avgMark = (double) averageMark / length;

        return avgMark;
    }


    public int getIDProduct() {
        return IDProduct;
    }


    public String getNameProduct() {
        return nameProduct;
    }



    public int getAmountOfOrders() {
        return amountOfOrders;
    }

    public double getAvgMrk() {
        return avgMrk;
    }
}
