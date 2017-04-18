package entity.basicFeature;

import javax.persistence.*;

/**
 * Created by qq799 on 2017/3/9.
 */
@Entity
@Table(name = "line", schema = "tcad", catalog = "")
public class LineEntity {
    private int l_id;
    private Double sx;
    private Double sy;
    private Double ex;
    private Double ey;
    private Integer color;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id")
    @SequenceGenerator(name = "seq_id" , sequenceName = "seq_id")
    @Column(name="l_id", unique=true, nullable=false)
    public int getL_id() {
        return l_id;
    }

    public void setL_id(int l_id) {
        this.l_id = l_id;
    }

    @Basic
    @Column(name = "sx")
    public Double getSx() {
        return sx;
    }

    public void setSx(Double sx) {
        this.sx = sx;
    }

    @Basic
    @Column(name = "sy")
    public Double getSy() {
        return sy;
    }

    public void setSy(Double sy) {
        this.sy = sy;
    }

    @Basic
    @Column(name = "ex")
    public Double getEx() {
        return ex;
    }

    public void setEx(Double ex) {
        this.ex = ex;
    }

    @Basic
    @Column(name = "ey")
    public Double getEy() {
        return ey;
    }

    public void setEy(Double ey) {
        this.ey = ey;
    }

    @Basic
    @Column(name = "color")
    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LineEntity that = (LineEntity) o;

        if (l_id != that.l_id) return false;
        if (sx != null ? !sx.equals(that.sx) : that.sx != null) return false;
        if (sy != null ? !sy.equals(that.sy) : that.sy != null) return false;
        if (ex != null ? !ex.equals(that.ex) : that.ex != null) return false;
        if (ey != null ? !ey.equals(that.ey) : that.ey != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = l_id;
        result = 31 * result + (sx != null ? sx.hashCode() : 0);
        result = 31 * result + (sy != null ? sy.hashCode() : 0);
        result = 31 * result + (ex != null ? ex.hashCode() : 0);
        result = 31 * result + (ey != null ? ey.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
