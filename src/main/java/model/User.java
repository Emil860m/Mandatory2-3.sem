package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user_name;
    private String pass_word;
    private String name;
    private int type;//Dette eller nedarvning?

    public User() {
    }
}
