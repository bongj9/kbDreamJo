package report.repository;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import report.domain.Report;

public interface ReportMapper {

    @Insert("INSERT INTO report (address, detail_address, deposit_amount) " +
            "VALUES (#{address}, #{detailAddress}, #{depositAmount}")
    void insertReport(Report report);

    @Select("SELECT * FROM report WHERE id = #{id}")
    Report getReportById(Long id);
}
