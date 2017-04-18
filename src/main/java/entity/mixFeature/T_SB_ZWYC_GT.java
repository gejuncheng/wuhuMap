package entity.mixFeature;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/7.
 */
@Entity
@Table(name = "T_SB_ZWYC_GT" , schema = "tcad" , catalog = "")
public class T_SB_ZWYC_GT {

    private int id;
    private int sbbm;
    private String ssxl;
    private int gtbh;
    private int gtplxh;
    private String glwlgt;
    private int dydj;
    private String sscs;
    private String ywdw;
    private String ssqy;
    private String whbz;
    private String gtxz;
    private String yxzt;
    private double dj;
    private String zjfx;
    private double zjds;
    private int sfzd;
    private Date tyrq;
    private double hcg;
    private String tgxlwz;
    private int sfhx;
    private int xxjb;
    private int sfzj;
    private String bz;
    private String yybz;
    private String zxmc;
    private Date djsj;
    private String sbzr;
    private String ssdsmc;
    private String ywdwmc;
    private String whbzmc;
    private String sbzrmc;
    private int sfnw;
    private String ssfdxl;
    private String sbpbs;
    private int sfdw;
    private int fbzt;

    //r1

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id1")
    @SequenceGenerator(name = "seq_id1" , sequenceName = "seq_id1")
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSbbm() {
        return sbbm;
    }

    public void setSbbm(int sbbm) {
        this.sbbm = sbbm;
    }

    public String getSsxl() {
        return ssxl;
    }

    public void setSsxl(String ssxl) {
        this.ssxl = ssxl;
    }

    public int getGtbh() {
        return gtbh;
    }

    public void setGtbh(int gtbh) {
        this.gtbh = gtbh;
    }

    public int getGtplxh() {
        return gtplxh;
    }

    public void setGtplxh(int gtplxh) {
        this.gtplxh = gtplxh;
    }

    public String getGlwlgt() {
        return glwlgt;
    }

    public void setGlwlgt(String glwlgt) {
        this.glwlgt = glwlgt;
    }

    public int getDydj() {
        return dydj;
    }

    public void setDydj(int dydj) {
        this.dydj = dydj;
    }

    public String getSscs() {
        return sscs;
    }

    public void setSscs(String sscs) {
        this.sscs = sscs;
    }

    public String getYwdw() {
        return ywdw;
    }

    public void setYwdw(String ywdw) {
        this.ywdw = ywdw;
    }

    public String getSsqy() {
        return ssqy;
    }

    public void setSsqy(String ssqy) {
        this.ssqy = ssqy;
    }

    public String getWhbz() {
        return whbz;
    }

    public void setWhbz(String whbz) {
        this.whbz = whbz;
    }

    public String getGtxz() {
        return gtxz;
    }

    public void setGtxz(String gtxz) {
        this.gtxz = gtxz;
    }

    public String getYxzt() {
        return yxzt;
    }

    public void setYxzt(String yxzt) {
        this.yxzt = yxzt;
    }

    public double getDj() {
        return dj;
    }

    public void setDj(double dj) {
        this.dj = dj;
    }

    public String getZjfx() {
        return zjfx;
    }

    public void setZjfx(String zjfx) {
        this.zjfx = zjfx;
    }

    public double getZjds() {
        return zjds;
    }

    public void setZjds(double zjds) {
        this.zjds = zjds;
    }

    public int getSfzd() {
        return sfzd;
    }

    public void setSfzd(int sfzd) {
        this.sfzd = sfzd;
    }

    public Date getTyrq() {
        return tyrq;
    }

    public void setTyrq(Date tyrq) {
        this.tyrq = tyrq;
    }

    public double getHcg() {
        return hcg;
    }

    public void setHcg(double hcg) {
        this.hcg = hcg;
    }

    public String getTgxlwz() {
        return tgxlwz;
    }

    public void setTgxlwz(String tgxlwz) {
        this.tgxlwz = tgxlwz;
    }

    public int getSfhx() {
        return sfhx;
    }

    public void setSfhx(int sfhx) {
        this.sfhx = sfhx;
    }

    public int getXxjb() {
        return xxjb;
    }

    public void setXxjb(int xxjb) {
        this.xxjb = xxjb;
    }

    public int getSfzj() {
        return sfzj;
    }

    public void setSfzj(int sfzj) {
        this.sfzj = sfzj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getYybz() {
        return yybz;
    }

    public void setYybz(String yybz) {
        this.yybz = yybz;
    }

    public String getZxmc() {
        return zxmc;
    }

    public void setZxmc(String zxmc) {
        this.zxmc = zxmc;
    }

    public Date getDjsj() {
        return djsj;
    }

    public void setDjsj(Date djsj) {
        this.djsj = djsj;
    }

    public String getSbzr() {
        return sbzr;
    }

    public void setSbzr(String sbzr) {
        this.sbzr = sbzr;
    }

    public String getSsdsmc() {
        return ssdsmc;
    }

    public void setSsdsmc(String ssdsmc) {
        this.ssdsmc = ssdsmc;
    }

    public String getYwdwmc() {
        return ywdwmc;
    }

    public void setYwdwmc(String ywdwmc) {
        this.ywdwmc = ywdwmc;
    }

    public String getWhbzmc() {
        return whbzmc;
    }

    public void setWhbzmc(String whbzmc) {
        this.whbzmc = whbzmc;
    }

    public String getSbzrmc() {
        return sbzrmc;
    }

    public void setSbzrmc(String sbzrmc) {
        this.sbzrmc = sbzrmc;
    }

    public int getSfnw() {
        return sfnw;
    }

    public void setSfnw(int sfnw) {
        this.sfnw = sfnw;
    }

    public String getSsfdxl() {
        return ssfdxl;
    }

    public void setSsfdxl(String ssfdxl) {
        this.ssfdxl = ssfdxl;
    }

    public String getSbpbs() {
        return sbpbs;
    }

    public void setSbpbs(String sbpbs) {
        this.sbpbs = sbpbs;
    }

    public int getSfdw() {
        return sfdw;
    }

    public void setSfdw(int sfdw) {
        this.sfdw = sfdw;
    }

    public int getFbzt() {
        return fbzt;
    }

    public void setFbzt(int fbzt) {
        this.fbzt = fbzt;
    }

    //r3
}
