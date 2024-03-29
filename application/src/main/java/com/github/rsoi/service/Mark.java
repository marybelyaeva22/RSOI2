package com.github.rsoi.service;

import java.time.LocalDate;

public class Mark {

   public int mark;
   public LocalDate certainDate;

    public Mark()
    {
        this.mark = certainMark(1, 5);
        this.certainDate = LocalDate.of(year(), month(), day());
    }

    public int day ()
    {
        return (int) ((Math.random() * (28 - 1)) + 1);
    }
    public int month ()
    {
        return (int) ((Math.random() * (11)) + 0);
    }
    public int year ()
    {
        return (int) ((Math.random() * (123 - 121)) + 121);
    }
    public int certainMark (int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }
}