package entity.mixFeature;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/7.
 */
@Entity
@Table(name = "T_SB_SCFZSS_JCJGJ" , schema = "tcad" , catalog = "")
public class T_SB_ZWYC_DLJT {

    private int ID;
    private int SBBM;
    private String SBMC;
    private String SSXL;
    private String SSDS;
    private String YWDW;
    private Date CCRQ;
    private String TYRQ;
    private String SGDW;
    private int ZCBH;
    private String AZWZ;
    private String XB;
    private String XH;
    private String SCCJ;
    private int CCBH;
    private int SFWTJT;
    private String JTLX;
    private int TZBH;
    private String ZZDW;
    private String ZZR;
    private String ZZRZJH;
    private String JLDW;
    private String YXZT;
    private int SFFH;
    private int YWFBH;
    private String ZZGY;
    private Double ZGGZWD;
    private String BZ;
    private Date DJSJ;
    private String SBZR;
    private String YWDWMC;
    private String SSDSMC;
    private String SBZRMC;
    private String WHBZ;
    private String WHBZMC;
    private String SSFDXL;
    private String SBPBS;
    private String SBZT;
    private String SSDL;
    private int DYDJ;
    private String SSDLD;
    private int FBZT;

    //r1

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id1")
    @SequenceGenerator(name = "seq_id1" , sequenceName = "seq_id1")
    @Column(name="id", unique=true, nullable=false)
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSBBM() {
        return SBBM;
    }

    public void setSBBM(int SBBM) {
        this.SBBM = SBBM;
    }

    public String getSBMC() {
        return SBMC;
    }

    public void setSBMC(String SBMC) {
        this.SBMC = SBMC;
    }

    public String getSSXL() {
        return SSXL;
    }

    public void setSSXL(String SSXL) {
        this.SSXL = SSXL;
    }

    public String getSSDS() {
        return SSDS;
    }

    public void setSSDS(String SSDS) {
        this.SSDS = SSDS;
    }

    public String getYWDW() {
        return YWDW;
    }

    public void setYWDW(String YWDW) {
        this.YWDW = YWDW;
    }

    public Date getCCRQ() {
        return CCRQ;
    }

    public void setCCRQ(Date CCRQ) {
        this.CCRQ = CCRQ;
    }

    public String getTYRQ() {
        return TYRQ;
    }

    public void setTYRQ(String TYRQ) {
        this.TYRQ = TYRQ;
    }

    public String getSGDW() {
        return SGDW;
    }

    public void setSGDW(String SGDW) {
        this.SGDW = SGDW;
    }

    public int getZCBH() {
        return ZCBH;
    }

    public void setZCBH(int ZCBH) {
        this.ZCBH = ZCBH;
    }

    public String getAZWZ() {
        return AZWZ;
    }

    public void setAZWZ(String AZWZ) {
        this.AZWZ = AZWZ;
    }

    public String getXB() {
        return XB;
    }

    public void setXB(String XB) {
        this.XB = XB;
    }

    public String getXH() {
        return XH;
    }

    public void setXH(String XH) {
        this.XH = XH;
    }

    public String getSCCJ() {
        return SCCJ;
    }

    public void setSCCJ(String SCCJ) {
        this.SCCJ = SCCJ;
    }

    public int getCCBH() {
        return CCBH;
    }

    public void setCCBH(int CCBH) {
        this.CCBH = CCBH;
    }

    public int getSFWTJT() {
        return SFWTJT;
    }

    public void setSFWTJT(int SFWTJT) {
        this.SFWTJT = SFWTJT;
    }

    public String getJTLX() {
        return JTLX;
    }

    public void setJTLX(String JTLX) {
        this.JTLX = JTLX;
    }

    public int getTZBH() {
        return TZBH;
    }

    public void setTZBH(int TZBH) {
        this.TZBH = TZBH;
    }

    public String getZZDW() {
        return ZZDW;
    }

    public void setZZDW(String ZZDW) {
        this.ZZDW = ZZDW;
    }

    public String getZZR() {
        return ZZR;
    }

    public void setZZR(String ZZR) {
        this.ZZR = ZZR;
    }

    public String getZZRZJH() {
        return ZZRZJH;
    }

    public void setZZRZJH(String ZZRZJH) {
        this.ZZRZJH = ZZRZJH;
    }

    public String getJLDW() {
        return JLDW;
    }

    public void setJLDW(String JLDW) {
        this.JLDW = JLDW;
    }

    public String getYXZT() {
        return YXZT;
    }

    public void setYXZT(String YXZT) {
        this.YXZT = YXZT;
    }

    public int getSFFH() {
        return SFFH;
    }

    public void setSFFH(int SFFH) {
        this.SFFH = SFFH;
    }

    public int getYWFBH() {
        return YWFBH;
    }

    public void setYWFBH(int YWFBH) {
        this.YWFBH = YWFBH;
    }

    public String getZZGY() {
        return ZZGY;
    }

    public void setZZGY(String ZZGY) {
        this.ZZGY = ZZGY;
    }

    public Double getZGGZWD() {
        return ZGGZWD;
    }

    public void setZGGZWD(Double ZGGZWD) {
        this.ZGGZWD = ZGGZWD;
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ;
    }

    public Date getDJSJ() {
        return DJSJ;
    }

    public void setDJSJ(Date DJSJ) {
        this.DJSJ = DJSJ;
    }

    public String getSBZR() {
        return SBZR;
    }

    public void setSBZR(String SBZR) {
        this.SBZR = SBZR;
    }

    public String getYWDWMC() {
        return YWDWMC;
    }

    public void setYWDWMC(String YWDWMC) {
        this.YWDWMC = YWDWMC;
    }

    public String getSSDSMC() {
        return SSDSMC;
    }

    public void setSSDSMC(String SSDSMC) {
        this.SSDSMC = SSDSMC;
    }

    public String getSBZRMC() {
        return SBZRMC;
    }

    public void setSBZRMC(String SBZRMC) {
        this.SBZRMC = SBZRMC;
    }

    public String getWHBZ() {
        return WHBZ;
    }

    public void setWHBZ(String WHBZ) {
        this.WHBZ = WHBZ;
    }

    public String getWHBZMC() {
        return WHBZMC;
    }

    public void setWHBZMC(String WHBZMC) {
        this.WHBZMC = WHBZMC;
    }

    public String getSSFDXL() {
        return SSFDXL;
    }

    public void setSSFDXL(String SSFDXL) {
        this.SSFDXL = SSFDXL;
    }

    public String getSBPBS() {
        return SBPBS;
    }

    public void setSBPBS(String SBPBS) {
        this.SBPBS = SBPBS;
    }

    public String getSBZT() {
        return SBZT;
    }

    public void setSBZT(String SBZT) {
        this.SBZT = SBZT;
    }

    public String getSSDL() {
        return SSDL;
    }

    public void setSSDL(String SSDL) {
        this.SSDL = SSDL;
    }

    public int getDYDJ() {
        return DYDJ;
    }

    public void setDYDJ(int DYDJ) {
        this.DYDJ = DYDJ;
    }

    public String getSSDLD() {
        return SSDLD;
    }

    public void setSSDLD(String SSDLD) {
        this.SSDLD = SSDLD;
    }

    public int getFBZT() {
        return FBZT;
    }

    public void setFBZT(int FBZT) {
        this.FBZT = FBZT;
    }

    //r3
}
