package entity.mixFeature;

import com.vividsolutions.jts.geom.Point;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/7.
 */
@Entity
@Table(name = "T_SB_SCFZSS_JCJGJ" , schema = "tcad" , catalog = "")
public class T_SB_SCFZSS_JCJGJ {

    private int id;
    private int sbbm;
    private String sbmc;
    private String xsbz;
    private int yxbh;
    private String sscs;
    private String ywdw;
    private String whbz;
    private String dqtz;
    private String dlwz;
    private String sssdgd;
    private String jwz;
    private int jlx;
    private String jg;
    private double jmgc;
    private double ndgc;
    private double jcc;
    private String jgxz;
    private double jgcc;
    private String jgcz;
    private String jgsccj;
    private Date jgccrq;
    private int ptcs;
    private String sgdw;
    private Date sgrq;
    private Date jgrq;
    private int tzbh;
    private String zcxz;
    private String zcdw;
    private int zcbh;
    private String bz;
    private Date djsj;
    private String sbzr;
    private String ywdwmc;
    private String ssdsmc;
    private String sbzrmc;
    private String zcdwmc;
    private String whbzmc;
    private int sssblx;
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

    public String getSbmc() {
        return sbmc;
    }

    public void setSbmc(String sbmc) {
        this.sbmc = sbmc;
    }

    public String getXsbz() {
        return xsbz;
    }

    public void setXsbz(String xsbz) {
        this.xsbz = xsbz;
    }

    public int getYxbh() {
        return yxbh;
    }

    public void setYxbh(int yxbh) {
        this.yxbh = yxbh;
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

    public String getWhbz() {
        return whbz;
    }

    public void setWhbz(String whbz) {
        this.whbz = whbz;
    }

    public String getDqtz() {
        return dqtz;
    }

    public void setDqtz(String dqtz) {
        this.dqtz = dqtz;
    }

    public String getDlwz() {
        return dlwz;
    }

    public void setDlwz(String dlwz) {
        this.dlwz = dlwz;
    }

    public String getSssdgd() {
        return sssdgd;
    }

    public void setSssdgd(String sssdgd) {
        this.sssdgd = sssdgd;
    }

    public String getJwz() {
        return jwz;
    }

    public void setJwz(String jwz) {
        this.jwz = jwz;
    }

    public int getJlx() {
        return jlx;
    }

    public void setJlx(int jlx) {
        this.jlx = jlx;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public double getJmgc() {
        return jmgc;
    }

    public void setJmgc(double jmgc) {
        this.jmgc = jmgc;
    }

    public double getNdgc() {
        return ndgc;
    }

    public void setNdgc(double ndgc) {
        this.ndgc = ndgc;
    }

    public double getJcc() {
        return jcc;
    }

    public void setJcc(double jcc) {
        this.jcc = jcc;
    }

    public String getJgxz() {
        return jgxz;
    }

    public void setJgxz(String jgxz) {
        this.jgxz = jgxz;
    }

    public double getJgcc() {
        return jgcc;
    }

    public void setJgcc(double jgcc) {
        this.jgcc = jgcc;
    }

    public String getJgcz() {
        return jgcz;
    }

    public void setJgcz(String jgcz) {
        this.jgcz = jgcz;
    }

    public String getJgsccj() {
        return jgsccj;
    }

    public void setJgsccj(String jgsccj) {
        this.jgsccj = jgsccj;
    }

    public Date getJgccrq() {
        return jgccrq;
    }

    public void setJgccrq(Date jgccrq) {
        this.jgccrq = jgccrq;
    }

    public int getPtcs() {
        return ptcs;
    }

    public void setPtcs(int ptcs) {
        this.ptcs = ptcs;
    }

    public String getSgdw() {
        return sgdw;
    }

    public void setSgdw(String sgdw) {
        this.sgdw = sgdw;
    }

    public Date getSgrq() {
        return sgrq;
    }

    public void setSgrq(Date sgrq) {
        this.sgrq = sgrq;
    }

    public Date getJgrq() {
        return jgrq;
    }

    public void setJgrq(Date jgrq) {
        this.jgrq = jgrq;
    }

    public int getTzbh() {
        return tzbh;
    }

    public void setTzbh(int tzbh) {
        this.tzbh = tzbh;
    }

    public String getZcxz() {
        return zcxz;
    }

    public void setZcxz(String zcxz) {
        this.zcxz = zcxz;
    }

    public String getZcdw() {
        return zcdw;
    }

    public void setZcdw(String zcdw) {
        this.zcdw = zcdw;
    }

    public int getZcbh() {
        return zcbh;
    }

    public void setZcbh(int zcbh) {
        this.zcbh = zcbh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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

    public String getYwdwmc() {
        return ywdwmc;
    }

    public void setYwdwmc(String ywdwmc) {
        this.ywdwmc = ywdwmc;
    }

    public String getSsdsmc() {
        return ssdsmc;
    }

    public void setSsdsmc(String ssdsmc) {
        this.ssdsmc = ssdsmc;
    }

    public String getSbzrmc() {
        return sbzrmc;
    }

    public void setSbzrmc(String sbzrmc) {
        this.sbzrmc = sbzrmc;
    }

    public String getZcdwmc() {
        return zcdwmc;
    }

    public void setZcdwmc(String zcdwmc) {
        this.zcdwmc = zcdwmc;
    }

    public String getWhbzmc() {
        return whbzmc;
    }

    public void setWhbzmc(String whbzmc) {
        this.whbzmc = whbzmc;
    }

    public int getSssblx() {
        return sssblx;
    }

    public void setSssblx(int sssblx) {
        this.sssblx = sssblx;
    }

    public int getFbzt() {
        return fbzt;
    }

    public void setFbzt(int fbzt) {
        this.fbzt = fbzt;
    }

    //r3
}
