package com.example.MockInterview;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lift extends Passenger {
    private Integer LiftNo;
    private Integer CapacityInWeight;
    private Integer CapacityInPerson;
    private List<Passenger> passengers=new ArrayList<>();
}
