package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.enums.SkillType;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "skill_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "skill_description")
    private String skillDescription;

    @Column(name = "skill_name")
    private String skillName;

    @Enumerated(EnumType.STRING)
    private SkillType type;

    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

    @OneToMany(mappedBy = "skill")
    private List<CandidateSkill> candidateSkills;

    public Skill() {
    }

    public Skill(Long id, String skillName, String skillDescription, SkillType type) {
        this.id = id;
        this.skillName = skillName;
        this.skillDescription = skillDescription;
        this.type = type;
    }

}