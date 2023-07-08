package controller;

import jakarta.persistence.*;
import lombok.Data;

//@Data est une annotation Lombok. Nul besoin d’ajouter
//        les getters et les setters. La librairie Lombok s’en
//        charge pour nous. Très utile pour alléger le code.
@Data
//@Entity est une annotation qui indique que la classe correspond à une table de la base de données.
@Entity
//@Table(name=”employees”) indique le nom de la table associée.
@Table(name = "employees")
public class Employee {

//    L’attribut id correspond à la clé primaire de la table, et est donc annoté @Id. D’autre part, comme
//    l’id est auto-incrémenté, j’ai ajouté l’annotation @GeneratedValue(strategy = GenerationType.IDENTITY).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    Enfin, firstName et lastName sont annotés avec @Column pour faire le lien avec le nom du champ de la table
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String mail;

    private String password;

}