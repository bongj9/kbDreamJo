package report.dto;

public class ReportDto {
    private String address;
    private String detailAddress;
    private int depositAmount;
    private String filePath;

    // 생성자
    public ReportDto(String address, String detailAddress, int depositAmount, String filePath) {
        this.address = address;
        this.detailAddress = detailAddress;
        this.depositAmount = depositAmount;
        this.filePath = filePath;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
