package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05;


import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Address;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Candidate;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories.*;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
@RestController
public class PhamHoangNgocQuan_20001031_Lab05Application {

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private CandidateRepository candidateRepository;
	@Autowired
	private SkillRepository skillRepository;
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private JobSkillRepository jobSkillRepository;
	@Autowired
	private CandidateSkillRepository candidateSkillRepository;
	@Autowired
	private ExperienceRepository experienceRepository;


	public static void main(String[] args) {
		SpringApplication.run(PhamHoangNgocQuan_20001031_Lab05Application.class, args);
	}

//	@Bean
//	CommandLineRunner initData(){
//		return args -> {
//			Random rnd =new Random();
//			for (int i = 1; i < 1000; i++) {
//				Address add = new Address(rnd.nextInt(1,1000)+"","Quang Trung","HCM",
//						rnd.nextInt(70000,80000)+"", CountryCode.VN );
//				addressRepository.save(add);
//				Candidate can=new Candidate("Name #"+i,
//						LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
//						add,
//						rnd.nextLong(1111111111L,9999999999L)+"",
//						"email_"+i+"@gmail.com");
//				candidateRepository.save(can);
//				System.out.println("Added: " +can);
//			}
//		};
//	}


}

