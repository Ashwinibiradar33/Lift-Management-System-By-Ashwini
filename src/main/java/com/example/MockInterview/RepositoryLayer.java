package com.example.MockInterview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class RepositoryLayer {
    private HashMap<Integer,Lift> liftDb=new HashMap<>();
    private HashMap<Integer,Passenger> passengerDb= new HashMap<>();
    public void addLift(Lift lift){
        liftDb.put(lift.getLiftNo(),lift);
    }
    public void addPassenger(Passenger passenger){
        int liftNo=passenger.getLiftno();
        Lift lift= liftDb.get(liftNo);
        List<Passenger> passengerList=lift.getPassengers();
        passengerList.add(passenger);
        passengerDb.put(passenger.getPassengerId(),passenger);
    }
    public void DeletePassengerwithId(int liftNo , int requiredPassengerId){
        Lift lift=liftDb.get(liftNo);
        List<Passenger> passengers=lift.getPassengers();
        for(Passenger passenger:passengers){
            if(passenger.getPassengerId()==requiredPassengerId) passengers.remove(passenger);

        }

    }

    public List<Passenger> getPassengers() {
        List<Passenger> passengers =new ArrayList<>();
        return passengers;
    }

    public void DeletePassenger(Integer passengerId) {
        passengerDb.remove(passengerId);
    }
    public int getPeople(int weight,Lift lift){
        int liftwwight=lift.getWeight();
        return liftwwight % weight;

    }
}
