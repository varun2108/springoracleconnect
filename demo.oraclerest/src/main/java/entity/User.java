package entity;

import javax.persistence.Column;
import javax.persistence.*;


@Entity
@Table(name = "USER_TABLE")
public class User {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
  
    @Column(name = "USER_NAME", nullable = true, length = 255)
    private String name;
  
    @Column(name = "USER_SALARY", nullable = true, length = 10)
    private Integer salary;
  
    protected User() {
    }
    //constructor, setters and getters omitted for brevity
}
