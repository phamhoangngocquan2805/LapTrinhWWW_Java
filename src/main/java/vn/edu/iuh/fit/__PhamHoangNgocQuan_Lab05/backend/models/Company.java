package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private Long comId;

    @Column(name = "comp_name", length = 255, nullable = false)
    private String compName;

    @Column(name = "about", length = 2000)
    private String about;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "phone", length = 255)
    private String phone;

    @Column(name = "web_url", length = 255)
    private String webUrl;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address", referencedColumnName = "add_id")
    private Address address;
}
