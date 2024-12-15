package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id")
    private Skill skill;

    @Column(name = "skill_level")
    private Integer skillLevel;

    @Column(name = "more_infos", length = 1000)
    private String moreInfos;
}
