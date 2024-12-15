package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.JobSkill;

@Repository
public interface JobSkillRepository extends JpaRepository<JobSkill, Long> {
    // Thêm các query method tùy chỉnh nếu cần
}

