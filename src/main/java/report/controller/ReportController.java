package report.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import report.dto.ReportDto;
import report.service.ReportService;

import java.io.IOException;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    // 리포트 생성 API
    @PostMapping("/create")
    public ResponseEntity<?> createReport(@RequestBody ReportDto reportDto) throws IOException {
        reportService.createReport(reportDto);
        return ResponseEntity.ok().build();  // 성공 응답 반환
    }


    // 리포트 조회 API
    @GetMapping("/{id}")
    public ResponseEntity<ReportDto> getReport(@PathVariable Long id) {
        ReportDto reportDto = reportService.getReport(id);
        return ResponseEntity.ok(reportDto);  // 조회된 리포트 반환
    }
}
