package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private Long addId;

    @Column(name = "country", length = 6)
    private String country;

    @Column(name = "zipcode", length = 7)
    private String zipcode;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "street", length = 150)
    private String street;

    public Address(String s, String quangTrung, String hcm, String s1, CountryCode countryCode) {
    }
}
