package ru.negrya.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "birthday")
    private LocalDate birthDay;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_friendship",
            joinColumns = @JoinColumn(name = "first_user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "second_user_id", referencedColumnName = "id"))
    private Set<Human> friend ;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_human")
    private Set<Car> cars;

    public Human(String userName, LocalDate birthDay, Set<Human> friend, Set<Car> cars) {
        this.userName = userName;
        this.birthDay = birthDay;
        this.friend = friend;
        this.cars = cars;
    }

    public Human(String userName, LocalDate birthDay) {
        this.userName = userName;
        this.birthDay = birthDay;
    }
}
