package com.headcrest;

class Engine {
    private boolean started = false;

    public void start(){
        started = true;
    }

    public boolean isStarted(){
        return started;
    }
}
