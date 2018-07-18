package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK,
    PAPER,
    SCISSORS;

    RockPaperScissors(){

    }

    public RockPaperScissors getWinningSign(){
        return this.equals(ROCK)?PAPER: (this.equals(PAPER))?SCISSORS:ROCK;
    }

    public RockPaperScissors getLosingSign(){
        return (this.equals(ROCK))?SCISSORS:(this.equals(PAPER))? ROCK: PAPER;
    }
}
