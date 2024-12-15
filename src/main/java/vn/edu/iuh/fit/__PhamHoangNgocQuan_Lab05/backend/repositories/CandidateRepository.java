package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Candidate;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    List<Candidate> findAll();

    // Tìm kiếm ứng viên theo tên đầy đủ (full_name)
    List<Candidate> findByFullNameContaining(String fullName);

    // Tìm kiếm ứng viên theo email chính xác
    Candidate findByEmail(String email);

    // Tìm kiếm ứng viên theo số điện thoại chính xác
    Candidate findByPhone(String phone);

    // Tìm kiếm ứng viên theo ID
    Candidate findByCanId(Long canId);
}


