package com.example.MockInterview;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {
RepositoryLayer liftrepository=new RepositoryLayer();
public void addLift(Lift lift){
    liftrepository.addLift(lift);
}
public void addPassenger(Passenger passenger){
    liftrepository.addPassenger(passenger);
}
public void DeletePassenger(){
    List<Passenger> passengerList=liftrepository.getPassengers();
    for(Passenger passenger:passengerList){
        if(passenger.getPassengerId()<5){
            liftrepository.DeletePassenger(passenger.getPassengerId());
            liftrepository.DeletePassengerwithId(passenger.getLiftno(),passenger.getPassengerId());
        }
    }
}
public int getPeople(int weight,Lift lift){
    return liftrepository.getPeople(weight,lift);
}
}
