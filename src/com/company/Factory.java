package com.company;

interface Logistics {
    void manage();
}

class RoadLogistics implements Logistics{
    @Override

    public void manage(){
        System.out.println("controling cars...");
    }
}

class SeaLogistics implements Logistics{
    @Override

    public void manage(){
        System.out.println("controling ships...");
    }
}

class SeaLogisticsFactory implements LogisticsFactory{
    @Override
    public Logistics createMachine(){
        return new SeaLogistics();
    }
}


class RoadLogistcsFactory implements LogisticsFactory{
    @Override
    public Logistics createMachine(){
        return new RoadLogistics();
    }
}


interface LogisticsFactory {
    static LogisticsFactory createMachineBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("road")){
            return new RoadLogistcsFactory();
        }
        if (speciality.equalsIgnoreCase("sea")){
            return new SeaLogisticsFactory();
        }
        else {
            throw new RuntimeException(speciality + "in unknown speciality.");
        }
    }
    Logistics createMachine();

}

