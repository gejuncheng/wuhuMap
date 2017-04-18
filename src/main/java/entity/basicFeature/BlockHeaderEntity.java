package entity.basicFeature;

import javax.persistence.*;

/**
 * Created by qq799 on 2017/3/9.
 */
@Entity
@Table(name = "blockHeader", schema = "tcad", catalog = "")
public class BlockHeaderEntity {
    private int bh_id;
    private String bh_name;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id")
    @SequenceGenerator(name = "seq_id" , sequenceName = "seq_id")
    @Column(name="bh_id", unique=true, nullable=false)
    public int getBh_id() {
        return bh_id;
    }

    public void setBh_id(int bh_id) {
        this.bh_id = bh_id;
    }

    public String getBh_name() {
        return bh_name;
    }

    public void setBh_name(String bh_name) {
        this.bh_name = bh_name;
    }
}
