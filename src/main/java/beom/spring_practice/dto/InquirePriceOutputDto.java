package beom.spring_practice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InquirePriceOutputDto {
    @JsonProperty("iscd_stat_cls_code")
    private String iscdStatClsCode; // 종목 상태 구분 코드

    @JsonProperty("marg_rate")
    private String margRate; // 증거금 비율

    @JsonProperty("rprs_mrkt_kor_name")
    private String rprsMrktKorName; // 대표 시장 한글 명

    @JsonProperty("new_hgpr_lwpr_cls_code")
    private String newHgprLwprClsCode; // 신 고가 저가 구분 코드

    @JsonProperty("bstp_kor_isnm")
    private String bstpKorIsnm; // 업종 한글 종목명

    @JsonProperty("temp_stop_yn")
    private String tempStopYn; // 임시 정지 여부

    @JsonProperty("oprc_rang_cont_yn")
    private String oprcRangContYn; // 시가 범위 연장 여부

    @JsonProperty("clpr_rang_cont_yn")
    private String clprRangContYn; // 종가 범위 연장 여부

    @JsonProperty("crdt_able_yn")
    private String crdtAbleYn; // 신용 가능 여부

    @JsonProperty("grmn_rate_cls_code")
    private String grmnRateClsCode; // 보증금 비율 구분 코드

    @JsonProperty("elw_pblc_yn")
    private String elwPblcYn; // ELW 발행 여부

    @JsonProperty("stck_prpr")
    private String stckPrpr; // 주식 현재가

    @JsonProperty("prdy_vrss")
    private String prdyVrss; // 전일 대비

    @JsonProperty("prdy_vrss_sign")
    private String prdyVrssSign; // 전일 대비 부호

    @JsonProperty("prdy_ctrt")
    private String prdyCtrt; // 전일 대비율

    @JsonProperty("acml_tr_pbmn")
    private String acmlTrPbmn; // 누적 거래 대금

    @JsonProperty("acml_vol")
    private String acmlVol; // 누적 거래량

    @JsonProperty("prdy_vrss_vol_rate")
    private String prdyVrssVolRate; // 전일 대비 거래량 비율

    @JsonProperty("stck_oprc")
    private String stckOprc; // 주식 시가

    @JsonProperty("stck_hgpr")
    private String stckHgpr; // 주식 최고가

    @JsonProperty("stck_lwpr")
    private String stckLwpr; // 주식 최저가

    @JsonProperty("stck_mxpr")
    private String stckMxpr; // 주식 상한가

    @JsonProperty("stck_llam")
    private String stckLlam; // 주식 하한가

    @JsonProperty("stck_sdpr")
    private String stckSdpr; // 주식 기준가

    @JsonProperty("wghn_avrg_stck_prc")
    private String wghnAvrgStckPrc; // 가중 평균 주식 가격

    @JsonProperty("hts_frgn_ehrt")
    private String htsFrgnEhrt; // HTS 외국인 소진율

    @JsonProperty("frgn_ntby_qty")
    private String frgnNtbyQty; // 외국인 순매수 수량

    @JsonProperty("pgtr_ntby_qty")
    private String pgtrNtbyQty; // 프로그램매매 순매수 수량

    @JsonProperty("pvt_scnd_dmrs_prc")
    private String pvtScndDmrsPrc; // 피벗 2차 디저항 가격

    @JsonProperty("pvt_frst_dmrs_prc")
    private String pvtFrstDmrsPrc; // 피벗 1차 디저항 가격

    @JsonProperty("pvt_pont_val")
    private String pvtPontVal; // 피벗 포인트 값

    @JsonProperty("pvt_frst_dmsp_prc")
    private String pvtFrstDmspPrc; // 피벗 1차 디지지 가격

    @JsonProperty("pvt_scnd_dmsp_prc")
    private String pvtScndDmspPrc; // 피벗 2차 디지지 가격

    @JsonProperty("dmrs_val")
    private String dmrsVal; // 디저항 값

    @JsonProperty("dmsp_val")
    private String dmspVal; // 디지지 값

    @JsonProperty("cpfn")
    private String cpfn; // 자본금

    @JsonProperty("rstc_wdth_prc")
    private String rstcWdthPrc; // 제한 폭 가격

    @JsonProperty("stck_fcam")
    private String stckFcam; // 주식 액면가

    @JsonProperty("stck_sspr")
    private String stckSspr; // 주식 대용가

    @JsonProperty("aspr_unit")
    private String asprUnit; // 호가단위

    @JsonProperty("hts_deal_qty_unit_val")
    private String htsDealQtyUnitVal; // HTS 매매 수량 단위 값

    @JsonProperty("lstn_stcn")
    private String lstnStcn; // 상장 주수

    @JsonProperty("hts_avls")
    private String htsAvls; // HTS 시가총액

    @JsonProperty("per")
    private String per; // PER

    @JsonProperty("pbr")
    private String pbr; // PBR

    @JsonProperty("stac_month")
    private String stacMonth; // 결산 월

    @JsonProperty("vol_tnrt")
    private String volTnrt; // 거래량 회전율

    @JsonProperty("eps")
    private String eps; // EPS

    @JsonProperty("bps")
    private String bps; // BPS

    @JsonProperty("d250_hgpr")
    private String d250Hgpr; // 250일 최고가

    @JsonProperty("d250_hgpr_date")
    private String d250HgprDate; // 250일 최고가 일자

    @JsonProperty("d250_hgpr_vrss_prpr_rate")
    private String d250HgprVrssPrprRate; // 250일 최고가 대비 현재가 비율

    @JsonProperty("d250_lwpr")
    private String d250Lwpr; // 250일 최저가

    @JsonProperty("d250_lwpr_date")
    private String d250LwprDate; // 250일 최저가 일자

    @JsonProperty("d250_lwpr_vrss_prpr_rate")
    private String d250LwprVrssPrprRate; // 250일 최저가 대비 현재가 비율

    @JsonProperty("stck_dryy_hgpr")
    private String stckDryyHgpr; // 주식 연중 최고가

    @JsonProperty("dryy_hgpr_vrss_prpr_rate")
    private String dryyHgprVrssPrprRate; // 연중 최고가 대비 현재가 비율

    @JsonProperty("dryy_hgpr_date")
    private String dryyHgprDate; // 연중 최고가 일자

    @JsonProperty("stck_dryy_lwpr")
    private String stckDryyLwpr; // 주식 연중 최저가

    @JsonProperty("dryy_lwpr_vrss_prpr_rate")
    private String dryyLwprVrssPrprRate; // 연중 최저가 대비 현재가 비율

    @JsonProperty("dryy_lwpr_date")
    private String dryyLwprDate; // 연중 최저가 일자

    @JsonProperty("w52_hgpr")
    private String w52Hgpr; // 52주일 최고가

    @JsonProperty("w52_hgpr_vrss_prpr_ctrt")
    private String w52HgprVrssPrprCtrt; // 52주일 최고가 대비 현재가 대비

    @JsonProperty("w52_hgpr_date")
    private String w52HgprDate; // 52주일 최고가 일자

    @JsonProperty("w52_lwpr")
    private String w52Lwpr; // 52주일 최저가

    @JsonProperty("w52_lwpr_vrss_prpr_ctrt")
    private String w52LwprVrssPrprCtrt; // 52주일 최저가 대비 현재가 대비

    @JsonProperty("w52_lwpr_date")
    private String w52LwprDate; // 52주일 최저가 일자

    @JsonProperty("whol_loan_rmnd_rate")
    private String wholLoanRmndRate; // 전체 융자 잔고 비율

    @JsonProperty("ssts_yn")
    private String sstsYn; // 공매도가능여부

    @JsonProperty("stck_shrn_iscd")
    private String stckShrnIscd; // 주식 단축 종목코드

    @JsonProperty("fcam_cnnm")
    private String fcamCnnm; // 액면가 통화명

    @JsonProperty("cpfn_cnnm")
    private String cpfnCnnm; // 자본금 통화명

    @JsonProperty("apprch_rate")
    private String apprchRate; // 접근도

    @JsonProperty("frgn_hldn_qty")
    private String frgnHldnQty; // 외국인 보유 수량

    @JsonProperty("vi_cls_code")
    private String viClsCode; // VI적용구분코드

    @JsonProperty("ovtm_vi_cls_code")
    private String ovtmViClsCode; // 시간외단일가VI적용구분코드

    @JsonProperty("last_ssts_cntg_qty")
    private String lastSstsCntgQty; // 최종 공매도 체결 수량

    @JsonProperty("invt_caful_yn")
    private String invtCafulYn; // 투자유의여부

    @JsonProperty("mrkt_warn_cls_code")
    private String mrktWarnClsCode; // 시장경고코드

    @JsonProperty("short_over_yn")
    private String shortOverYn; // 단기과열여부

    @JsonProperty("sltr_yn")
    private String sltrYn; // 정리매매여부

    @JsonProperty("mang_issu_cls_code")
    private String mangIssuClsCode; // 관리종목여부

    public InquirePriceOutputDto() {
    }

    public String getIscdStatClsCode() {
        return iscdStatClsCode;
    }

    public void setIscdStatClsCode(String iscdStatClsCode) {
        this.iscdStatClsCode = iscdStatClsCode;
    }

    public String getMargRate() {
        return margRate;
    }

    public void setMargRate(String margRate) {
        this.margRate = margRate;
    }

    public String getRprsMrktKorName() {
        return rprsMrktKorName;
    }

    public void setRprsMrktKorName(String rprsMrktKorName) {
        this.rprsMrktKorName = rprsMrktKorName;
    }

    public String getNewHgprLwprClsCode() {
        return newHgprLwprClsCode;
    }

    public void setNewHgprLwprClsCode(String newHgprLwprClsCode) {
        this.newHgprLwprClsCode = newHgprLwprClsCode;
    }

    public String getBstpKorIsnm() {
        return bstpKorIsnm;
    }

    public void setBstpKorIsnm(String bstpKorIsnm) {
        this.bstpKorIsnm = bstpKorIsnm;
    }

    public String getTempStopYn() {
        return tempStopYn;
    }

    public void setTempStopYn(String tempStopYn) {
        this.tempStopYn = tempStopYn;
    }

    public String getOprcRangContYn() {
        return oprcRangContYn;
    }

    public void setOprcRangContYn(String oprcRangContYn) {
        this.oprcRangContYn = oprcRangContYn;
    }

    public String getClprRangContYn() {
        return clprRangContYn;
    }

    public void setClprRangContYn(String clprRangContYn) {
        this.clprRangContYn = clprRangContYn;
    }

    public String getCrdtAbleYn() {
        return crdtAbleYn;
    }

    public void setCrdtAbleYn(String crdtAbleYn) {
        this.crdtAbleYn = crdtAbleYn;
    }

    public String getGrmnRateClsCode() {
        return grmnRateClsCode;
    }

    public void setGrmnRateClsCode(String grmnRateClsCode) {
        this.grmnRateClsCode = grmnRateClsCode;
    }

    public String getElwPblcYn() {
        return elwPblcYn;
    }

    public void setElwPblcYn(String elwPblcYn) {
        this.elwPblcYn = elwPblcYn;
    }

    public String getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(String stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public String getPrdyVrss() {
        return prdyVrss;
    }

    public void setPrdyVrss(String prdyVrss) {
        this.prdyVrss = prdyVrss;
    }

    public String getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public String getPrdyCtrt() {
        return prdyCtrt;
    }

    public void setPrdyCtrt(String prdyCtrt) {
        this.prdyCtrt = prdyCtrt;
    }

    public String getAcmlTrPbmn() {
        return acmlTrPbmn;
    }

    public void setAcmlTrPbmn(String acmlTrPbmn) {
        this.acmlTrPbmn = acmlTrPbmn;
    }

    public String getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(String acmlVol) {
        this.acmlVol = acmlVol;
    }

    public String getPrdyVrssVolRate() {
        return prdyVrssVolRate;
    }

    public void setPrdyVrssVolRate(String prdyVrssVolRate) {
        this.prdyVrssVolRate = prdyVrssVolRate;
    }

    public String getStckOprc() {
        return stckOprc;
    }

    public void setStckOprc(String stckOprc) {
        this.stckOprc = stckOprc;
    }

    public String getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(String stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public String getStckLwpr() {
        return stckLwpr;
    }

    public void setStckLwpr(String stckLwpr) {
        this.stckLwpr = stckLwpr;
    }

    public String getStckMxpr() {
        return stckMxpr;
    }

    public void setStckMxpr(String stckMxpr) {
        this.stckMxpr = stckMxpr;
    }

    public String getStckLlam() {
        return stckLlam;
    }

    public void setStckLlam(String stckLlam) {
        this.stckLlam = stckLlam;
    }

    public String getStckSdpr() {
        return stckSdpr;
    }

    public void setStckSdpr(String stckSdpr) {
        this.stckSdpr = stckSdpr;
    }

    public String getWghnAvrgStckPrc() {
        return wghnAvrgStckPrc;
    }

    public void setWghnAvrgStckPrc(String wghnAvrgStckPrc) {
        this.wghnAvrgStckPrc = wghnAvrgStckPrc;
    }

    public String getHtsFrgnEhrt() {
        return htsFrgnEhrt;
    }

    public void setHtsFrgnEhrt(String htsFrgnEhrt) {
        this.htsFrgnEhrt = htsFrgnEhrt;
    }

    public String getFrgnNtbyQty() {
        return frgnNtbyQty;
    }

    public void setFrgnNtbyQty(String frgnNtbyQty) {
        this.frgnNtbyQty = frgnNtbyQty;
    }

    public String getPgtrNtbyQty() {
        return pgtrNtbyQty;
    }

    public void setPgtrNtbyQty(String pgtrNtbyQty) {
        this.pgtrNtbyQty = pgtrNtbyQty;
    }

    public String getPvtScndDmrsPrc() {
        return pvtScndDmrsPrc;
    }

    public void setPvtScndDmrsPrc(String pvtScndDmrsPrc) {
        this.pvtScndDmrsPrc = pvtScndDmrsPrc;
    }

    public String getPvtFrstDmrsPrc() {
        return pvtFrstDmrsPrc;
    }

    public void setPvtFrstDmrsPrc(String pvtFrstDmrsPrc) {
        this.pvtFrstDmrsPrc = pvtFrstDmrsPrc;
    }

    public String getPvtPontVal() {
        return pvtPontVal;
    }

    public void setPvtPontVal(String pvtPontVal) {
        this.pvtPontVal = pvtPontVal;
    }

    public String getPvtFrstDmspPrc() {
        return pvtFrstDmspPrc;
    }

    public void setPvtFrstDmspPrc(String pvtFrstDmspPrc) {
        this.pvtFrstDmspPrc = pvtFrstDmspPrc;
    }

    public String getPvtScndDmspPrc() {
        return pvtScndDmspPrc;
    }

    public void setPvtScndDmspPrc(String pvtScndDmspPrc) {
        this.pvtScndDmspPrc = pvtScndDmspPrc;
    }

    public String getDmrsVal() {
        return dmrsVal;
    }

    public void setDmrsVal(String dmrsVal) {
        this.dmrsVal = dmrsVal;
    }

    public String getDmspVal() {
        return dmspVal;
    }

    public void setDmspVal(String dmspVal) {
        this.dmspVal = dmspVal;
    }

    public String getCpfn() {
        return cpfn;
    }

    public void setCpfn(String cpfn) {
        this.cpfn = cpfn;
    }

    public String getRstcWdthPrc() {
        return rstcWdthPrc;
    }

    public void setRstcWdthPrc(String rstcWdthPrc) {
        this.rstcWdthPrc = rstcWdthPrc;
    }

    public String getStckFcam() {
        return stckFcam;
    }

    public void setStckFcam(String stckFcam) {
        this.stckFcam = stckFcam;
    }

    public String getStckSspr() {
        return stckSspr;
    }

    public void setStckSspr(String stckSspr) {
        this.stckSspr = stckSspr;
    }

    public String getAsprUnit() {
        return asprUnit;
    }

    public void setAsprUnit(String asprUnit) {
        this.asprUnit = asprUnit;
    }

    public String getHtsDealQtyUnitVal() {
        return htsDealQtyUnitVal;
    }

    public void setHtsDealQtyUnitVal(String htsDealQtyUnitVal) {
        this.htsDealQtyUnitVal = htsDealQtyUnitVal;
    }

    public String getLstnStcn() {
        return lstnStcn;
    }

    public void setLstnStcn(String lstnStcn) {
        this.lstnStcn = lstnStcn;
    }

    public String getHtsAvls() {
        return htsAvls;
    }

    public void setHtsAvls(String htsAvls) {
        this.htsAvls = htsAvls;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public String getPbr() {
        return pbr;
    }

    public void setPbr(String pbr) {
        this.pbr = pbr;
    }

    public String getStacMonth() {
        return stacMonth;
    }

    public void setStacMonth(String stacMonth) {
        this.stacMonth = stacMonth;
    }

    public String getVolTnrt() {
        return volTnrt;
    }

    public void setVolTnrt(String volTnrt) {
        this.volTnrt = volTnrt;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getBps() {
        return bps;
    }

    public void setBps(String bps) {
        this.bps = bps;
    }

    public String getD250Hgpr() {
        return d250Hgpr;
    }

    public void setD250Hgpr(String d250Hgpr) {
        this.d250Hgpr = d250Hgpr;
    }

    public String getD250HgprDate() {
        return d250HgprDate;
    }

    public void setD250HgprDate(String d250HgprDate) {
        this.d250HgprDate = d250HgprDate;
    }

    public String getD250HgprVrssPrprRate() {
        return d250HgprVrssPrprRate;
    }

    public void setD250HgprVrssPrprRate(String d250HgprVrssPrprRate) {
        this.d250HgprVrssPrprRate = d250HgprVrssPrprRate;
    }

    public String getD250Lwpr() {
        return d250Lwpr;
    }

    public void setD250Lwpr(String d250Lwpr) {
        this.d250Lwpr = d250Lwpr;
    }

    public String getD250LwprDate() {
        return d250LwprDate;
    }

    public void setD250LwprDate(String d250LwprDate) {
        this.d250LwprDate = d250LwprDate;
    }

    public String getD250LwprVrssPrprRate() {
        return d250LwprVrssPrprRate;
    }

    public void setD250LwprVrssPrprRate(String d250LwprVrssPrprRate) {
        this.d250LwprVrssPrprRate = d250LwprVrssPrprRate;
    }

    public String getStckDryyHgpr() {
        return stckDryyHgpr;
    }

    public void setStckDryyHgpr(String stckDryyHgpr) {
        this.stckDryyHgpr = stckDryyHgpr;
    }

    public String getDryyHgprVrssPrprRate() {
        return dryyHgprVrssPrprRate;
    }

    public void setDryyHgprVrssPrprRate(String dryyHgprVrssPrprRate) {
        this.dryyHgprVrssPrprRate = dryyHgprVrssPrprRate;
    }

    public String getDryyHgprDate() {
        return dryyHgprDate;
    }

    public void setDryyHgprDate(String dryyHgprDate) {
        this.dryyHgprDate = dryyHgprDate;
    }

    public String getStckDryyLwpr() {
        return stckDryyLwpr;
    }

    public void setStckDryyLwpr(String stckDryyLwpr) {
        this.stckDryyLwpr = stckDryyLwpr;
    }

    public String getDryyLwprVrssPrprRate() {
        return dryyLwprVrssPrprRate;
    }

    public void setDryyLwprVrssPrprRate(String dryyLwprVrssPrprRate) {
        this.dryyLwprVrssPrprRate = dryyLwprVrssPrprRate;
    }

    public String getDryyLwprDate() {
        return dryyLwprDate;
    }

    public void setDryyLwprDate(String dryyLwprDate) {
        this.dryyLwprDate = dryyLwprDate;
    }

    public String getW52Hgpr() {
        return w52Hgpr;
    }

    public void setW52Hgpr(String w52Hgpr) {
        this.w52Hgpr = w52Hgpr;
    }

    public String getW52HgprVrssPrprCtrt() {
        return w52HgprVrssPrprCtrt;
    }

    public void setW52HgprVrssPrprCtrt(String w52HgprVrssPrprCtrt) {
        this.w52HgprVrssPrprCtrt = w52HgprVrssPrprCtrt;
    }

    public String getW52HgprDate() {
        return w52HgprDate;
    }

    public void setW52HgprDate(String w52HgprDate) {
        this.w52HgprDate = w52HgprDate;
    }

    public String getW52Lwpr() {
        return w52Lwpr;
    }

    public void setW52Lwpr(String w52Lwpr) {
        this.w52Lwpr = w52Lwpr;
    }

    public String getW52LwprVrssPrprCtrt() {
        return w52LwprVrssPrprCtrt;
    }

    public void setW52LwprVrssPrprCtrt(String w52LwprVrssPrprCtrt) {
        this.w52LwprVrssPrprCtrt = w52LwprVrssPrprCtrt;
    }

    public String getW52LwprDate() {
        return w52LwprDate;
    }

    public void setW52LwprDate(String w52LwprDate) {
        this.w52LwprDate = w52LwprDate;
    }

    public String getWholLoanRmndRate() {
        return wholLoanRmndRate;
    }

    public void setWholLoanRmndRate(String wholLoanRmndRate) {
        this.wholLoanRmndRate = wholLoanRmndRate;
    }

    public String getSstsYn() {
        return sstsYn;
    }

    public void setSstsYn(String sstsYn) {
        this.sstsYn = sstsYn;
    }

    public String getStckShrnIscd() {
        return stckShrnIscd;
    }

    public void setStckShrnIscd(String stckShrnIscd) {
        this.stckShrnIscd = stckShrnIscd;
    }

    public String getFcamCnnm() {
        return fcamCnnm;
    }

    public void setFcamCnnm(String fcamCnnm) {
        this.fcamCnnm = fcamCnnm;
    }

    public String getCpfnCnnm() {
        return cpfnCnnm;
    }

    public void setCpfnCnnm(String cpfnCnnm) {
        this.cpfnCnnm = cpfnCnnm;
    }

    public String getApprchRate() {
        return apprchRate;
    }

    public void setApprchRate(String apprchRate) {
        this.apprchRate = apprchRate;
    }

    public String getFrgnHldnQty() {
        return frgnHldnQty;
    }

    public void setFrgnHldnQty(String frgnHldnQty) {
        this.frgnHldnQty = frgnHldnQty;
    }

    public String getViClsCode() {
        return viClsCode;
    }

    public void setViClsCode(String viClsCode) {
        this.viClsCode = viClsCode;
    }

    public String getOvtmViClsCode() {
        return ovtmViClsCode;
    }

    public void setOvtmViClsCode(String ovtmViClsCode) {
        this.ovtmViClsCode = ovtmViClsCode;
    }

    public String getLastSstsCntgQty() {
        return lastSstsCntgQty;
    }

    public void setLastSstsCntgQty(String lastSstsCntgQty) {
        this.lastSstsCntgQty = lastSstsCntgQty;
    }

    public String getInvtCafulYn() {
        return invtCafulYn;
    }

    public void setInvtCafulYn(String invtCafulYn) {
        this.invtCafulYn = invtCafulYn;
    }

    public String getMrktWarnClsCode() {
        return mrktWarnClsCode;
    }

    public void setMrktWarnClsCode(String mrktWarnClsCode) {
        this.mrktWarnClsCode = mrktWarnClsCode;
    }

    public String getShortOverYn() {
        return shortOverYn;
    }

    public void setShortOverYn(String shortOverYn) {
        this.shortOverYn = shortOverYn;
    }

    public String getSltrYn() {
        return sltrYn;
    }

    public void setSltrYn(String sltrYn) {
        this.sltrYn = sltrYn;
    }

    public String getMangIssuClsCode() {
        return mangIssuClsCode;
    }

    public void setMangIssuClsCode(String mangIssuClsCode) {
        this.mangIssuClsCode = mangIssuClsCode;
    }
}
