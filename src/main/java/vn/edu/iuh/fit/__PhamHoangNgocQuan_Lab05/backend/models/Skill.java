package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skillId;

    @Column(name = "skill_name", length = 150)
    private String skillName;

    @Column(name = "skill_desc", length = 300)
    private String skillDesc;

    @Column(name = "skill_type")
    private Integer skillType;
}
