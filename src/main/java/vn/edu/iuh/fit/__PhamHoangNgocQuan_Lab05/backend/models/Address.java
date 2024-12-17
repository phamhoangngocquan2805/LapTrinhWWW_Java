package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "candidate")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street", length = 150)
    private String street;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country")
    private CountryCode country;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "zipcode", length = 7)
    private String zipcode;

    @OneToOne(mappedBy = "address")
    private Company company;

    @OneToOne(mappedBy = "address")
    private Candidate candidate;


    public Address(Long id, String street, String city, CountryCode country, String number, String zipcode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipcode = zipcode;
    }

    public Address(String street, String city, CountryCode country, String number, String zipcode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipcode = zipcode;
    }
}