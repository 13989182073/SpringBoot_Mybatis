package com.luck.demo.entity;

import javax.persistence.*;

@Table(name = "T_SYS_ORG")
public class t_sys_org {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PID")
    private String pid;

    @Column(name = "ORGTYPE")
    private String orgtype;

    @Column(name = "ORGLEVEL")
    private String orglevel;

    @Column(name = "ORGCODE")
    private String orgcode;

    @Column(name = "UNIQUEID")
    private String uniqueid;

    @Column(name = "CREATORID")
    private String creatorid;

    @Column(name = "CREATETIME")
    private String createtime;

    @Column(name = "UPDATORID")
    private String updatorid;

    @Column(name = "UPDATETIME")
    private String updatetime;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "MAJORNAME")
    private String majorname;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "SORT")
    private Short sort;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return PID
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * @return ORGTYPE
     */
    public String getOrgtype() {
        return orgtype;
    }

    /**
     * @param orgtype
     */
    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype == null ? null : orgtype.trim();
    }

    /**
     * @return ORGLEVEL
     */
    public String getOrglevel() {
        return orglevel;
    }

    /**
     * @param orglevel
     */
    public void setOrglevel(String orglevel) {
        this.orglevel = orglevel == null ? null : orglevel.trim();
    }

    /**
     * @return ORGCODE
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * @param orgcode
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    /**
     * @return UNIQUEID
     */
    public String getUniqueid() {
        return uniqueid;
    }

    /**
     * @param uniqueid
     */
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid == null ? null : uniqueid.trim();
    }

    /**
     * @return CREATORID
     */
    public String getCreatorid() {
        return creatorid;
    }

    /**
     * @param creatorid
     */
    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    /**
     * @return CREATETIME
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * @return UPDATORID
     */
    public String getUpdatorid() {
        return updatorid;
    }

    /**
     * @param updatorid
     */
    public void setUpdatorid(String updatorid) {
        this.updatorid = updatorid == null ? null : updatorid.trim();
    }

    /**
     * @return UPDATETIME
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return MAJORNAME
     */
    public String getMajorname() {
        return majorname;
    }

    /**
     * @param majorname
     */
    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    /**
     * @return VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * @return IMAGE
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * @return SORT
     */
    public Short getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Short sort) {
        this.sort = sort;
    }
}