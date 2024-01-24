package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String email;

  public Person(){}
  public Person(Integer id, String name, String email){
    this.id = id;
    this.name = name;
    this.email = email;
  }
  public void setId(Integer id){
    this.id = id;
  }
  public Integer getId(){
    return id;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setEmail(String email){
    this.email = email;
  }
  public String getEmail(){
    return email;
  }

  @Override
  public String toString(){
    return "Person [" + id + ", " + name + ", " + email + "]";
  }
}
