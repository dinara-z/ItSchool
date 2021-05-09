package com.zoo.exception;

public class ENonExistentCage extends Exception {
    public ENonExistentCage(){
        super("Несуществующий вольер");
    }
}
