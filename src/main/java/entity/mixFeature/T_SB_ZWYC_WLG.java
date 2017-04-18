package entity.mixFeature;

import javax.persistence.*;
import java.util.Date;
import java.util.Stack;

/**
 * Created by Administrator on 2017/4/7.
 */
@Entity
@Table(name = "T_SB_SCFZSS_JCJGJ" , schema = "tcad" , catalog = "")
public class T_SB_ZWYC_WLG {
    private String ID;
    private int SBBM;
    private String SBMC;
    private String XSBZ;
    private String XH;
    private String SCCJ;
    private String CCRQ;
    private int DYDJ;
    private Date TYRQ;
    private String GDFS;
    private String DX;
    private String DZ;
    private String JCTH;
    private String HDCZ;
    private String BLXBHJ;
    private int SFHX;
    private int SFZJ;
    private int SFTGJS;
    private int HBGD;
    private String DQTZ;
    private String JDXS;
    private String JDXH;
    private String JDZZTH;
    private int SJJDDZ;
    private Double TTZL;
    private String DSSG;
    private String ZGMS;
    private String GTCZ;
    private Double GG;
    private int TGJSHLS;
    private String JCXS;
    private String JDDZ;
    private String SGDW;
    private String ZCXZ;
    private String ZCDW;
    private String ZCBH;
    private String BZ;
    private Date DJSJ;
    private String SBZR;
    private String ZCDWMC;
    private String SBZRMC;
    private int FBZT;
    private String GTXZ;
    private String YWDW;
    private String WHBZ;

    //r1

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id1")
    @SequenceGenerator(name = "seq_id1" , sequenceName = "seq_id1")
    @Column(name="id", unique=true, nullable=false)
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getXSBZ() {
        return XSBZ;
    }

    public void setXSBZ(String XSBZ) {
        this.XSBZ = XSBZ;
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

    public String getCCRQ() {
        return CCRQ;
    }

    public void setCCRQ(String CCRQ) {
        this.CCRQ = CCRQ;
    }

    public int getDYDJ() {
        return DYDJ;
    }

    public void setDYDJ(int DYDJ) {
        this.DYDJ = DYDJ;
    }

    public Date getTYRQ() {
        return TYRQ;
    }

    public void setTYRQ(Date TYRQ) {
        this.TYRQ = TYRQ;
    }

    public String getGDFS() {
        return GDFS;
    }

    public void setGDFS(String GDFS) {
        this.GDFS = GDFS;
    }

    public String getDX() {
        return DX;
    }

    public void setDX(String DX) {
        this.DX = DX;
    }

    public String getDZ() {
        return DZ;
    }

    public void setDZ(String DZ) {
        this.DZ = DZ;
    }

    public String getJCTH() {
        return JCTH;
    }

    public void setJCTH(String JCTH) {
        this.JCTH = JCTH;
    }

    public String getHDCZ() {
        return HDCZ;
    }

    public void setHDCZ(String HDCZ) {
        this.HDCZ = HDCZ;
    }

    public String getBLXBHJ() {
        return BLXBHJ;
    }

    public void setBLXBHJ(String BLXBHJ) {
        this.BLXBHJ = BLXBHJ;
    }

    public int getSFHX() {
        return SFHX;
    }

    public void setSFHX(int SFHX) {
        this.SFHX = SFHX;
    }

    public int getSFZJ() {
        return SFZJ;
    }

    public void setSFZJ(int SFZJ) {
        this.SFZJ = SFZJ;
    }

    public int getSFTGJS() {
        return SFTGJS;
    }

    public void setSFTGJS(int SFTGJS) {
        this.SFTGJS = SFTGJS;
    }

    public int getHBGD() {
        return HBGD;
    }

    public void setHBGD(int HBGD) {
        this.HBGD = HBGD;
    }

    public String getDQTZ() {
        return DQTZ;
    }

    public void setDQTZ(String DQTZ) {
        this.DQTZ = DQTZ;
    }

    public String getJDXS() {
        return JDXS;
    }

    public void setJDXS(String JDXS) {
        this.JDXS = JDXS;
    }

    public String getJDXH() {
        return JDXH;
    }

    public void setJDXH(String JDXH) {
        this.JDXH = JDXH;
    }

    public String getJDZZTH() {
        return JDZZTH;
    }

    public void setJDZZTH(String JDZZTH) {
        this.JDZZTH = JDZZTH;
    }

    public int getSJJDDZ() {
        return SJJDDZ;
    }

    public void setSJJDDZ(int SJJDDZ) {
        this.SJJDDZ = SJJDDZ;
    }

    public Double getTTZL() {
        return TTZL;
    }

    public void setTTZL(Double TTZL) {
        this.TTZL = TTZL;
    }

    public String getDSSG() {
        return DSSG;
    }

    public void setDSSG(String DSSG) {
        this.DSSG = DSSG;
    }

    public String getZGMS() {
        return ZGMS;
    }

    public void setZGMS(String ZGMS) {
        this.ZGMS = ZGMS;
    }

    public String getGTCZ() {
        return GTCZ;
    }

    public void setGTCZ(String GTCZ) {
        this.GTCZ = GTCZ;
    }

    public Double getGG() {
        return GG;
    }

    public void setGG(Double GG) {
        this.GG = GG;
    }

    public int getTGJSHLS() {
        return TGJSHLS;
    }

    public void setTGJSHLS(int TGJSHLS) {
        this.TGJSHLS = TGJSHLS;
    }

    public String getJCXS() {
        return JCXS;
    }

    public void setJCXS(String JCXS) {
        this.JCXS = JCXS;
    }

    public String getJDDZ() {
        return JDDZ;
    }

    public void setJDDZ(String JDDZ) {
        this.JDDZ = JDDZ;
    }

    public String getSGDW() {
        return SGDW;
    }

    public void setSGDW(String SGDW) {
        this.SGDW = SGDW;
    }

    public String getZCXZ() {
        return ZCXZ;
    }

    public void setZCXZ(String ZCXZ) {
        this.ZCXZ = ZCXZ;
    }

    public String getZCDW() {
        return ZCDW;
    }

    public void setZCDW(String ZCDW) {
        this.ZCDW = ZCDW;
    }

    public String getZCBH() {
        return ZCBH;
    }

    public void setZCBH(String ZCBH) {
        this.ZCBH = ZCBH;
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

    public String getZCDWMC() {
        return ZCDWMC;
    }

    public void setZCDWMC(String ZCDWMC) {
        this.ZCDWMC = ZCDWMC;
    }

    public String getSBZRMC() {
        return SBZRMC;
    }

    public void setSBZRMC(String SBZRMC) {
        this.SBZRMC = SBZRMC;
    }

    public int getFBZT() {
        return FBZT;
    }

    public void setFBZT(int FBZT) {
        this.FBZT = FBZT;
    }

    public String getGTXZ() {
        return GTXZ;
    }

    public void setGTXZ(String GTXZ) {
        this.GTXZ = GTXZ;
    }

    public String getYWDW() {
        return YWDW;
    }

    public void setYWDW(String YWDW) {
        this.YWDW = YWDW;
    }

    public String getWHBZ() {
        return WHBZ;
    }

    public void setWHBZ(String WHBZ) {
        this.WHBZ = WHBZ;
    }

    //r3
}
