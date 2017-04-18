package service;

import com.iver.cit.jdwglib.dwg.*;
import com.iver.cit.jdwglib.dwg.DwgObject;
import com.iver.cit.jdwglib.dwg.objects.*;
import entity.basicFeature.*;
import util.RadixConvert;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 * Created by qq799 on 2017/3/9.
 */
public class GeomResolve {

    public static List<Object> query() throws Exception {


        DwgFile dwgFile = new DwgFile("F:\\cjyb.dwg");
        dwgFile.read();

        Vector vector = dwgFile.getDwgObjects();
        List<Object> list = new ArrayList<Object>();

        for (Object obj : vector) {
            if (obj instanceof DwgMText) {
                DwgMText dwgMText = (DwgMText) obj;
                String text = convert(dwgMText.getText());
                MtextEntity mtext = new MtextEntity();
                mtext.setText(text);
                mtext.setX(dwgMText.getInsertionPoint()[0]);
                mtext.setY(dwgMText.getInsertionPoint()[1]);
                mtext.setColor(dwgMText.getColor());
                list.add(mtext);
                System.out.println("mtext:"+mtext.getText());
            } else if (obj instanceof DwgArc) {
                DwgArc dwgArc = (DwgArc) obj;
                ArcEntity arc = new ArcEntity();
                arc.setColor(dwgArc.getColor());
                arc.setX(dwgArc.getCenter()[0]);
                arc.setY(dwgArc.getCenter()[1]);
                arc.setStartAngle(dwgArc.getInitAngle());
                arc.setEndAngle(dwgArc.getEndAngle());
                arc.setRadius(dwgArc.getRadius());
                list.add(arc);
//                System.out.println("arc");
            } else if (obj instanceof DwgCircle) {
                DwgCircle dwgCircle = (DwgCircle) obj;
                CircleEntity circleEntity = new CircleEntity();
                circleEntity.setX(dwgCircle.getCenter()[0]);
                circleEntity.setY(dwgCircle.getCenter()[1]);
                circleEntity.setRadius(dwgCircle.getRadius());
                circleEntity.setColor(dwgCircle.getColor());
                list.add(circleEntity);
//                System.out.println("circle");
            } else if (obj instanceof DwgLine) {
                DwgLine dwgLine = (DwgLine) obj;
                LineEntity lineEntity = new LineEntity();
                lineEntity.setColor(dwgLine.getColor());
                lineEntity.setSx(dwgLine.getP1()[0]);
                lineEntity.setSy(dwgLine.getP1()[1]);
                lineEntity.setEx(dwgLine.getP2()[0]);
                lineEntity.setEy(dwgLine.getP2()[1]);
                System.out.println("get Color:"+lineEntity.getColor());
                list.add(lineEntity);
                System.out.println("line");
            } else if (obj instanceof DwgText) {
                DwgText dwgText = (DwgText) obj;
                TextEntity textEntity = new TextEntity();
                textEntity.setColor(dwgText.getColor());
                textEntity.setX(dwgText.getInsertionPoint().getX());
                textEntity.setY(dwgText.getInsertionPoint().getY());
                list.add(textEntity);
                System.out.println("text:"+textEntity.getText());
            } else if (obj instanceof DwgPoint) {
                DwgPoint dwgPoint = (DwgPoint) obj;
                PointEntity pointEntity = new PointEntity();
                pointEntity.setX(dwgPoint.getPoint()[0]);
                pointEntity.setY(dwgPoint.getPoint()[1]);
                pointEntity.setColor(dwgPoint.getColor());
                list.add(pointEntity);
//                System.out.println("point");
            } else if (obj instanceof DwgPolyline2D) {
                DwgPolyline2D polyline2D = (DwgPolyline2D) obj;
//                System.out.println("line");
                for (Point2D point2D : polyline2D.getPts()) {
                    System.out.println(point2D.getX() + "," + point2D.getY());
                }
            }
            else if(obj instanceof DwgBlock){
                DwgBlock dwgBlock = (DwgBlock)obj;
                BlockEntity blockEntity = new BlockEntity();
                blockEntity.setB_name(dwgBlock.getName());
                System.out.println("block name:"+dwgBlock.getName());

                list.add(blockEntity);
            }
            else if(obj instanceof DwgInsert){
                DwgInsert dwgInsert = (DwgInsert)obj;
                InsertEntity insertEntity = new InsertEntity();
                insertEntity.setX(dwgInsert.getInsertionPoint()[0]);
                insertEntity.setY(dwgInsert.getInsertionPoint()[1]);
                insertEntity.setRotation(dwgInsert.getRotation());
                list.add(insertEntity);
            }
            else  if(obj instanceof DwgBlockHeader){
                DwgBlockHeader dwgBlockHeader = (DwgBlockHeader)obj;
                BlockHeaderEntity blockHeaderEntity =new BlockHeaderEntity();
                blockHeaderEntity.setBh_name(dwgBlockHeader.getName());
                System.out.println("blockHeader name:"+dwgBlockHeader.getName());
                list.add(blockHeaderEntity);
            }
            else{
                DwgObject dwgObject =(DwgObject)obj;
//                System.out.println(dwgObject);


                EntityEntity entityEntity = new EntityEntity();
                entityEntity.setColor(dwgObject.getColor());
                entityEntity.setType(dwgObject.getType());
                entityEntity.setVersion(dwgObject.getVersion());
                entityEntity.setE_comment(obj.getClass().getName());
                list.add(entityEntity);

            }

        }
        System.out.println("size:" + list.size());
        return list;
    }

    public static void main(String[] args) throws Exception {

        List<Object> list = query();
    }


    public static String convert(String utfString) {
        utfString = utfString.replaceAll("\\\\U\\+", "\\\\u");

        StringBuilder sb = new StringBuilder();
        int i = -1;
        int pos = 0;

        while ((i = utfString.indexOf("\\u", pos)) != -1) {
            sb.append(utfString.substring(pos, i));
            if (i + 5 < utfString.length()) {
                pos = i + 6;
                sb.append((char) Integer.parseInt(utfString.substring(i + 2, i + 6), 16));
            }
        }

        return sb.toString();
    }

}
