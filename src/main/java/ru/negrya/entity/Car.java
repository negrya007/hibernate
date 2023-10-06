package ru.negrya.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mark;
    private int price;
    private String number;
    @ManyToOne
    @JoinColumn(name = "engine_model")
    @NotNull private Engine engine;

    public Car(String mark, int price, String number, Engine engine) {
        this.mark = mark;
        this.price = price;
        this.number = number;
        this.engine = engine;
    }
}
