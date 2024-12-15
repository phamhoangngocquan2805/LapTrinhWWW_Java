package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Company;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    // Tìm kiếm công ty theo tên công ty (chứa chuỗi cụ thể)
    List<Company> findByCompNameContaining(String compName);

    // Tìm kiếm công ty theo email
    Company findByEmail(String email);

    // Tìm kiếm công ty theo số điện thoại
    Company findByPhone(String phone);

    // Tìm kiếm công ty theo địa chỉ
    List<Company> findByAddress(Long address);

    // Tìm kiếm công ty theo ID
    Company findByComId(Long comId);
}

