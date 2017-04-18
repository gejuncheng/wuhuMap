package entity.basicFeature;

import javax.persistence.*;

/**
 * Created by qq799 on 2017/3/9.
 */
@Entity
@Table(name = "tb_insert", schema = "tcad", catalog = "")
public class InsertEntity {
    private int i_id;
    private double x;
    private double y;
    private double rotation;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id")
    @SequenceGenerator(name = "seq_id" , sequenceName = "seq_id")
    @Column(name="i_id", unique=true, nullable=false)
    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
}
