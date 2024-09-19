package report.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import report.domain.Report;
import report.dto.ReportDto;
import report.repository.ReportMapper;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class ReportService {

    @Autowired
    private ReportMapper reportMapper;

    public void createReport(ReportDto reportDto) throws IOException {

        // Report 객체 생성 및 데이터베이스 저장
        Report report = new Report();
        report.setAddress(reportDto.getAddress());
        report.setDetailAddress(reportDto.getDetailAddress());
        report.setDepositAmount(reportDto.getDepositAmount());

        reportMapper.insertReport(report);  // MyBatis를 사용한 데이터 삽입
    }

    public ReportDto getReport(Long id) {
        Report report = reportMapper.getReportById(id);  // MyBatis를 사용한 데이터 조회
        return new ReportDto(report.getAddress(), report.getDetailAddress(), report.getDepositAmount(), report.getFilePath());
    }
}
