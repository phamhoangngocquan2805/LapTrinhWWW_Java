package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long jobId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company", referencedColumnName = "com_id")
    private Company company;

    @Column(name = "job_name", length = 255)
    private String jobName;

    @Column(name = "job_desc", length = 2000)
    private String jobDesc;
}
