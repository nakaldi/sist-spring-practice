package beom.spring_practice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponseBody {

    @JsonProperty("rt_cd")
    private String rtCd; // 성공 실패 여부 (0: 성공, 0 이외: 실패)

    @JsonProperty("msg_cd")
    private String msgCd; // 응답코드

    @JsonProperty("msg1")
    private String msg1; // 응답메세지

    @JsonProperty("output") // JSON에서 "output"이라는 키로 상세 정보 객체가 옴
    private InquirePriceOutputDto output; // 상세 응답 내용

    public ApiResponseBody() {
    }

    public String getRtCd() {
        return rtCd;
    }

    public void setRtCd(String rtCd) {
        this.rtCd = rtCd;
    }

    public String getMsgCd() {
        return msgCd;
    }

    public void setMsgCd(String msgCd) {
        this.msgCd = msgCd;
    }

    public String getMsg1() {
        return msg1;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public InquirePriceOutputDto getOutput() {
        return output;
    }

    public void setOutput(InquirePriceOutputDto output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "ApiResponseBody{" +
                "rtCd='" + rtCd + '\'' +
                ", msgCd='" + msgCd + '\'' +
                ", msg1='" + msg1 + '\'' +
                ", output=" + output +
                '}';
    }
}
