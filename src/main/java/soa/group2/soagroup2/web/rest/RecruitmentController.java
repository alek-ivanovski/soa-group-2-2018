package soa.group2.soagroup2.web.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soa.group2.soagroup2.service.RecruitmentService;


@RestController
@RequestMapping(value = "api/recruitment", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecruitmentController {
    RecruitmentService recruitmentService;

    @Autowired
    RecruitmentController(RecruitmentService recruitmentService){
        this.recruitmentService = recruitmentService;
    }
}
