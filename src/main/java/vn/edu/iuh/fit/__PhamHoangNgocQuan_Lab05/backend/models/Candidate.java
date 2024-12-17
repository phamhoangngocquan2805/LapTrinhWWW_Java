package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidate")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "address")
public class Candidate {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dob", nullable = false)
    private LocalDate dob;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "phone", nullable = false, length = 15)
    private String phone;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> candidateSkill;

    @OneToMany(mappedBy = "candidate")
    private List<Experience> experience;


    public Candidate(LocalDate dob, String email, String fullName, String phone, Address address) {
        this.dob = dob;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

}