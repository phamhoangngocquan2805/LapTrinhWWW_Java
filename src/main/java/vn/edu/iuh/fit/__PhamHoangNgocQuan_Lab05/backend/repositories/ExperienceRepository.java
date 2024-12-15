package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    // Thêm các query method tùy chỉnh nếu cần
}

