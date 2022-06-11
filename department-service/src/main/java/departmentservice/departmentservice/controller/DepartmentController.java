package departmentservice.departmentservice.controller;

import departmentservice.departmentservice.entity.Department;
import departmentservice.departmentservice.repositry.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping("/departments")
    public List<Department> getDepartments() {

        return departmentRepo.findAll();
    }
    @PostMapping("/departments")
    public Department addDepartment(@RequestBody Department department) {
        return departmentRepo.save(department);
    }
    @GetMapping("/departments/{id}")
    public Optional<Department> getDepartById(@PathVariable("id") Long idepid)
    {
        return departmentRepo.findById(idepid);
    }
}

