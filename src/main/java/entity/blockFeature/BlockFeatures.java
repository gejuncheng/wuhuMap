package entity.blockFeature;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/3/31.
 */
@Entity
@Table(name = "blockFeatures" , schema = "tcad" , catalog = "")
public class BlockFeatures {

    private int id;
    private String name;//名称
    private int equNum;//数量

//    private int producerNo;//制作人证件号
//    private String producer;//制作人
//    private String mainLineName;//主线名称
//    private String madeCountry;//制作国家
//    private String madeEnterprise;//制作单位
//    private String totalWeight;//总重
//    private String site;//站址
//    private String importance;//重要程度
//    private int initialCurrentResistance;//阻性电流初始值(运行电压)
//    private int accuracyClassMommentProtect;//准确级(暂态保护)
//    private int accuracyClassMeasure;//准确级(测量)
//    private int accuracyClassProtect;//准确级(保护)
//    private int accuracyClass;//准确等级
//    private int DCTransmissionCapacity;//直流输送容量
//    private int DCWithstandVoltage;//直流耐压
//    private int DCCurrentAccuracyMeasurement;//直流电流测量精度
//    private int DCReferenceVoltage;//直流参考电压
//    private int impedanceVoltage;//阻抗电压
//    private Date OperationDate;//投运日期
//    private String middleCapacitorType;//中节电容器型式
//    private int middleCapacitorNo;//中节电容器编号
//    private int middleCapacitance;//中节电容量
//    private int reclosingPressure;//重合闸闭锁压力
//    private int lockingPressure;//重合闸闭锁解除操作压力
//    private String combinedDeviceName;//组合设备名称
//    private String combinedDeviceType;//组合设备类型
//    private String mainCircuitResistance;//主回路电阻
//    private String switchCombinetName;//组合电器(开关柜)名称
//    private int mainRodDepth;//主杆埋深
//    private int maxWorkTemp;//最高工作温度
//    private int maxJurisDiction;//最高调度管辖权
//    private int totalInstallCapacity;//总额定电容量
//    private int maxAllowTripTimes;//最大允许跳闸次数
//    private int maxAccidentNumber;//最大事故变位次数
//    private int floorSpace;//占地面积
//    private String terminalType;//终端类型
//    private int maxBreakCurrent;//最大开断电流
//    private int maxWorkVoltage;//最大工作电压
//    private int maxContinuousVoltage;//最大持续电压
//    private int maxContinuousCurrent;//最大持续电流
//    private int maxMoveTimes;//最大变位次数
//    private String normalOperateMode;//正常运行方式
//    private String assetNature;//资产性质
//    private String assetEnterpriseName;//资产单位名称
//    private String assetEnterprise;//资产单位
//    private String assetNo;//资产编号
//    private int specialVID;//专变ID
//    private String attendedMode;//值班方式



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id")
    @SequenceGenerator(name = "seq_id" , sequenceName = "seq_id")
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "equNum")
    public int getEquNum() {
        return equNum;
    }

    public void setEquNum(int equNum) {
        this.equNum = equNum;
    }

}
