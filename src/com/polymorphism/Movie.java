package com.polymorphism;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}


class Main {

    public static void main(String[] args) {
//        for(int i=1; i<11; i++) {
       randomMovie(0);
//            System.out.println("Movie #" + i +
//                    " : " + movie.getName() + "\n" +
//                    "Plot: " + movie.plot() + "\n");
//        }
//        System.out.println("Movie #" +
//              " : " + movie.getName() + "\n" +
//                 "Plot: " + movie.plot() + "\n");
    }

    public static void randomMovie(int x) {

        switch (x) {
            case 0:
                System.out.println("0 is out");

            case 1:
                System.out.println("1 is out");
               // return;
            case 2:
                System.out.println("2 is out ");

            default:
                System.out.println("it is default");

        }
        }
}
