package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Company;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.services.CompanyService;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // 1. Lưu thông tin công ty
    @PostMapping
    public ResponseEntity<Company> saveCompany(@RequestBody Company company) {
        Company savedCompany = companyService.saveCompany(company);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCompany);
    }

    // 2. Lấy công ty theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("id") Long id) {
        Company company = companyService.getCompanyById(id);
        if (company != null) {
            return ResponseEntity.ok(company);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // 3. Tìm công ty theo Email
    @GetMapping("/email/{email}")
    public ResponseEntity<Company> findByEmail(@PathVariable("email") String email) {
        Company company = companyService.findByEmail(email);
        if (company != null) {
            return ResponseEntity.ok(company);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // 4. Tìm công ty theo Phone
    @GetMapping("/phone/{phone}")
    public ResponseEntity<Company> findByPhone(@PathVariable("phone") String phone) {
        Company company = companyService.findByPhone(phone);
        if (company != null) {
            return ResponseEntity.ok(company);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
