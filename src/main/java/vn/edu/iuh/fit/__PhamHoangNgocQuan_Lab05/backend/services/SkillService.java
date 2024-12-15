package vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.models.Skill;
import vn.edu.iuh.fit.__PhamHoangNgocQuan_Lab05.backend.repositories.SkillRepository;

import java.util.List;

@Service
@Transactional
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    // Lấy skill theo id
    public Skill getSkillById(Long id) {
        return skillRepository.findSkillById(id);
    }

    // Lấy tất cả kỹ năng của một ứng viên
    public List<Skill> getSkillsByCandidate(Long candidateId) {
        return skillRepository.findSkillsByCandidate(candidateId);
    }

    // Gợi ý các kỹ năng mà ứng viên chưa có nhưng cần thiết cho công việc
    public List<Skill> getRecommendedSkillsForCandidate(Long candidateId) {
        return skillRepository.findRecommendedSkillsForCandidate(candidateId);
    }

    // Tìm skill theo tên
    public Skill getSkillByName(String skillName) {
        return skillRepository.findBySkillName(skillName);
    }

    // Lưu skill mới hoặc cập nhật skill hiện tại
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    // Xóa skill theo ID
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    // Lấy tất cả các skill
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }
}

