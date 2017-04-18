package entity.basicFeature;

import javax.persistence.*;

/**
 * Created by qq799 on 2017/3/9.
 */
@Entity
@Table(name = "arc", schema = "tcad", catalog = "")
public class ArcEntity {
    private int a_id;
    private Double x;
    private Double y;
    private Double radius;
    private Double startAngle;
    private Double endAngle;
    private Integer color;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id")
    @SequenceGenerator(name = "seq_id" , sequenceName = "seq_id")
    @Column(name="a_id", unique=true, nullable=false)
    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    @Basic
    @Column(name = "x")
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    @Basic
    @Column(name = "y")
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Basic
    @Column(name = "radius")
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Basic
    @Column(name = "startAngle")
    public Double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    @Basic
    @Column(name = "endAngle")
    public Double getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
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

        ArcEntity arcEntity = (ArcEntity) o;

        if (a_id != arcEntity.a_id) return false;
        if (x != null ? !x.equals(arcEntity.x) : arcEntity.x != null) return false;
        if (y != null ? !y.equals(arcEntity.y) : arcEntity.y != null) return false;
        if (radius != null ? !radius.equals(arcEntity.radius) : arcEntity.radius != null) return false;
        if (startAngle != null ? !startAngle.equals(arcEntity.startAngle) : arcEntity.startAngle != null) return false;
        if (endAngle != null ? !endAngle.equals(arcEntity.endAngle) : arcEntity.endAngle != null) return false;
        if (color != null ? !color.equals(arcEntity.color) : arcEntity.color != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a_id;
        result = 31 * result + (x != null ? x.hashCode() : 0);
        result = 31 * result + (y != null ? y.hashCode() : 0);
        result = 31 * result + (radius != null ? radius.hashCode() : 0);
        result = 31 * result + (startAngle != null ? startAngle.hashCode() : 0);
        result = 31 * result + (endAngle != null ? endAngle.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
