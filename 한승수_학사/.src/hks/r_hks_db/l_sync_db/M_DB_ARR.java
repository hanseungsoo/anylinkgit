/*
 * 작성된 날짜: Jan 17, 2019
 * Copyright (c) 2019 TmaxSoft co., Ltd. All rights reserved.
 */
package hks.r_hks_db.l_sync_db;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              hks.r_hks_db.l_sync_db.M_DB_ARR.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Jan 17, 2019                AnyLink 개발 :                신규 작성
 * 
 */

public class M_DB_ARR extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public M_DB_ARR() {
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


            
        private ArrayList<hks.r_hks_db.l_sync_db.M_DB_DATA> ARR = new ArrayList<hks.r_hks_db.l_sync_db.M_DB_DATA>();
    
    public void clearARR() {
        ARR.clear();
    }
    
    public void ensureCapacityARR(int minCapacity) {
        ARR.ensureCapacity( minCapacity );
    }
    public void createARR(int _size) {
        ARR.ensureCapacity(_size);
        for(int i = ARR.size(); i < _size; i++) {
            ARR.add(new hks.r_hks_db.l_sync_db.M_DB_DATA());
        }
    }
     public M_DB_ARR fillARR(int _index) {
        createARR(_index+1);
        return this;
    }
    
    public int sizeARR() {
        if (ARR != null)
            return ARR.size();
        else
            return 0;
    }
    
    public hks.r_hks_db.l_sync_db.M_DB_DATA[] getARR() {
        return (hks.r_hks_db.l_sync_db.M_DB_DATA[])ARR.toArray(new hks.r_hks_db.l_sync_db.M_DB_DATA[ARR.size()]);
    }
    public hks.r_hks_db.l_sync_db.M_DB_DATA getARR(int _index) {
        return ARR.get(_index);
    }
    
    public void setARR(hks.r_hks_db.l_sync_db.M_DB_DATA[] ARR) {
        this.ARR.clear();
        for(int i = 0; i < ARR.length; i++) {
            this.ARR.add(ARR[i]);
        }
        _setFlag = true;
    }
    public void setARR(int _index, hks.r_hks_db.l_sync_db.M_DB_DATA ARR) {
        this.ARR.set(_index, ARR);
        _setFlag = true;
    }
    
    public void addARR(int _index, hks.r_hks_db.l_sync_db.M_DB_DATA ARR) {
        this.ARR.add(_index, ARR);
        _setFlag = true;
    }
    public void addARR(hks.r_hks_db.l_sync_db.M_DB_DATA ARR) {
        this.ARR.add(ARR);
        _setFlag = true;
    }
    
    public hks.r_hks_db.l_sync_db.M_DB_DATA removeARR(int _index) {
        return this.ARR.remove(_index);
    }
    
    
    public Object clone() {
        M_DB_ARR copyObj = new M_DB_ARR();    
        clone(copyObj);        
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __m_DB_ARR) {
        M_DB_ARR _m_DB_ARR = (M_DB_ARR) __m_DB_ARR;
        _m_DB_ARR.setCNT(CNT);
        for (int index0 = 0; index0 < getARR().length; index0++) {
            _m_DB_ARR.addARR(index0, (hks.r_hks_db.l_sync_db.M_DB_DATA)getARR(index0).clone());
        }
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
        _size = sizeARR();
        for (int index = 0; index < _size; index++) {
                buffer.append("ARR(").append(index).append(") : ").append(getARR(index)).append(" ");
        }
                            
        
            if(_size != 0 ) {
                buffer.append("\n");
            }
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
        _size = sizeARR();
        for (int index = 0; index < _size; index++) {
            if (buffer.length() < limit) {
                buffer.append("ARR(").append(index).append(") : ").append(getARR(index)).append(" ");
            }
        }
                            
        if(buffer.length() < limit) {
        
            if(_size != 0 ) {
                buffer.append("\n");
            }
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
        fieldPropertyMap.put("ARR"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INCLUDE, -1, "CNT" , "hks.r_hks_db.l_sync_db.M_DB_DATA"));
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
        fieldNameList.add("ARR");
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
            case 65089 : return getARR();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 66889 : setCNT(((Integer)arg).intValue());break;
            case 65089 : setARR((hks.r_hks_db.l_sync_db.M_DB_DATA[])arg);break;
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
            return "M_DB_ARR";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "디비_데이터_배열";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hks.r_hks_db.l_sync_db:M_DB_ARR.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "hks.r_hks_db.l_sync_db";
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
