package com.fengdu.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 实体
 * 表名 wms_backstock
 *
 * @author william_w
 * @email 2366207000@qq.com
 * @date 2018-06-04 15:09:34
 */
public class WmsBackstockEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private String id;
    //
    private String backstockId;
    //
    private Date backdate;
    //
    private String deptId;
    //
    private String storehouseId;
    //
    private String userId;
    //
    private String remark;
    //
    private Date createdate;
    //
    private String createby;
    //
    private Date updatedate;
    //
    private String updateby;
    //
    private String enable;
    //
    private Integer sortNo;

    /**
     * 设置：
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public String getId() {
        return id;
    }
    /**
     * 设置：
     */
    public void setBackstockId(String backstockId) {
        this.backstockId = backstockId;
    }

    /**
     * 获取：
     */
    public String getBackstockId() {
        return backstockId;
    }
    /**
     * 设置：
     */
    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    /**
     * 获取：
     */
    public Date getBackdate() {
        return backdate;
    }
    /**
     * 设置：
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取：
     */
    public String getDeptId() {
        return deptId;
    }
    /**
     * 设置：
     */
    public void setStorehouseId(String storehouseId) {
        this.storehouseId = storehouseId;
    }

    /**
     * 获取：
     */
    public String getStorehouseId() {
        return storehouseId;
    }
    /**
     * 设置：
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取：
     */
    public String getUserId() {
        return userId;
    }
    /**
     * 设置：
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 设置：
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取：
     */
    public Date getCreatedate() {
        return createdate;
    }
    /**
     * 设置：
     */
    public void setCreateby(String createby) {
        this.createby = createby;
    }

    /**
     * 获取：
     */
    public String getCreateby() {
        return createby;
    }
    /**
     * 设置：
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * 获取：
     */
    public Date getUpdatedate() {
        return updatedate;
    }
    /**
     * 设置：
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    /**
     * 获取：
     */
    public String getUpdateby() {
        return updateby;
    }
    /**
     * 设置：
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }

    /**
     * 获取：
     */
    public String getEnable() {
        return enable;
    }
    /**
     * 设置：
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取：
     */
    public Integer getSortNo() {
        return sortNo;
    }
}
