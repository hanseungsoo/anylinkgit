/*
 * 작성된 날짜: Jan 17, 2019
 * Copyright (c) 2019 TmaxSoft co., Ltd. All rights reserved.
 */
package ssj.r_ssj_db.l_sync_db;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              ssj.r_ssj_db.l_sync_db.M_DB_DATA.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Jan 17, 2019                AnyLink 개발 :                신규 작성
 * 
 */

public class M_DB_DATA extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public M_DB_DATA() {
            super();
    }
    private boolean _setFlag = false;
    private String NAME = null;
    
    public String getNAME() {
        return NAME;
    }

    public String getNAME(boolean _masked) {
        return StringUtil.nullableStringValueOf(getNAME());
    }
                      
    public void setNAME(String NAME) {
        this.NAME = NAME;
        _setFlag = true;
    }

    public void setNAME(String NAME, boolean _masked) {
        setNAME(NAME);
    }


            
    private String JUMIN = null;
    
    public String getJUMIN() {
        return JUMIN;
    }

    public String getJUMIN(boolean _masked) {
        return StringUtil.nullableStringValueOf(getJUMIN());
    }
                      
    public void setJUMIN(String JUMIN) {
        this.JUMIN = JUMIN;
        _setFlag = true;
    }

    public void setJUMIN(String JUMIN, boolean _masked) {
        setJUMIN(JUMIN);
    }


            
    private String PHONE = null;
    
    public String getPHONE() {
        return PHONE;
    }

    public String getPHONE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getPHONE());
    }
                      
    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
        _setFlag = true;
    }

    public void setPHONE(String PHONE, boolean _masked) {
        setPHONE(PHONE);
    }


            
    public Object clone() {
        M_DB_DATA copyObj = new M_DB_DATA();    
        clone(copyObj);        
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __m_DB_DATA) {
        M_DB_DATA _m_DB_DATA = (M_DB_DATA) __m_DB_DATA;
        _m_DB_DATA.setNAME(NAME);
        _m_DB_DATA.setJUMIN(JUMIN);
        _m_DB_DATA.setPHONE(PHONE);
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
            buffer.append("NAME : ").append(NAME).append("\n");
            buffer.append("JUMIN : ").append(JUMIN).append("\n");
            buffer.append("PHONE : ").append(PHONE).append("\n");
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
            buffer.append("NAME : ").append(NAME).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("JUMIN : ").append(JUMIN).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("PHONE : ").append(PHONE).append("\n");
        }
    }    
    private static final Map parentfieldPropertyMap = null;
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 3);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("NAME"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("JUMIN"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("PHONE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(3);
    
    static {        
        fieldNameList.add("NAME");
        fieldNameList.add("JUMIN");
        fieldNameList.add("PHONE");
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
            case 2388619 : return getNAME();
            case 70949127 : return getJUMIN();
            case 76105038 : return getPHONE();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 2388619 : setNAME((String)arg);break;
            case 70949127 : setJUMIN((String)arg);break;
            case 76105038 : setPHONE((String)arg);break;
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
            return "M_DB_DATA";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "디비_데이터";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "ssj.r_ssj_db.l_sync_db:M_DB_DATA.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "ssj.r_ssj_db.l_sync_db";
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
