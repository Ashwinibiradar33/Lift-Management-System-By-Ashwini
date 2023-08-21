package com.example.MockInterview;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class ControllerLayer {
    ServiceLayer liftservice = new ServiceLayer();

    @PostMapping("/addLift")
    public ResponseEntity<String> addLift(@RequestBody Lift lift) {
        liftservice.addLift(lift);
        return new ResponseEntity<>("Lift is added Successfully", HttpStatus.CREATED);

    }

    @PostMapping("/addPassenger")
    public ResponseEntity<String> addPassenger(@RequestBody Passenger passenger) {
        liftservice.addPassenger(passenger);
        return new ResponseEntity<>("Passenger is added Succesfully", HttpStatus.CREATED);
    }

    @DeleteMapping("DeletePassenger")
    public ResponseEntity<String> DeletePassenger() {
        liftservice.DeletePassenger();
        return new ResponseEntity<>("Passenger is deleted Succusfully", HttpStatus.CREATED);
    }

    @GetMapping("/MaxnumberofPerople")
    public int maxNumberofPeople(@RequestParam int weight, @RequestBody Lift lift) {
        return liftservice.getPeople(weight, lift);
    }
}

