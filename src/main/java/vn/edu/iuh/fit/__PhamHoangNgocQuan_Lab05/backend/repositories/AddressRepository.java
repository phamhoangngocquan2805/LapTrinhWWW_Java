package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Address;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAll();
}

