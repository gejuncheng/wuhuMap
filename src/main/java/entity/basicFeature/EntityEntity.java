package entity.basicFeature;

import javax.persistence.*;

/**
 * Created by qq799 on 2017/3/9.
 */
@Entity
@Table(name = "entity", schema = "tcad", catalog = "")
public class EntityEntity {

    private  int e_id;
    private int type;
    private int handle;
    private int layerHandleCode;
    private String version;
    private int e_mode;
    private int layerHandle;
    private int color;
    private int numReactors;
    private boolean noLinks;
    private int linetypeFlags;
    private int plotstyleFlags;
    private int sizeInBits;
    private int graphicData;
    private int subEntityHandle;
    private int xDicObjHandle;
    private boolean graphicsFlag;
    private String e_comment;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_id")
    @SequenceGenerator(name = "seq_id" , sequenceName = "seq_id")
    @Column(name="e_id", unique=true, nullable=false)
    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    public int getLayerHandleCode() {
        return layerHandleCode;
    }

    public void setLayerHandleCode(int layerHandleCode) {
        this.layerHandleCode = layerHandleCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getE_mode() {
        return e_mode;
    }

    public void setE_mode(int e_mode) {
        this.e_mode = e_mode;
    }

    public int getLayerHandle() {
        return layerHandle;
    }

    public void setLayerHandle(int layerHandle) {
        this.layerHandle = layerHandle;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getNumReactors() {
        return numReactors;
    }

    public void setNumReactors(int numReactors) {
        this.numReactors = numReactors;
    }

    public boolean isNoLinks() {
        return noLinks;
    }

    public void setNoLinks(boolean noLinks) {
        this.noLinks = noLinks;
    }

    public int getLinetypeFlags() {
        return linetypeFlags;
    }

    public void setLinetypeFlags(int linetypeFlags) {
        this.linetypeFlags = linetypeFlags;
    }

    public int getPlotstyleFlags() {
        return plotstyleFlags;
    }

    public void setPlotstyleFlags(int plotstyleFlags) {
        this.plotstyleFlags = plotstyleFlags;
    }

    public int getSizeInBits() {
        return sizeInBits;
    }

    public void setSizeInBits(int sizeInBits) {
        this.sizeInBits = sizeInBits;
    }

    public int getGraphicData() {
        return graphicData;
    }

    public void setGraphicData(int graphicData) {
        this.graphicData = graphicData;
    }

    public int getSubEntityHandle() {
        return subEntityHandle;
    }

    public void setSubEntityHandle(int subEntityHandle) {
        this.subEntityHandle = subEntityHandle;
    }

    public int getxDicObjHandle() {
        return xDicObjHandle;
    }

    public void setxDicObjHandle(int xDicObjHandle) {
        this.xDicObjHandle = xDicObjHandle;
    }

    public boolean isGraphicsFlag() {
        return graphicsFlag;
    }

    public void setGraphicsFlag(boolean graphicsFlag) {
        this.graphicsFlag = graphicsFlag;
    }

    public String getE_comment() {
        return e_comment;
    }

    public void setE_comment(String e_comment) {
        this.e_comment = e_comment;
    }
}
