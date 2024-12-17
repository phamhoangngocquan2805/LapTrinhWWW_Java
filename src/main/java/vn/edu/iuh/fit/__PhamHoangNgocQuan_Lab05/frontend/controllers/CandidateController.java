package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Candidate;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.services.CandidateService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private CandidateService candidateService;

    @GetMapping("/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates/candidates";
    }
    // 1. Lấy danh sách tất cả các ứng viên
    @GetMapping
    public ResponseEntity<List<Candidate>> getAllCandidates() {
        List<Candidate> candidates = candidateService.getAllCandidates();
        return ResponseEntity.ok(candidates);
    }

    // 2. Lấy thông tin ứng viên theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Candidate> getCandidateById(@PathVariable("id") Long id) {
        Candidate candidate = candidateService.getCandidateById(id);
        if (candidate != null) {
            return ResponseEntity.ok(candidate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // 3. Tạo mới một ứng viên
    @PostMapping
    public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate) {
        Candidate createdCandidate = candidateService.createCandidate(candidate);
        return ResponseEntity.ok(createdCandidate);
    }

    // 4. Xóa ứng viên theo ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteCandidate(@PathVariable("id") Long id) {
//        candidateService.deleteCandidate(id);
//        return ResponseEntity.noContent().build();
//    }

    @GetMapping("/candidates")
    public String showCandidateListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(10);
        Page<Candidate> candidatePage= candidateService.findAll(
                currentPage - 1,pageSize,"id","asc");
        model.addAttribute("candidatePage", candidatePage);
        int totalPages = candidatePage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "candidates/candidates-paging";
    }

    @GetMapping("/edit/{id}")
    public String editCandidate(@PathVariable("id") Long id, Model model) {
        Candidate candidate = candidateRepository.findById(id).orElse(null);
        model.addAttribute("candidate", candidate);
        return "candidate/edit";  // Chuyển tới template edit
    }

    @GetMapping("/delete/{id}")
    public String deleteCandidate(@PathVariable("id") Long id) {
        candidateRepository.deleteById(id);
        return "redirect:/list";  // Sau khi xóa, chuyển hướng tới danh sách
    }

}
