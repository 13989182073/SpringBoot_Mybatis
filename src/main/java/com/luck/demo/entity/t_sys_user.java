package com.luck.demo.entity;

import javax.persistence.*;

@Table(name = "T_SYS_USER")
public class t_sys_user {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;

    @Column(name = "IDCARD")
    private String idcard;

    @Column(name = "LOGINNAME")
    private String loginname;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "SEX")
    private Short sex;

    @Column(name = "ORGID")
    private String orgid;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "USERTYPE")
    private String usertype;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "CREATORID")
    private String creatorid;

    @Column(name = "CREATETIME")
    private String createtime;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "LOGINIP")
    private String loginip;

    @Column(name = "LOGINTIME")
    private String logintime;

    @Column(name = "NATION")
    private String nation;

    @Column(name = "ORIGO")
    private String origo;

    @Column(name = "AGE")
    private Short age;

    @Column(name = "BIRTHDAY")
    private String birthday;

    @Column(name = "TITLEID")
    private String titleid;

    @Column(name = "POLITICALID")
    private String politicalid;

    @Column(name = "UPDATORID")
    private String updatorid;

    @Column(name = "UPDATETIME")
    private String updatetime;

    @Column(name = "ACCSTATUS")
    private Short accstatus;

    @Column(name = "UEMODEL")
    private String uemodel;

    @Column(name = "YHLY")
    private String yhly;

    @Column(name = "FID")
    private String fid;

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
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return IDCARD
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * @param idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * @return LOGINNAME
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * @param loginname
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return SEX
     */
    public Short getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * @return ORGID
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * @param orgid
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    /**
     * @return MOBILE
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return USERTYPE
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * @param usertype
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
     * @return NICKNAME
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * @return LOGINIP
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * @param loginip
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    /**
     * @return LOGINTIME
     */
    public String getLogintime() {
        return logintime;
    }

    /**
     * @param logintime
     */
    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }

    /**
     * @return NATION
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * @return ORIGO
     */
    public String getOrigo() {
        return origo;
    }

    /**
     * @param origo
     */
    public void setOrigo(String origo) {
        this.origo = origo == null ? null : origo.trim();
    }

    /**
     * @return AGE
     */
    public Short getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * @return BIRTHDAY
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * @return TITLEID
     */
    public String getTitleid() {
        return titleid;
    }

    /**
     * @param titleid
     */
    public void setTitleid(String titleid) {
        this.titleid = titleid == null ? null : titleid.trim();
    }

    /**
     * @return POLITICALID
     */
    public String getPoliticalid() {
        return politicalid;
    }

    /**
     * @param politicalid
     */
    public void setPoliticalid(String politicalid) {
        this.politicalid = politicalid == null ? null : politicalid.trim();
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
     * @return ACCSTATUS
     */
    public Short getAccstatus() {
        return accstatus;
    }

    /**
     * @param accstatus
     */
    public void setAccstatus(Short accstatus) {
        this.accstatus = accstatus;
    }

    /**
     * @return UEMODEL
     */
    public String getUemodel() {
        return uemodel;
    }

    /**
     * @param uemodel
     */
    public void setUemodel(String uemodel) {
        this.uemodel = uemodel == null ? null : uemodel.trim();
    }

    /**
     * @return YHLY
     */
    public String getYhly() {
        return yhly;
    }

    /**
     * @param yhly
     */
    public void setYhly(String yhly) {
        this.yhly = yhly == null ? null : yhly.trim();
    }

    /**
     * @return FID
     */
    public String getFid() {
        return fid;
    }

    /**
     * @param fid
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
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