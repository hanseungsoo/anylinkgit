/*
 * 작성된 날짜: Jan 17, 2019
 * Copyright (c) 2019 TmaxSoft co., Ltd. All rights reserved.
 */
package hss.r_hss_db.l_sync_db;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              hss.r_hss_db.l_sync_db.M_DB_RESULT.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Jan 17, 2019                AnyLink 개발 :                신규 작성
 * 
 */

public class M_DB_RESULT extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public M_DB_RESULT() {
            super();
    }
    private boolean _setFlag = false;
    private int CNT;
    
    public int getCNT() {
        return CNT;
    }

    public String getCNT(boolean _masked) {
        return String.valueOf(getCNT());
    }
                      
    public void setCNT(int CNT) {
        this.CNT = CNT;
        _setFlag = true;
    }

    public void setCNT(int CNT, boolean _masked) {
        setCNT(CNT);
    }


            
    private String MSG = null;
    
    public String getMSG() {
        return MSG;
    }

    public String getMSG(boolean _masked) {
        return StringUtil.nullableStringValueOf(getMSG());
    }
                      
    public void setMSG(String MSG) {
        this.MSG = MSG;
        _setFlag = true;
    }

    public void setMSG(String MSG, boolean _masked) {
        setMSG(MSG);
    }


            
    public Object clone() {
        M_DB_RESULT copyObj = new M_DB_RESULT();    
        clone(copyObj);        
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __m_DB_RESULT) {
        M_DB_RESULT _m_DB_RESULT = (M_DB_RESULT) __m_DB_RESULT;
        _m_DB_RESULT.setCNT(CNT);
        _m_DB_RESULT.setMSG(MSG);
    }
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());

            buffer.append('\n');
            toString_0(buffer);
        
        return buffer.toString();
    }
    
    private void toString_0(StringBuilder buffer) {
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
            buffer.append("CNT : ").append(CNT).append("\n");
            buffer.append("MSG : ").append(MSG).append("\n");
    }    
    public String toString(int limit) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
        
            buffer.append('\n');
            toString_0(buffer, limit);
        
        return buffer.toString();
    }
    
    private void toString_0(StringBuilder buffer, int limit) {
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
        if(buffer.length() < limit) {
            buffer.append("CNT : ").append(CNT).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("MSG : ").append(MSG).append("\n");
        }
    }    
    private static final Map parentfieldPropertyMap = null;
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 2);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("CNT"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("MSG"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(2);
    
    static {        
        fieldNameList.add("CNT");
        fieldNameList.add("MSG");
    }
    
    public List<String> getFieldNameList(){
        return fieldNameList;
    }
    
    public boolean getSetFlag(){
        return _setFlag;
    }

    public Object get(String fieldName) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 66889 : return Integer.valueOf(getCNT());
            case 76641 : return getMSG();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 66889 : setCNT(((Integer)arg).intValue());break;
            case 76641 : setMSG((String)arg);break;
            default : return;
        }
    }
    /**
     * @param input 
     *  values of input variable are 
     *                                         physicalname
     *                                        versionno
     *                                        logicalname
     *                                        resourceid
     *                                   resourceType
     *                                   resourcePath
     *                                   resourceGroup
     * @return 
     */
    public String getMetaData(String input) {

        if (input.equalsIgnoreCase(META_PHYSICAL_NAME)) {
            return "M_DB_RESULT";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "디비_결과";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hss.r_hss_db.l_sync_db:M_DB_RESULT.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "hss.r_hss_db.l_sync_db";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)){
            return "";
        } else {
            String msg = "Expecting one of " + META_PHYSICAL_NAME + ", "
                    + META_VERSION_NO + ", " + META_LOGICAL_NAME + ", "
                    + META_RESOURCE_ID + ", " + META_RESOURCE_TYPE + ", "
                    + META_RESOURCE_PATH + ", " + META_RESOURCE_GROUP;
            throw new IllegalArgumentException(msg);
        }
    }
}
