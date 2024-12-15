package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id")
    private Long canId;

    @Column(name = "full_name", length = 255)
    private String fullName;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @OneToOne
    @JoinColumn(name = "address", referencedColumnName = "add_id")
    private Address address;

    public Candidate(String s, LocalDate of, Address add, String s1, String s2) {
    }
}
