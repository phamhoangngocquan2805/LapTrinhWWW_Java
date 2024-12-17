package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Address;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Company;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public Company findByEmail(String email) {
        return companyRepository.findByEmail(email);
    }

    public Company findByPhone(String phone) {
        return companyRepository.findByPhone(phone);
    }




}
