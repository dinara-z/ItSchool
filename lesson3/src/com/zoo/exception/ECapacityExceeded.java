package com.zoo.exception;

public class ECapacityExceeded extends Exception{
    public ECapacityExceeded(){
        super("Превышена максимальная вместимость вольера");
    }
}
