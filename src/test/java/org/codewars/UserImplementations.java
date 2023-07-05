package org.codewars;

import org.codewars.kata.Eight;
import org.codewars.kata.Five;
import org.codewars.kata.Seven;
import org.codewars.kata.Six;

import org.apache.commons.lang3.SerializationUtils;

public class UserImplementations {
    public static final Eight[] EIGHTS = new Eight[]{
            new org.codewars.kata.implementation.Anastasiia3795.EightImpl(),
            new org.codewars.kata.implementation.andriyav.EightImpl(),
            new org.codewars.kata.implementation.DappY127.EightImpl(),
            new org.codewars.kata.implementation.Francious.EightImpl(),
            new org.codewars.kata.implementation.kovalchukvita.EightImpl(),
            new org.codewars.kata.implementation.mosvvy.EightImpl(),
            new org.codewars.kata.implementation.Naccarato21.EightImpl(),
            new org.codewars.kata.implementation.Natalinatali.EightImpl(),
            new org.codewars.kata.implementation.Tk4V.EightImpl(),
            new org.codewars.kata.implementation.VolodumurBesarab.EightImpl(),
            new org.codewars.kata.implementation.zakotiukk.EightImpl()
    };

    public static final Seven[] SEVENS = new Seven[]{
            new org.codewars.kata.implementation.Anastasiia3795.SevenImpl(),
            new org.codewars.kata.implementation.andriyav.SevenImpl(),
            new org.codewars.kata.implementation.DappY127.SevenImpl(),
            new org.codewars.kata.implementation.Francious.SevenImpl(),
            new org.codewars.kata.implementation.kovalchukvita.SevenImpl(),
            new org.codewars.kata.implementation.mosvvy.SevenImpl(),
            new org.codewars.kata.implementation.Naccarato21.SevenImpl(),
            new org.codewars.kata.implementation.Natalinatali.SevenImpl(),
            new org.codewars.kata.implementation.Tk4V.SevenImpl(),
            new org.codewars.kata.implementation.VolodumurBesarab.SevenImpl(),
            new org.codewars.kata.implementation.zakotiukk.SevenImpl()
    };

    public static final Six[] SIXES = new Six[]{
            new org.codewars.kata.implementation.Anastasiia3795.SixImpl(),
            new org.codewars.kata.implementation.andriyav.SixImpl(),
            new org.codewars.kata.implementation.DappY127.SixImpl(),
            new org.codewars.kata.implementation.Francious.SixImpl(),
            new org.codewars.kata.implementation.kovalchukvita.SixImpl(),
            new org.codewars.kata.implementation.mosvvy.SixImpl(),
            new org.codewars.kata.implementation.Naccarato21.SixImpl(),
            new org.codewars.kata.implementation.Natalinatali.SixImpl(),
            new org.codewars.kata.implementation.Tk4V.SixImpl(),
            new org.codewars.kata.implementation.VolodumurBesarab.SixImpl(),
            new org.codewars.kata.implementation.zakotiukk.SixImpl()
    };

    public static final Five[] FIVES = new Five[]{
            new org.codewars.kata.implementation.Anastasiia3795.FiveImpl(),
            new org.codewars.kata.implementation.andriyav.FiveImpl(),
            new org.codewars.kata.implementation.DappY127.FiveImpl(),
            new org.codewars.kata.implementation.Francious.FiveImpl(),
            new org.codewars.kata.implementation.kovalchukvita.FiveImpl(),
            new org.codewars.kata.implementation.mosvvy.FiveImpl(),
            new org.codewars.kata.implementation.Naccarato21.FiveImpl(),
            new org.codewars.kata.implementation.Natalinatali.FiveImpl(),
            new org.codewars.kata.implementation.Tk4V.FiveImpl(),
            new org.codewars.kata.implementation.VolodumurBesarab.FiveImpl(),
            new org.codewars.kata.implementation.zakotiukk.FiveImpl()
    };

    public static Object[][] combineImplWithTests(Object[] implementations, Object[][] testData) {
        Object[][] fullTestData = new Object[testData.length * implementations.length][testData[0].length + 1];
        int count = 0;
        for (Object impl : implementations) {
            Object[][] copyTestData = SerializationUtils.clone(testData);
            for (Object[] row : copyTestData) {
                fullTestData[count][0] = impl;
                System.arraycopy(row, 0, fullTestData[count], 1, row.length);
                count++;
            }
        }

        return fullTestData;
    }
}
