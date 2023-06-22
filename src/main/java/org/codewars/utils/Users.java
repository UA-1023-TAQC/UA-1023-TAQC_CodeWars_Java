package org.codewars.utils;

import org.codewars.kata.Eight;
import org.codewars.kata.Five;
import org.codewars.kata.Seven;
import org.codewars.kata.Six;

public enum Users {
    ANDRUSYK_ANDRIY (1, "Andrusyk Andriy", "andriyav",
            new  org.codewars.kata.implementation.andriyav.EightImpl(),
            new  org.codewars.kata.implementation.andriyav.SevenImpl(),
            new  org.codewars.kata.implementation.andriyav.SixImpl(),
            new  org.codewars.kata.implementation.andriyav.FiveImpl()),
    BESARAB_VOLODYMYR (2, "Besarab Volodymyr", "VolodumurBesarab",
            new  org.codewars.kata.implementation.VolodumurBesarab.EightImpl(),
            new  org.codewars.kata.implementation.VolodumurBesarab.SevenImpl(),
            new  org.codewars.kata.implementation.VolodumurBesarab.SixImpl(),
            new  org.codewars.kata.implementation.VolodumurBesarab.FiveImpl()),

    KOVALCHUK_VITA (3, "Kovalchuk Vita", "kovalchuk-vita",
            new  org.codewars.kata.implementation.kovalchukvita.EightImpl(),
            new  org.codewars.kata.implementation.kovalchukvita.SevenImpl(),
            new  org.codewars.kata.implementation.kovalchukvita.SixImpl(),
            new  org.codewars.kata.implementation.kovalchukvita.FiveImpl()),

    KROTENKO_ROSTYSLAV (4, "Krotenko Rostyslav", "Francious",
            new  org.codewars.kata.implementation.Francious.EightImpl(),
            new  org.codewars.kata.implementation.Francious.SevenImpl(),
            new  org.codewars.kata.implementation.Francious.SixImpl(),
            new  org.codewars.kata.implementation.Francious.FiveImpl()),

    MASHCHENKO_ANASTASIIA (5, "Mashchenko Anastasiia", "Anastasiia3795",
            new  org.codewars.kata.implementation.Anastasiia3795.EightImpl(),
            new  org.codewars.kata.implementation.Anastasiia3795.SevenImpl(),
            new  org.codewars.kata.implementation.Anastasiia3795.SixImpl(),
            new  org.codewars.kata.implementation.Anastasiia3795.FiveImpl()),
    MOSKALENKO_VALERIIA (6, "Moskalenko Valeriia", "mosvvy",
            new  org.codewars.kata.implementation.mosvvy.EightImpl(),
            new  org.codewars.kata.implementation.mosvvy.SevenImpl(),
            new  org.codewars.kata.implementation.mosvvy.SixImpl(),
            new  org.codewars.kata.implementation.mosvvy.FiveImpl()),
    MUSHTUK_PAVLO (7, "Mushtuk Pavlo", "DappY-127",
            new  org.codewars.kata.implementation.DappY127.EightImpl(),
            new  org.codewars.kata.implementation.DappY127.SevenImpl(),
            new  org.codewars.kata.implementation.DappY127.SixImpl(),
            new  org.codewars.kata.implementation.DappY127.FiveImpl()),
    NAKONECHNYI_ILLIA (8, "Nakonechnyi Illia", "Naccarato21",
            new  org.codewars.kata.implementation.Naccarato21.EightImpl(),
            new  org.codewars.kata.implementation.Naccarato21.SevenImpl(),
            new  org.codewars.kata.implementation.Naccarato21.SixImpl(),
            new  org.codewars.kata.implementation.Naccarato21.FiveImpl()),
    ROZDILSKA_NATALIA (9, "Rozdilska Natalia", "Natali-natali",
            new  org.codewars.kata.implementation.Natalinatali.EightImpl(),
            new  org.codewars.kata.implementation.Natalinatali.SevenImpl(),
            new  org.codewars.kata.implementation.Natalinatali.SixImpl(),
            new  org.codewars.kata.implementation.Natalinatali.FiveImpl()),
    TKACH_VASYL (10, "Tkach Vasyl", " Tk4V",
            new  org.codewars.kata.implementation.Tk4V.EightImpl(),
            new  org.codewars.kata.implementation.Tk4V.SevenImpl(),
            new  org.codewars.kata.implementation.Tk4V.SixImpl(),
            new  org.codewars.kata.implementation.Tk4V.FiveImpl()),
    ZAKOTIUK_IRYNA (11, "Zakotiuk Iryna", " zakotiukk",
            new  org.codewars.kata.implementation.zakotiukk.EightImpl(),
            new  org.codewars.kata.implementation.zakotiukk.SevenImpl(),
            new  org.codewars.kata.implementation.zakotiukk.SixImpl(),
            new  org.codewars.kata.implementation.zakotiukk.FiveImpl());
    private final int id;
    private final String name;
    private final String nickname;
    private final Eight eightImpl;
    private final Seven sevenImpl;
    private final Six sixImpl;
    private final Five fiveImpl;

    Users(int id, String name, String nickname, Eight eightImpl, Seven sevenImpl, Six sixImpl, Five fiveImpl) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.eightImpl = eightImpl;
        this.sevenImpl = sevenImpl;
        this.sixImpl = sixImpl;
        this.fiveImpl = fiveImpl;
    }

    public static void showUsers() {
        for (Users user : values()){
            System.out.println(String.format("%2s. %30s, Git: %20s", user.id, user.name, user.nickname));
        }
    }
    public static Users getById(int id) {
        for (Users user : values()){
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return String.format("Users:id=%d, name='%s, nickname='%s', eightImpl=%s, " +
    "sevenImpl=%s, sixImpl=%s, fiveImpl=%s", id, name, nickname, eightImpl, sevenImpl, sixImpl, fiveImpl);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public Eight getEightImpl() {
        return eightImpl;
    }

    public Seven getSevenImpl() {
        return sevenImpl;
    }

    public Six getSixImpl() {
        return sixImpl;
    }

    public Five getFiveImpl() {
        return fiveImpl;
    }
}

