package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "NETWORKS")
@Getter
@Setter
public class Network {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String call_letters;
    private int channel;

    @OneToMany(mappedBy = "network")
    private List<Show> networkShowsList = new ArrayList<>();
}
